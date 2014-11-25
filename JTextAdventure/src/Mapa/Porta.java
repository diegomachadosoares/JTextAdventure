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
public class Porta extends Mapa{
    private Sala sala1, sala2;
    private boolean isOpen;

    public Porta(Sala s1, Sala s2) {
        this.sala1 = s1;
        this.sala2 = s2;
    }
    
    public Sala outroLado(Sala sala){
        // verificar qual seria o retorno correto//
        return null;
    }
    
    @Override
    public void entrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
