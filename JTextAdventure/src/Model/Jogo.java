package Model;

import Mapa.Mundo;
import Mapa.Parede;
import Mapa.Sala;

public class Jogo {

    Sala cela;
    Sala salaControle;
    Sala salaArmas;
    Sala fim;

    Mundo mundo;

    Personagem person;
    
    public Jogo() {
        criarMundo();
        criarSalas();
        criarParedes();
        criarPersonagem();
    }

    public void criarJogo() {
        
        String introText = "Ano 2073, a guerra entre Ases e Coringas está em seu"
                + " pior momento.\n"
                + "Você é um capitão do exército de Ases, e foi capturado ao tentar "
                + "plantar um dispositivo secreto em uma base Coringa.\n"
                + "Agora sua missão é tentar escapar da base e destrui-la";

        String endText = "Parabens! Você escapou.";

        System.out.println(introText);

        while (person.getSalaAtual().getNumSala() != salaArmas.getNumSala()) {
            
        }
    }

    private void criarMundo() {
        this.mundo = new Mundo();
        this.mundo.addSala(cela);
        this.mundo.addSala(salaControle);
        this.mundo.addSala(salaArmas);
        this.mundo.addSala(fim);
    }

    private void criarSalas() {
        this.cela = new Sala(1);//tentar escapar da cela, ao observar a sala, encontra um decodificador, que pode abrir a porta//
        this.salaControle = new Sala(2);//desabilitar comunicação, tinha pensado em executar uma ação tipo("apetar botão")//
        this.salaArmas = new Sala(3);// pegar uma bomba e plantar, para explodir//
        this.fim = new Sala(4);//caso o jogador entre em uma nave para fugir, o jogo acaba//

        this.cela.addItem("decodificador");
        this.salaControle.addItem("botao");
        this.salaArmas.addItem("bomba");
        this.fim.addItem("nave");
    }

    private void criarParedes() {
        this.cela.setLados(this.salaControle, new Parede(), new Parede(), new Parede());
        this.salaControle.setLados(new Parede(), this.cela, this.salaArmas, new Parede());
        this.salaArmas.setLados(new Parede(), this.fim, new Parede(), cela);
        this.fim.setLados(salaArmas, new Parede(), new Parede(), cela);
        
//        cela.setLado(Sala.Direcao.sul, new Parede());
//        cela.setLado(Sala.Direcao.norte, salaControle);
//        cela.setLado(Sala.Direcao.leste, new Parede());
//        cela.setLado(Sala.Direcao.oeste, new Parede());

//        salaControle.setLado(Sala.Direcao.sul, cela);
//        salaControle.setLado(Sala.Direcao.norte, new Parede());
//        salaControle.setLado(Sala.Direcao.leste, salaArmas);
//        salaControle.setLado(Sala.Direcao.oeste, new Parede());

//        salaArmas.setLado(Sala.Direcao.sul, fim);
//        salaArmas.setLado(Sala.Direcao.norte, new Parede());
//        salaArmas.setLado(Sala.Direcao.leste, new Parede());
//        salaArmas.setLado(Sala.Direcao.oeste, salaControle);

//        fim.setLado(Sala.Direcao.sul, new Parede());
//        fim.setLado(Sala.Direcao.norte, salaArmas);
//        fim.setLado(Sala.Direcao.leste, new Parede());
//        fim.setLado(Sala.Direcao.oeste, new Parede());
    }

    private void criarPersonagem() {
        this.person = new Personagem();
    }
}
