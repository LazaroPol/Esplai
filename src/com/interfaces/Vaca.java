package com.interfaces;

public class Vaca extends Animal {
    int litrosLeche;

     Vaca(String sonido){
         super(sonido);
    }

    @Override
    public void comunicarse() {
        System.out.println("Cuando la vaca tiene leche hace " + sonido);
    }
}
