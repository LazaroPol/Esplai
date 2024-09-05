import java.io.IOException;

public class Competition {

        public static void main(String[] args) throws IOException {

    //        System.out.println("Hola mundo");
    //        String name = "Pol";
    //        System.out.println("name = " + name);
    //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //        String name2 = br.readLine();
    //        int num1 = Integer.parseInt(br.readLine());
    //        int num2 = Integer.parseInt(br.readLine());
    //        System.out.println(num1 + num2);
    //
            Competition comp = new Competition();
    //        comp.method(2, 2);
    //        comp.method2(2, 2);
    //        comp.method3(2, 2);
    //        comp.method4(2, 2, 2);
            boolean isTrue = false;

            while(!isTrue){
               comp.method6(5);
            }
            for (int i = 0; i <= 10; i++) {
                System.out.println("Puxa asturies");
            }
            for (int i = 0; i <= 9; i++) {
                System.out.println(i);
            }
            for (int i = 0; i <= 9; i+=2) {
                System.out.println(i);
            }
            for (int i = 0; i <= 9; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }

            }
            for (int i = 0; i <= 9; i++) {
                if (i / 3 == 0){
                    System.out.println(i);
                }

            }


        }
    public void method6(int num){
        if (num > 10 && num % 3==0){
            System.out.println("num = " + num);
        }
    }


    public int method(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public int method2(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public int method3(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public int method4(int num1, int num2, int num3){
        int result = num1 * num2 * num3;
        return result;
    }
    public void method5( int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        }
    }


}
