package Interpreter;

import java.util.List;

/**
 *
 * @author diegomachado
 */
public class CommandDict {
    
    private static CommandDict commandDict;
    private final List<String> dict;
    
    public CommandDict getInstancia(){
        if(commandDict == null){
            commandDict = new CommandDict();
        }
        return commandDict;
    }
    
    private CommandDict(){
        this.dict = DictReader.readFile("command.txt");
    }
    
//    public boolean verificar(String palavra){
//        return dict.contains(palavra);
//    }
}
