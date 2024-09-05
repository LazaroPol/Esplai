import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Methods() throws IOException {
    }


    public static void main(String[] args) throws IOException {
        Methods method = new Methods();
//        method.miau();
//        method.isTrue(false);
//        method.cube(17);
//        method.km(20);
//        method.perimeter(4,10);
//        method.triangleBase(5, 6);
//        method.areaCalc(5);
//        method.perimeterCalc(6);
//        method.sum( 4, 10);
//        method.resta( 4, 10);
//        method.multi( 4, 10);
//        method.division( 4, 10);

//        String name = method.echo("Pol");
//        System.out.println("name = " + name);
//        String secondName = method.salute("Ada");
//
//        String test = method.testGreaterThan(120);
//        System.out.println("test = " + test);
//        String test2 = method.testGreaterOrEqual(30);
//        System.out.println(test2);
//        String inside = method.testLogicalOr(15);
//        System.out.println("inside = " + inside);
//        String equal = method.testEqual(12);
//        System.out.println("equal = " + equal);
//        String equal2 = method.testElse(3);
//        System.out.println("equal2 = " + equal2);
//        String ifElse = method.testElseIf(4);
//        System.out.println("ifElse = " + ifElse);
//
//        String h1 = method.hola("Selva");
//        String h2 = method.hola("Pola");
//        String x = h1 + " " + h2;
//        System.out.println("x = " + x);
//        boolean testBool = method.nand(true, false);
//        System.out.println("testBool = " + testBool);

        System.out.println("Introduce un numero");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Introduce un numero");
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("Introduce operacion");
        String op = br.readLine();
        if (op.equals("+")){
            int result = method.sum(n1, n2);
            System.out.println(result);
        }
        if (op.equals("-")){
            int result = method.resta(n1, n2);
            System.out.println(result);
        }
        if (op.equals("*")){
            int result = method.multi(n1, n2);
            System.out.println(result);
        }
        if (op.equals("/")){
            int result = method.division(n1, n2);
            System.out.println(result);
        }




    }

    public void miau() {
        System.out.println("Miaau");
    }

    public void isTrue(boolean bool) {
        if (bool) {
            System.out.println("Si, eso es cierto");
        } else {
            System.out.println("No, no es correcto");
        }

    }

    public void cube(int number) {
        int cubeNumber = number * number * number;
        System.out.println(cubeNumber);

    }

    public void km(int kmh) {
        int result = kmh * 1000;
        System.out.println(result);
    }

    public void perimeter(int height, int width) {
        int result = 2 * height + 2 * width;
        System.out.println(result);
    }

    public void triangleBase(int height, int width) {
        int base = (height * width) / 2;
        System.out.println("base = " + base);
    }

    public void perimeterCalc(int radius) {

        int perimeter = (int) (2 * 3.14 * radius);
        System.out.println("perimeter = " + perimeter);
    }

    public void areaCalc(int radius) {
        int perimeter = 2 * (radius * radius);
        System.out.println("perimeter = " + perimeter);
    }

    public  int sum(int number1, int number2) throws IOException {
        return number1 + number2;

    }

    public  int resta(int number1, int number2) throws IOException {
        return number1 - number2;

    }

    public  int multi(int number1, int number2) throws IOException {
        return number1 * number2;

    }

    public  int division(int number1, int number2) throws IOException {
        return number1 / number2;

    }

    //Echo function
    public String echo(String name) {
        return name;
    }

    public String salute(String name) {
        return "Hola " + name;
    }


    public String testGreaterThan(int val) {
        if (val > 100) {  // Cambia esta línea
            return "Por encima de 100";
        }

        if (val > 10) {  // Cambia esta línea
            return "Por encima de 10";
        }

        return "10 o menos";
    }

    public String testGreaterOrEqual(int val) {
        if (val >= 20) {  // Cambia esta línea
            return "20 or más";
        }

        if (val >= 10) {  // Cambia esta línea
            return "10 o más";
        }

        return "menos de 10";
    }

    public String testLogicalOr(int val) {
        if (val >= 10 && val <= 20) { // Cambia esta línea
            return "Inside";
        } else {
            return "Outside";
        }
    }

    public String testEqual(int val) {
        if (val == 12) { // Cambia esta línea
            return "Equal";
        }
        return "Not Equal";
    }

    public String testElse(int val) {
        String result = "";

        if (val > 5) {
            result = "Mayor que 5";
        } else {
            result = "5 más pequeño";
        }
        return result;
    }

    public String testElseIf(int val) {
        String result = "";

        if (val > 5) {
            result = "Bigger than 5";
        } else if (val < 5) {
            result = "Smaller than 5";
        } else {
            result = "Equal to 5";
        }

        return result;
    }

    public String hola(String nombre) {
        return "Hi " + nombre + "!";
    }

    public String testSize(int num) {
        if (num < 5) {
            return "Tiny";
        }
        if (num < 10) {
            return "Small";
        }
        if (num < 15) {
            return "Medium";
        }
        if (num < 20) {
            return "Large";
        }
        if (num >= 20) {
            return "Huge";
        } else {
            return "";

        }

    }
    public boolean nand(boolean bool1, boolean bool2){
        if (bool1 && bool2){
            return false;
        }else{
            return true;
        }
    }



 }

