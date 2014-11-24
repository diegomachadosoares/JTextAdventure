package Interpreter;

import java.util.List;

/**
 *
 * @author diegomachado
 */
public class CommandDict {
    private List<String> dict;
    
    public CommandDict(String dir){
        this.dict = DictReader.readFile(dir);
    }
    
    public boolean verificar(String palavra){
        return dict.contains(palavra);
    }
}
