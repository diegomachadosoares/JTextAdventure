package jtextadventure;

import View.Tela;
import javax.swing.JFrame;

/**
 *
 * @author diegomachado
 */
public class JTextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(800, 600);
        tela.setVisible(true);
    }
    
}
