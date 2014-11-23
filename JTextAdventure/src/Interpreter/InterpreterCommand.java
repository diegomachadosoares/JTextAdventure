package Interpreter;

/**
 *
 * @author diegomachado
 */
public class InterpreterCommand extends Interpreter {
    private String comando;
    
    public InterpreterCommand(){
        
    }
    
    public void setCommand(String command){
        this.comando = command;
    }
    
    public String getComamand(){
        return this.comando;
    }
    
    
}
