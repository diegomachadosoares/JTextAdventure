package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diegomachado
 */
public class ItemDict {
    private static ItemDict itemDict;
    private List<String> dict;
    
    protected ItemDict(){
        this.dict = DictReader.readFile("item.txt");
    }
    
    public ItemDict getInstancia(){
        if(itemDict == null){
            itemDict = new ItemDict();
        }
        return itemDict;
    }
    
    public boolean verificar(String palavra){
        return dict.contains(palavra);
    }
}
