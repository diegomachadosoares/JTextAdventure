package Controller;

import Interpreter.*;
import View.Tela;
import Model.*;

public class Controller {
    Tela tela = new Tela();
    String entrada = tela.getEntradaTexto();
    String areaTexto = tela.getAreaTexto();
    Interpreter interpret = new Interpreter();
    Personagem person;
    public void mandarInterpreter(){
        int res = interpret.interpret(entrada);
        if(res == 0){
            executaAcao(entrada,person.getSalaAtual().getNumSala());
        }
    }
    public void executaAcao(String entrada, int sala){
        String aux[] = entrada.split("\\s+");
        String cmd = aux[0].toUpperCase();
        String itm = aux[1].toUpperCase();
        Acao.valueOf(cmd).executar(itm, sala);
    }
    public String mostrarNaTela(){
        return this.areaTexto +" "+ this.entrada;
    } 
    
}
