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
    private Sala salaAtual;
    private Mundo mundo;
    
    public Personagem(){
        inventario = new ArrayList<>();
        salaAtual = mundo.getSala(1);
    }
    
    public void irPara(Sala sala){
        this.salaAtual = sala;
    }
    
    public void mostrarInventario(){
        for(String elem: inventario){
            System.out.print(elem+" ");
        }
    }
    
    public boolean estaNoInventario(String item){
        return inventario.contains(item);
    }
    
    public Sala getSalaAtual(){
        return this.salaAtual;
    }
}
