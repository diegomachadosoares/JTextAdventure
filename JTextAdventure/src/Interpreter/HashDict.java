package Interpreter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author diegomachado
 */
public class HashDict {
    private static HashDict instance;
    private final Map<String,List<String>> dict;
    
    private HashDict(){
        dict = new HashMap();
    }
    
    public static HashDict getInstance(){
        if(instance == null){
            instance = new HashDict();
        }
        return instance;
    }

    public void preenche(String key, List<String> values) {
        dict.put(key, values);
    }
    
    
    
    
    
}
