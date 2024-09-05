public class StringMethods {
    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
//        sm.length("Pol");
//        sm.returnFirstLetter("Pol");
//        sm.returnLastLetter("Pol");
//        sm.devuelveEnesimaLetra("Pol", 1);
//        sm.devuelveMasLarga("Lazaro", "Rosas");
//        String string = "wonderful day";
//        System.out.println(string.substring(3, 7));
//        sm.devuelveMasLarga2("Pol", "Rosas", "Lazaro");
        sm.generarNombre("Lazaro", "Lazaro", "Lazaro");
        sm.generarNombre2("Golazo","Golazo", "Golazo");
        sm.generarNombre3("Golazo","Golazo", "Golazo");
        boolean bool = sm.tieneLetra("Lazaro", 'a');
        System.out.println(bool);
        String txt = sm.crearPalabra("c", 3);
        System.out.println(txt);
        String txt2 = sm.addGuiones("Golazo");
        System.out.println(txt2);






    }
    public void length(String string){
        System.out.println(string.length());
    }
    public void returnFirstLetter(String string){
        System.out.println(string.charAt(0));
    }
    public void returnLastLetter(String string){
        System.out.println(string.charAt(2));
    }
    public void devuelveEnesimaLetra(String string, int number){
        System.out.println(string.indexOf(string, number));
    }
    public void devuelveMasLarga(String string, String string2){
        if (string.length() > string2.length()){
            System.out.println("string = " + string);
        }
        if (string.length() == string2.length()){
            System.out.println("string = " + string);
        }
    }
    public void devuelveMasLarga2(String string, String string2, String string3){
        int s1 = string.length();
        int s2 = string2.length();
        int s3 = string3.length();

        if (s1>s2) {
            System.out.println("string = " + s1);
        }
        if (s2>s3){
            System.out.println("s2 = " + s2);
        }
        if (s3>s1){
            System.out.println("s3 = " + s3);
        }
        if (s2>s1){
            System.out.println("s2 = " + s2);
        }
        if (s1>s3){
            System.out.println("s1 = " + s1);
        }
        if (s3>s2){
            System.out.println("s3 = " + s3);
        }
        if (s1 == s2 ||  s1 == s3 || s2 == s3){
            System.out.println("Hay 2 cadenas iguales");
        }



    }
    public void generarNombre(String s1, String s2, String s3){

        if (s1.length() < 5 || s2.length() < 5 || s3.length() < 5){
            System.out.println("Error");
        }else{
            System.out.println(s1.substring(0,3) + " " + s2.substring(0, 3) + " " + s3.substring(0, 3));
        }
    }

    public void generarNombre2(String s1, String s2, String s3){

        if (s1.length() < 5 || s2.length() < 5 || s3.length() < 5){
            System.out.println("Error");
        }else{
            System.out.println(s1.charAt(5) + " " + s2.charAt(5) + " " + s3.charAt(5));
        }
    }
    public void generarNombre3(String s1, String s2, String s3){

        if (s1.length() < 5 || s2.length() < 5 || s3.length() < 5){
            System.out.println("Error");
        }else{
            System.out.println(s1.substring(3,6) + " " + s2.substring(3,6) + " " + s3.substring(3,6));
        }
    }
    public boolean tieneLetra(String string, char c){

        if (string.indexOf(c) >= 0){
            return true;
        }else{
            return false;
        }

    }
    public String crearPalabra(String c, int num){
        String word = "";
        for(int i = 0; i < num; i++){
            word+=c;
        }
        return word.toUpperCase();
    }
    // Hacer una función addGuiones que reciba como parámetro de entrada una cadena texto
    // y devuelva una nueva cadena que tendrá un guion medio detrás de cada letra.
    // Utilizar para ello un bucle for.

    // TIP: Creo un string vacio y lo relleno con el +=
    public String addGuiones(String string){
        String txt = "";
        for (int i = 0; i < string.length(); i++){
            txt += string.charAt(i) + "_";
        }
        return txt;
    }


}
