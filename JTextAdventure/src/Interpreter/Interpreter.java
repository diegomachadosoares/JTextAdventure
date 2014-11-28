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
//        Acao.valueOf(acao).executar(objeto);
    public Interpreter() {
        this.hDict = HashDict.getInstance();
    }

    public void interpret(String line) {
        this.linha = line;
        //int cod = this.verifica(line);
    }

    private void setComando(String command) {
        this.comando = command;
    }

    private void setItem(String item) {
        this.item = item;
    }

    /*  Codigo de erro
        0 - Mais ou menos de duas string
        1 - Comando não encontrado
        -1 - Item não encontrado
        2 - OK
    
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
    }*/
}
