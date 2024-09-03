public class Loops {
    public static void main(String[] args) {

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

            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");

            }
            else if (i % 5 == 0) {
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
    }
}
