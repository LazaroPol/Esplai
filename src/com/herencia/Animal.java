package com.herencia;

public class Animal {
    int peso;
    String sonido;

    Animal(String sonido){
        this.sonido = sonido;
    }
    public void comunicarse(){
        System.out.println("Sonido generico");
    }
}
