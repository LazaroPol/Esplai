import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrayss {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] names = new String[5];
        names[0] = "Pol";
        names[1] = "Gerard";
        names[2] = "Alex";
        names[3] = "Raul";
        names[4] = "Ivan";

        int[] myList = {1, 9, 3, 8, 5, 7};

        String[] monthArray = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};


//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Conozco a alguien llamado " + names[i]);
//        }
//
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] * 2);
//        }

        Arrayss array = new Arrayss();
        int[] a1 = array.toArray(5, 9);

        int [] numbers = {1,2};
        int[] a2 = array.getFirstElement(numbers);
        System.out.println("a2 = " + a2[0]);

        int[] a3 = array.setFirstElement(numbers, 3);
        
        int a4 = array.getLastElement(numbers);
        System.out.println("a4 = " + a4);

//        System.out.println("Introduzca un numero");
//        int month = Integer.parseInt(br.readLine());
//        if (month >= 1 && month <= 12){
//            System.out.println(monthArray[month - 1]);
//        }

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int myData = arr[2][1]; // Modificar únicamente esta línea para acceder al 8 del array bidimensional
        System.out.println("myData= " + myData);

        int[] numArrays = {5 ,4 ,3 ,2 ,1, 0};

        int check = 0;
        while (check < numArrays.length){
            System.out.println("con while " + numArrays[check]);
            check++;

        }
        for (int i = 0; i< numArrays.length; i++){
            System.out.println("numArrays= "+ numArrays[i]);
        }
    }

    public int[] toArray (int num, int num2){
        int[] numbersArray = {num, num2};
        for (int i = 0; i<numbersArray.length; i++){

        }
        return numbersArray;
    }

    public int[] getFirstElement(int[] numbers){
        
        for (int i = 0; i<numbers.length; i++){
            numbers = new int[]{numbers[0]};
        }

        return numbers;
    }
    public int[] setFirstElement(int[] numbers, int num){

        for (int i = 0; i<numbers.length;i++){
            numbers[0] = num;
        }
        return numbers;
    }

    public int getLastElement(int[] numbers){
        int number = 0;
        for (int i = 0; i<numbers.length; i++){
            number = numbers[1];
        }
        return number;
    }


}
