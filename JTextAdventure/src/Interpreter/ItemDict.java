package Interpreter;

import java.util.List;

/**
 *
 * @author diegomachado
 */
public class ItemDict {
    private static ItemDict itemDict;
    private final List<String> dict;
    
    private ItemDict(){
        this.dict = DictReader.readFile("item.txt");
    }
    
    public static ItemDict getInstancia(){
        if(itemDict == null){
            itemDict = new ItemDict();
        }
        return itemDict;
    }
    
    public boolean verificar(String palavra){
        return dict.contains(palavra);
    }
}
