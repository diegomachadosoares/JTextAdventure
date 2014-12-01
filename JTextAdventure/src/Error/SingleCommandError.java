package Error;

/**
 *
 * @author diegomachado
 */
public class SingleCommandError implements Error {

    private String erro;
    
    public SingleCommandError(){
        erro = "\n|===== O comando nao pode ser utilizado sem as suas opcoes! =====|"
                + "\nTente novamente!";
    }
    
    @Override
    public String treatException() {
        return erro;
    }
    
}
