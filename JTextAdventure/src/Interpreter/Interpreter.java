package Interpreter;

/**
 *
 * @author diegomachado
 */
public class Interpreter {

    private String linha;
    private String comando;
    private String item;
    private final HashDict hDict;

    public Interpreter() {
        this.hDict = HashDict.getInstance();
    }

    /*
     Codigo de erro
     0 - OK
     1 - Comando não encontrado
     -1 - Item não encontrado
     2 - Comando sem Item
     */
    public int validate(String line) {
        if(inputCleaner(line) < 0){
            return 2;
        }
        if (hDict.verificaComando(comando)) {
            if (hDict.verificaComandoItem(comando, item)) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }

    private void setComando(String command) {
        this.comando = command;
    }

    private void setItem(String item) {
        this.item = item;
    }
    
    public String getCommand(String line){
        if(inputCleaner(line) == 0){
            return comando;
        }
        return null;
    }
    
    public String getItem(String line){
        if(inputCleaner(line) == 0){
            return item;
        }
        return null;
    }
    
    private int inputCleaner(String line){
        this.linha = line;
        String aux = linha.toUpperCase();
        String tmp[] = aux.split("\\s+");
        
        if(tmp.length < 2){
            return -1;
        }
        setComando(tmp[0]);
        setItem(tmp[1]);
        return 0;
    }
}