/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

/**
 *
 * @author Leonardo
 */
public class Sala extends Mapa {

    public enum Direcao {

        norte(1), sul(2), leste(3), oeste(4);
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

    public Sala(int n) {
        this.numSala = n;
    }

    public Mapa getLado(Direcao dir) {
        return lados[dir.getValor()];
    }
    
    public void setLado(Direcao dir, Mapa em){
        lados[dir.getValor()] = em;
    }

    @Override
    public void entrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
