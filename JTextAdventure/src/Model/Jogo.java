/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Mapa.Mundo;
import Mapa.Porta;
import Mapa.Sala;

/**
 *
 * @author AleGomes
 */
public class Jogo {
    public Jogo(){
    Mundo mundo = new Mundo();
    Sala sala1 = new Sala(1);
    Sala sala2 = new Sala(2);
    Sala sala3 = new Sala(3);
    Sala sala4 = new Sala(4);
    mundo.addSala(sala1);
    mundo.addSala(sala2);
    mundo.addSala(sala3);
    mundo.addSala(sala4);
    //Porta porta23 = new Porta(sala2,sala3);
    
    }
}
