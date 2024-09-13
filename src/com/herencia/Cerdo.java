package com.herencia;

public class Cerdo extends Animal{
    int kilosCarne;

     Cerdo(String sonido){
         super(sonido);

     }

    @Override
    public void comunicarse() {
        System.out.println("Cuando el cerdo tiene carne hace " + sonido);
    }
}
