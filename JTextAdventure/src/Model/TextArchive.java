package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diegomachado
 */
public class TextArchive {

    //Classe singleton para trabalhar com as mensagens da sala.
    private static Map<Integer, String> mensagem;
    private static TextArchive instance;

    private TextArchive() {
        mensagem = new HashMap<>();
        inicializarMensagens();
    }

    public static TextArchive getInstance() {
        if (instance == null) {
            instance = new TextArchive();
        }
        return instance;
    }

    private final String introText = "Você é um terrorista que foi capturado tentando "
        + "plantar uma bomba em uma base dos contra-terroristas.\n\n"
            +"Sua missão é escapar da base e destrui-la...\n"
            + "Obs.: Se o servidor for brasileiro, você não tem missão "
            + "basta mendigar munição e rir BrHuEhUe no chat...";
    private final String celaText = "Você se encontra em sua cela, e está estudando "
            + "suas opções.\n"
            +"A sua frente (NORTE) encontra-se a porta que é protegida por um código, a \n"
            + "sua esquerda (OESTE) e a sua direita (LESTE) encontram-se duas paredes.\n"
            +"Já é noite e os guardas estão dormindo (ou jogando em outro servidor...) \n"
            + "seria uma boa hora para utilizar o mini decodificador que você tem "
            + "dentro da sola do seu sapato.";
    private final String salaControleText = "Você chegou na sala de controle, e precisa "
            + "urgentemente cortar a comunicação do inimigo,\n"
            +"a sua frente existe uma mesa de controle onde tem um botão "
            + "verde que desliga a comunicação.\n"
            + "Você também viu uma chave sobre a mesa...  "
            +"Para o NORTE e OESTE tem apenas paredes, e para o LESTE uma passagem...";
    private final String salaArmasText = "Agora você está na sala de armas.\n"
            + "Você vê uma bomba sobre a mesa, a que você tinha quando te capturaram, "
            + "se você conseguir plantar a bomba pode utilizar a explosao como distração "
            + "para poder fugir.\n"
            +"Não há mais nada nessa sala apenas parede a NORTE e a LESTE. "
            + "O único caminho para sua fuga está ao SUL.";
    private final String salaFimText = "Você está no pátio onde ficam estacionadas as "
            + "naves, porém, apenas uma está aberta e você terá que entrar em uma para fugir...";
    private final String prisaoText1 = "Você esqueceu de pegar a chave na sala de controle "
            + "e não há mais tempo você foi preso...\n";
    private final String prisaoText2 = "Você esqueceu de pegar a chave na sala de controle "
            + "e não há mais tempo você foi preso e dessa vez será executado!\n";
    private final String endText = "Parabens! Você escapou. TERRORIST WIN!\n"
            + "OBS.: Esse jogo não é Counter Strike e nem foi baseado nele!\n"
            + "Qualquer semelhança é mera coincidência...\n"
            + "Vale notar que o mesmo não pode ser dito sobre a Al-Qaeda e seus integrantes.";
    private final String banner = ""
            + "###########################################\n"
            + "#                                         #\n"
            + "#            Contra-Ataque                #\n"
            + "#  Um jogo não baseado em Counter-Strike! #\n"
            + "#      Utilize UM comando e UMA opção     #\n"
            + "#               para jogar.               #\n"
            + "#                                         #\n"
            + "###########################################\n";
    
    public final void inicializarMensagens(){
        mensagem.put(0, introText);
        mensagem.put(1, celaText);
        mensagem.put(2, salaControleText);
        mensagem.put(3, salaArmasText);
        mensagem.put(4, salaFimText);
        mensagem.put(5, endText);
        mensagem.put(6, prisaoText2);
        mensagem.put(7, banner);
        mensagem.put(8, prisaoText1);
    }
    public String getMensagem(Integer numMsg){
        return mensagem.get(numMsg);
    }
}
