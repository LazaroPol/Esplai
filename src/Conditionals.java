import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals {
    public static void main(String[] args) throws IOException {

        //Primer ejercicio

        int examNote = 8;
        if (examNote > 5) {
            System.out.println("Aprobado");
        } else if (examNote == 5) {
            System.out.println("Aprobado por los pelos");

        } else {
            System.out.println("Suspenso");
        }

        // Segundo ejercicio

        int i = 20;
        if (i >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        if (i % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        if (i % 5 == 0) {
            System.out.println("Multiplo de 5");
        }
        if (i % 10 == 0) {
            System.out.println("Multiplo de 10");
        }
        if (i > 100) {
            System.out.println("Mayor que 100");
        } else {
            System.out.println("Menor que 100");
        }

        int b = 10;
        String result = (b > 0) ? "Es positivo" : "Es negativo";
        System.out.println("result = " + result);

        int i2 = 10;
        String result2 = (i2 % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("result2 = " + result2);

        //Caluladora

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

        if (string3.equals("+")) {

            int resultSum = num + num2;
            System.out.println(resultSum);
        }
        if (string3.equals("-")) {

            int resultRest = num - num2;
            System.out.println(resultRest);
        }
        if (string3.equals("*")) {

            int resultMult = num * num2;
            System.out.println(resultMult);
        }
        if (string3.equals("/")) {

            float resultDivision = numFloat / numFloat2;
            System.out.println(resultDivision);
        }

    }
}
