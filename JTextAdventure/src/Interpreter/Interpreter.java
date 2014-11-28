package Interpreter;

import Model.Acao;

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

    /*
     Codigo de erro
     0 - OK
     1 - Comando não encontrado
     -1 - Item não encontrado
     */
    public int interpret(String line) {
        this.linha = line;
        String tmp[] = linha.split("\\s+");
        String cmd = tmp[0].toUpperCase();
        String itm = tmp[1].toUpperCase();
        setComando(cmd);
        setItem(itm);
        if (hDict.verificaComando(comando)) {
            if (hDict.verificaComandoItem(comando, item)) {
                
            } else {
                return -1;
            }
        } else {
            return 1;
        }
        return 0;
    }

    private void setComando(String command) {
        this.comando = command;
    }

    private void setItem(String item) {
        this.item = item;
    }
}
