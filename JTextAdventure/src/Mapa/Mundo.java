package Mapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Mundo {
    private List<Sala> salas;
    private static Mundo instance;

    private Mundo() {
        salas = new ArrayList();
    }
  
    public void addSala(Sala sala){
        salas.add(sala);
    }
    public Sala getSala(int num){
        return salas.get(num);
    }
    
    public static Mundo getInstance(){
        if (instance == null){
            instance = new Mundo();
        }
        return instance;
    }
    
    
}
