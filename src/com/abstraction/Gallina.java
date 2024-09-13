package com.abstraction;

public class Gallina extends Animal {
    int numeroDeHuevos;

    public Gallina(String sonido){
        super(sonido);
    }

    @Override
    public void comunicarse() {
        System.out.println("Cuando la gallina tiene huevos hace " + sonido);
    }
}
