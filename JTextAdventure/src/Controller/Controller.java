package Controller;

import Interpreter.*;
import View.Tela;

public class Controller {
    Tela tela = new Tela();
    String entrada = tela.getEntradaTexto();
    String areaTexto = tela.getAreaTexto();
    
    Interpreter interpreter = new Interpreter();
    
    public String mostrarNaTela(){
        return this.areaTexto +" "+ this.entrada;
    } 
    
}