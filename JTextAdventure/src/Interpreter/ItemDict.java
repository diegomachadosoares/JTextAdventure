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
    private List<String> dict;
    
    public ItemDict(String dir){
        this.dict = DictReader.readFile(dir);
    }
    
    public boolean verificar(String palavra){
        return dict.contains(palavra);
    }
}
