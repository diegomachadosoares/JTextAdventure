package Interpreter;

import java.util.List;

/**
 *
 * @author diegomachado
 */
public class CommandDict {
    
    private static ItemDict commandDict;
    private List<String> dict;
    
    public ItemDict getInstancia(){
        if(commandDict == null){
            commandDict = new ItemDict();
        }
        return commandDict;
    }
    
    public CommandDict(){
        this.dict = DictReader.readFile("command.txt");
    }
    
    public boolean verificar(String palavra){
        return dict.contains(palavra);
    }
}
