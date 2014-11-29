package Error;

/**
 *
 * @author diegomachado
 */
public class ItemCommandError implements Error {
    
    private final String erro;
    
    public ItemCommandError(){
                erro = "Esta opção não pode ser utilizada com esse comando \n"
                + "ou não existe!\n"
                + "Verifique se a grafia está correta e tente novamente...";
    }
    
    @Override
    public String treatException(){
        return erro;
    }
}
