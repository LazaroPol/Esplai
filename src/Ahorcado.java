import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ahorcado {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = {"pepito", "terremoto", "java", "cerdo", "pasillo"};
        double random = Math.floor(Math.random() * words.length);
        String newWord = words[(int) random];
        String wordGuiones = "";
        for (int i = 0; i < newWord.length(); i++) {
            wordGuiones += "_ ";
        }
        char[] chars = wordGuiones.toCharArray();

        while (true){
            System.out.println("Introduce una letra");
            String letter = br.readLine();

            for (int i = 0; i<wordGuiones.length(); i++){
                char letterChar = newWord.charAt(i);
                if (letterChar == letter.charAt(0)){
                    chars[i] = letterChar;
                    System.out.printf(Arrays.toString(chars));
                }
            }
            if (Arrays.toString(chars).indexOf(" ") != -1){
                System.out.println(Arrays.toString(chars));
            }

        }

//


    }
}
