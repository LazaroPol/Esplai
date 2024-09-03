import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraSwitchCase {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Primer numero");
        String string = br.readLine();
        System.out.println("Segundo numero");
        String string2 = br.readLine();
        System.out.println("Operacion");
        String string3 = br.readLine();

        int num = Integer.parseInt(string);
        int num2 = Integer.parseInt(string2);
        float numFloat = Float.parseFloat(string);
        float numFloat2 = Float.parseFloat(string2);

        switch (string3){
            case "+":
                int resultSum = num + num2;
                System.out.println(resultSum);
                break;
            case "-":
                int resultRest = num - num2;
                System.out.println(resultRest);
                break;
            case "*":
                int resultMult = num * num2;
                System.out.println(resultMult);
                break;
            case "/":
                float resultFloat = numFloat / numFloat2;
                System.out.println(resultFloat);
                break;
        }
    }
}
