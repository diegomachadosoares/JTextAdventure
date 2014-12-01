package Error;

/**
 *
 * @author diegomachado
 */
public class CommandError implements Error {
    private final String erro;
    
    public CommandError(){
        erro = "\n|===== Comando não encontrado! =====|\n"
                + "O comando não foi encontrado, "
                + "verifique se a grafia está correta "
                + "e tente novamente...";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String treatException(){
        return erro;
    }

}
