package Model;

import Mapa.Mundo;
import Mapa.Sala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AleGomes
 */
public class Personagem {
    private List<String> inventario;
    private List<String> usados;
    private Sala salaAtual;
    private Mundo mundo;
    private static Personagem p;
    private int preso = 0;
    
    private Personagem(){
        inventario = new ArrayList<>();
        usados = new ArrayList<>();
        mundo = Mundo.getInstance();
        salaAtual = mundo.getSala(0);
    }
    
    public static Personagem getPersonagem(){
        if(p == null){
            p = new Personagem();
        }
        return p;
    }
    
    public void irPara(int numSala){
        this.salaAtual = mundo.getSala(numSala -1);
    }
    
    public void mostrarInventario(){
        for(String elem: inventario){
            System.out.print(elem+" ");
        }
    }
    
    public boolean estaNoInventario(String item){
        return inventario.contains(item);
    }
    public boolean estaNoUsados(String item){
        return usados.contains(item);
    }
    public void addInventario(String item){
        inventario.add(item);
    }
    public void addUsados(String item){
        usados.add(item);
    }
    public Sala getSalaAtual(){
        return this.salaAtual;
    }
    
    public void setPreso(){
        this.preso = 1;
    }
    
    public int getPreso(){
        return this.preso;
    }
    
    public void resetAttr(){
        inventario.clear();
        usados.clear();
    }
}
