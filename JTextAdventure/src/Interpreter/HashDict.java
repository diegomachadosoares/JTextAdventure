package Interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author diegomachado
 */
public class HashDict {
    private static HashDict instance;
    private final Map<String,String> dict;
    private final List<String> rawDict;
    
    private HashDict(){
        dict = new HashMap();
        rawDict = DictReader.readFile("entrada.txt");
        preencheHash(rawDict);
    }
    
    public static HashDict getInstance(){
        if(instance == null){
            instance = new HashDict();
        }
        return instance;
    }

    private void preencheHash(List<String> rawDict) {
        String linha;
        String tmp[];
        
        Iterator iterator = rawDict.iterator();

        while (iterator.hasNext()) {
            linha = (String)iterator.next();
            tmp = linha.split("\\s+");
            
            dict.put(tmp[0], tmp[1]);
        }
    }
    
    public boolean verificaComando(String comando){
        if(dict.containsKey(comando)){
            return true;
        }
        return false;
    }
    
    public boolean verificaComandoItem(String comando, String item){
        String itemList = dict.get(comando);
        String itemListTemp[] = itemList.split(",");
        for(String itemAux : itemListTemp){
            if(itemAux.equals(item)){
                return true;
            }
        }   
        return false;
    }
}
