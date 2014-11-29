package Error;

/**
 *
 * @author diegomachado
 */
public class CommandError implements Error {
    private final String erro;
    
    public CommandError(){
        erro = "Comando não encontrado!\n"
                + "O comando não foi encontrado, "
                + "verifique se a grafia está correta"
                + "etente novamente...";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getError(){
        return erro;
    }

}
