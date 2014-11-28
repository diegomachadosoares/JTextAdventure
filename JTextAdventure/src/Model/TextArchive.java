package Model;

import Interpreter.DictReader;
import Interpreter.HashDict;
import Mapa.Sala;
import java.util.HashMap;
import java.util.Map;
import Mapa.Mundo;

/**
 *
 * @author Leonardo
 */
public class TextArchive {

    //Classe singleton para trabalhar com as mensagens da sala.
    private static Map<Sala, String> mensagemSala;
    private static TextArchive instance;

    private TextArchive() {
        mensagemSala = new HashMap<>();
        associarMensagemSala();
    }

    public static TextArchive getInstance() {
        if (instance == null) {
            instance = new TextArchive();
        }
        return instance;
    }

    private String introText = "Ano 2073, a guerra entre Ases e Coringas está em seu"
        + " pior momento.\n"
            +"Você é um capitão do exército de Ases, e foi capturado ao tentar "
        + "plantar um dispositivo secreto em uma base Coringa.\n"
            +"Agora sua missão é tentar escapar da base e destrui-la";
    private String celaText = "Você se encontra em sua cela, e está estudando "
            + "suas opções.\n"
            +"A sua frente encontra-se a porta que é protegida por um código, a "
            + "sua esquerda(oeste)encontra-se uma parede, igualmente para o lado "
            + "direito(leste)."
            +"Porém quando estava quase desistindo, você se lembra que tem um "
            + "mini decodificador dentro da sola de seu sapato.";
    private String salaControleText = "Você chegou a sala de controle, e precisa "
            + "urgentemente cortar a comunicação do inimigo,\n"
            +"para isso a oeste existe uma mesa de controle onde tem um botão "
            + "verde que desliga automaticamente a comunicação.\n"
            +"para o norte tem apenas uma parede, e para o leste tem uma passagem "
            + "para a próxima sala.";
    private String salaArmasText = "Agora você está na sala de armas, seu próximo "
            + "passo é pegar uma bomba e plantar na nave, para em seguida poder fugir.\n"
            +"Depois de plantar a bomba você terá uma parede a norte e a leste. "
            + "O caminho mais rapido para sua fuga está a sul.";
    private String salaFimText = "Você está na parte final, agora no pátio de "
            + "naves e terá que roubar uma para fugir, depois que fizer isso estará livre.";
    
    public void associarMensagemSala(){
        Mundo mundo = new Mundo();
        mensagemSala.put(mundo.getSala(1), introText);
        mensagemSala.put(mundo.getSala(2), celaText);
        mensagemSala.put(mundo.getSala(3), salaControleText);
        mensagemSala.put(mundo.getSala(4), salaArmasText);
        mensagemSala.put(mundo.getSala(5), salaFimText);
    }
    public static String getMensagem(Sala sala){
        return mensagemSala.get(sala);
    }
}
