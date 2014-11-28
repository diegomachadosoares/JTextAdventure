/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public Personagem(){
        inventario = new ArrayList<>();
        salaAtual = mundo.getSala(1);
    }
    
    public void irPara(int numSala){
        this.salaAtual = mundo.getSala(numSala);
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
}
