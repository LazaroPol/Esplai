package com.interfaces;

public abstract class Animal {
    int peso;
    String sonido;

    Animal(String sonido){
        this.sonido = sonido;
    }
    public abstract void comunicarse();
}
