package Interpreter;

import java.util.List;

/**
 *
 * @author diegomachado
 */
public class Interpreter {
    
    private String linha;
    private String comando;
    private String item;
    private CommandDict cDict;
    ItemDict iDict;
    
    
    public Interpreter(){
        this.cDict = CommandDict.getInstancia();
        this.iDict = ItemDict.getInstancia();
    }
    
    public void interpret(String line){
        String tmp[] = line.split("\\s+");
        this.setComando(tmp[0]);
        for (int i = 0; i < tmp.length; i++) {
            item.add(tmp[i]);
        }
        if(cDict.verificar(comando)){
            if(iDict.verificar(item.get(0))){
                
            }
        }
    }

    private void setComando(String command) {
        this.comando = command;
    }

    private void setItem(String item) {
        this.item = item;
    }
    
}
