package Controller;

import Error.CommandError;
import Error.ItemCommandError;
import Error.SingleCommandError;
import Interpreter.*;
import Model.*;
import java.util.Scanner;

public class Controller {
    private final Interpreter interpreter;
    private final Personagem person;
    private final TextArchive txt;
    private final Jogo jogo;
    private final Scanner leitor;
    private boolean terminou=false;
    
    public Controller(){
        interpreter = new Interpreter();
        txt = TextArchive.getInstance();
        jogo = new Jogo();
        person = Personagem.getPersonagem();
        mostrarNaTela(txt.getMensagem(7));
        mostrarNaTela(txt.getMensagem(0));
        leitor = new Scanner(System.in);
        gameLoop();
    }
    
    public final void gameLoop(){
        while(!terminou){
            mostrarNaTela(txt.getMensagem(person.getSalaAtual().getNumSala()));
            System.out.println("");
            System.out.print(">");
            String entrada = leitor.nextLine();
            if(validar(entrada)){
                executaAcao(interpreter.getCommand(entrada), interpreter.getItem(entrada), person.getSalaAtual().getNumSala());
            }
        }
    }
    
    public boolean validar(String entrada){
        int res = interpreter.validate(entrada);
        if(res == 0){
            return true;
        } else if(res == 1){
            CommandError ec = new CommandError();
            String e = ec.treatException();
            mostrarNaTela(e);
        } else if(res == -1){
            ItemCommandError eic = new ItemCommandError();
            String e = eic.treatException();
            mostrarNaTela(e);
        } else if(res == 2){
            SingleCommandError sce = new SingleCommandError();
            String e = sce.treatException();
            mostrarNaTela(e);
        }
        return false;
    }
    public void executaAcao(String comando, String item, int sala){
        String resposta = Acao.valueOf(comando).executar(item, sala, person);
        if(resposta.contentEquals("FIM")){
            mostrarNaTela(txt.getMensagem(5));
            person.irPara(5);
            terminou=true;
        }else if(resposta.contentEquals("FIM2")){
            mostrarNaTela("O jogo foi terminado!");
            terminou=true;
        }else if(resposta.contentEquals("REINICIO")){
            mostrarNaTela(txt.getMensagem(8));
            terminou = false;
        } else if(resposta.contentEquals("FIM3")){
            mostrarNaTela(txt.getMensagem(6));
            terminou=true;
        }else{
            mostrarNaTela(resposta);
        }
    }
    public final void mostrarNaTela(String string){
        System.out.println("");
        System.out.println(string);
        System.out.println("");
    }
    
}
