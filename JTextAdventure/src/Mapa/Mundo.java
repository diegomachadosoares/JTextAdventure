/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Mundo {
    List<Sala> salas;

    public Mundo() {
        
    }
  
    public void addSala(Sala sala){
        salas.add(sala);
    }
    public Sala getSala(int num){
        return salas.get(num);
    }
    
    
}
