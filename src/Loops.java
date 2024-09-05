import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {

        //Primer ejercicio

        for (int i = 0; i <= 100; i += 2) {
            System.out.println("i = " + i);

        }

        //Segundo ejercicio
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }

        }
        //FizzBuzz
        for (int i = 0; i < 20; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }

        //Tabla del 7

        for (int i = 0; i <= 9; i++) {
            System.out.println("7 * " + i + " = " + 7 * i);
        }

        // Tabla del 1 al 9

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int r = i * j;
                System.out.println(i + " * " + j + "=" + r);
            }

        }

        // DO WHILE

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isTrue = false;

      /*  while (isTrue) {

            System.out.println("Introduce tu nombre");
            String name = br.readLine();
            if (!name.equals("")) {
                System.out.println("Los datos son correctos");
                String response = br.readLine();
                if (response.equals("Si")) {
                    System.out.println("Puedes seguir con el examen");
                    isTrue = true;
                    if (response.equals("No")) {
                        System.out.println("Introduce tu nombre");
                        br.readLine();
                    }
                } else {
                    System.out.println("Error");
                }
            }
*/


        //Ejercicio 2


        while (!isTrue) {
            System.out.println("Introduce un numero");
            int number = Integer.parseInt(br.readLine());
            int count = 0;
            if (number != -1) {
                count++;
            }
                if (number == -1) {
                    isTrue = true;
                    System.out.println(count);
                }
            }
        }


    }

