package Erro;

/**
 *
 * @author diegomachado
 */
public class ErroCommand {
    private String erro;
    
    public ErroCommand(){
        erro = "Comando não encontrado!\n"
                + "O comando não foi encontrado, "
                + "verifique se a grafia está correta"
                + "etente novamente...";
    }
    
    public String getError(){
        return erro;
    }
}
