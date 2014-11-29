package Controller;

import Error.CommandError;
import Error.ItemCommandError;
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
        } else if(res == 1){
            CommandError ec = new CommandError();
            String e = ec.treatException();
            tela.setAreaTexto(e);
        } else if(res == -1){
            ItemCommandError eic = new ItemCommandError();
            String e = eic.treatException();
            tela.setAreaTexto(e);
        }
    }
    public void executaAcao(String entrada, int sala){
        String aux[] = entrada.split("\\s+");
        String cmd = aux[0].toUpperCase();
        String itm = aux[1].toUpperCase();
        String resposta = Acao.valueOf(cmd).executar(itm, sala);
        if(resposta.contentEquals("FIM")){
            tela.setAreaTexto("Você usou a nave com SUCESSO!\n Parabéns o jogo terminou!!");
            person.irPara(5);
        }else{
            tela.setAreaTexto(resposta);
        }
    }
    public String mostrarNaTela(){
        return this.areaTexto +" "+ this.entrada;
    } 
    
}
