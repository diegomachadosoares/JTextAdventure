package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictReader {
    
    public static List readFile(String dir) {
        List<String> dict = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            String palavra;
            while ((palavra = br.readLine()) != null) {
                dict.add(palavra);
            }
        } catch (IOException e) {
            
        }
        return dict;
    }
}
