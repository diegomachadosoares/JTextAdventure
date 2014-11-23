package Interpreter;

/**
 *
 * @author diegomachado
 */
public class Interpreter {
    
    private String linha;
    private String comando;
    private String item;
    
    public Interpreter(){
        InterpreterCommand iCommand = new InterpreterCommand();
        InterpreterItem iItem = new InterpreterItem();
        
    }
    
    public void interpret(String line){
        String tmp[] = line.split("\\s+");
        this.setComando(tmp[0]);
        this.setItem(tmp[1]);
        
    }

    public void setComando(String command) {
        this.comando = command;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
}
