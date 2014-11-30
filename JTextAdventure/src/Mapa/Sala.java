/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Sala extends Mapa {

    public enum Direcao {

        norte(0), sul(1), leste(2), oeste(3);
        private final int valor;

        Direcao(int val) {
            this.valor = val;
        }
        public int getValor(){
            return valor;
        }
    };
    //lados da sala//
    private final Mapa[] lados = new Mapa[4];

    private int numSala;
    private List<String> itens;

    public Sala(int n) {
        this.numSala = n;
        itens = new ArrayList();
    }

    public Mapa getLado(Direcao dir) {
        return lados[dir.getValor()];
    }
    
    public int getNumSala(){
        return this.numSala;
    }
    
    public void setLado(Direcao dir, Mapa em){
        lados[dir.getValor()] = em;
    }
    
    public void setLados(Mapa norte, Mapa sul, Mapa leste, Mapa oeste){
            lados[Direcao.norte.getValor()] = norte;
            lados[Direcao.sul.getValor()] = sul;
            lados[Direcao.leste.getValor()] = leste;
            lados[Direcao.oeste.getValor()] = oeste;
    }
    
    public void addItem(String objeto){
        itens.add(objeto);
    }

    @Override
    public void entrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
