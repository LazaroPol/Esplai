import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
    int number = 15;
    String text = "test";
    double doubleNumber = 15.5;

        int a;
        a = 7;
        int b = a; // Sólo hay que modificar esta línea
        System.out.println(b); // debería mostrar 7


        String tituloDeLaPelicula;
        String camelCaseBienPuesto;
        int edadDelMonstruo;

        int i = 7;
        i = 5;
        i = 3;
        System.out.println(i); // ¿Cuánto valdrá i?

        int iTest = 2;
        double dTest = 5.5;
        char cTest = 'c';


        System.out.println("cTest = " + cTest);
        System.out.println("dTest = " + dTest);
        System.out.println("iTest = " + iTest);

        int aTest= 5;
        int bTest = 7;
        int cTest2 = aTest;

        aTest = bTest;
        bTest = cTest2;


        System.out.println(aTest); //Debería mostrar 7
        System.out.println(bTest); //Debería mostrar 5

        String name = "Jose";
        System.out.println("Buenas tardes " + name);

        String textOne = "Este es el principio";
        String textTwo = "Este es el final";

        System.out.println(textOne + " " + textTwo);

        int euros = 7;
        int dolares = euros * 2;
        System.out.println("dolares = " + dolares);

        float precio = 100;
        float precioConIva = precio + precio/21;
        System.out.println("precioConIva = " + precioConIva);

        int width = 4;
        int heigth = 7;
        
        int rectangleArea = width * heigth;

        System.out.println("rectangleArea = " + rectangleArea);

        float centigrados= 20f;
        float fahrenheit= centigrados * 9/5 + 32;
        System.out.println(fahrenheit); // Debería mostrar 68

        String nombre = "Juan";
        String material = "madera";
        String dimensiones = "diminutas";
        String comentario = "Que sea bonita, pero de una belleza estraña, indómita";

        System.out.println(nombre + " " + "ha pedido una caja de" + " " + material + " con unas dimensiones" + " " + dimensiones + " " + comentario);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduza x euros para pasar a dolares: ");
        String txt = bufferedReader.readLine();

        int n = Integer.parseInt(txt);
        System.out.println("n= " + n * 2);


        System.out.println("Introduzca un numero para calcular el iva, por favor: ");
        String txt2 = bufferedReader.readLine();

        int n2 = Integer.parseInt(txt2);
        System.out.println(n2 + n2/21);


        System.out.println("Introduzca un numero para hacer el doble y triple: ");
        String txt3 = bufferedReader.readLine();

        int n3 = Integer.parseInt(txt3);
        System.out.println(n3*2);
        System.out.println(n3*3);


        System.out.println("Introduzca ancho");
        String txt4 = bufferedReader.readLine();
        System.out.println("Introduzca alto : ");
        String txt5 = bufferedReader.readLine();

        int n4 = Integer.parseInt(txt4);
        int n5 = Integer.parseInt(txt5);
        System.out.println("area = " + n4 * n5);

        String txt6 = bufferedReader.readLine();
        float fahrenheit2 = Float.parseFloat(txt6);
        System.out.println("n6 = " + (fahrenheit2 * 9f/5f) + 32f);

        System.out.println("[nombre] ha pedido una caja de [material] con unas dimensiones [dimensiones]. [comentario]. ");
        String name2 = bufferedReader.readLine();
        String material2 = bufferedReader.readLine();
        String dimensions = bufferedReader.readLine();
        String commentary = bufferedReader.readLine();

        System.out.println(name2 + " " + "ha pedido una caja de " + material2 + " " + "con unas dimensiones " + dimensions + " " +commentary);





    }
}