package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictReader {

    public static void readFile(String dir) {

        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            List<String> itens = new ArrayList<>();
            HashDict hash;
            String tmp[], tmp2[];
            String linha;
            hash = HashDict.getInstance();
            while ((linha = br.readLine()) != null) {
                //Separa por espaco
                tmp = linha.split("\\s+");
                //Separa por virgula
                tmp2 = tmp[1].split(",");
                for (int i = 0; i < tmp2.length; i++) {
                    //Preenche lista de itens
                    itens.add(tmp2[i]);
                }
                //Preenche hash de acoes e itens
                hash.preenche(tmp[0], itens);
            }
        } catch (IOException e) {

        }
    }
}
