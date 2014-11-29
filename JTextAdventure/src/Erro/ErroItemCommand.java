package Erro;

/**
 *
 * @author diegomachado
 */
public class ErroItemCommand {
    
    private String erro;
    
    public ErroItemCommand(){
                erro = "Esse item/direção opção não pode ser utilizada com esse comando\n"
                + "ou não existe!\n"
                + "Verifique se a grafia está correta etente novamente...";
    }
    
    public String getError(){
        return erro;
    }
}
