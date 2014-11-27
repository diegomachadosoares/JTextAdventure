package Interpreter;

/**
 *
 * @author diegomachado
 */
public class Interpreter {

    private String linha;
    private String comando;
    private String item;
    private final CommandDict cDict;
    private final ItemDict iDict;

    public Interpreter() {
        this.cDict = CommandDict.getInstancia();
        this.iDict = ItemDict.getInstancia();
    }

    public void interpret(String line) {
        this.linha = line;
        int cod = this.verifica(line);
    }

    private void setComando(String command) {
        this.comando = command;
    }

    private void setItem(String item) {
        this.item = item;
    }

    private int verifica(String line) {
        String tmp[] = linha.split("\\s+");
        if (tmp.length != 2) {
            return 0;
        }
        this.setComando(tmp[0]);
        this.setItem(tmp[1]);
        //Comando não encontrado!
        if (!cDict.verificar(comando)) {
            return 1;
        }
        //Item não encontrado!
        if (!iDict.verificar(item)) {
            return -1;
        }
        return 2;
    }
}
