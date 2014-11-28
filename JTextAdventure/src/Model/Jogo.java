package Model;

import Mapa.Mundo;
import Mapa.Porta;
import Mapa.Sala;

/**
 *
 * @author AleGomes
 */
public class Jogo {
    public Jogo(){
    Mundo mundo = new Mundo();
    Sala cela = new Sala(1);//tentar escapar da cela, ao observar a sala, encontra um decodificador, que pode abrir a porta//
    Sala salaControle = new Sala(2);//desabilitar comunicação, tinha pensado em executar uma ação tipo("apetar botão")//
    Sala salaArmas = new Sala(3);// pegar uma bomba e plantar, para explodir//
    Sala fim = new Sala(4);//caso o jogador entre em uma nave para fugir, o jogo acaba//
    mundo.addSala(cela);
    mundo.addSala(salaControle);
    mundo.addSala(salaArmas);
    mundo.addSala(fim);
    cela.addItem("decodificador");
    salaControle.addItem("botao");
    salaArmas.addItem("bomba");
    fim.addItem("nave");
    //Porta porta23 = new Porta(sala2,sala3);
    
    }
}
