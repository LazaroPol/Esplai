package com.abstraction;

import com.herencia.Comunicable;

public abstract class Animal implements Comunicable {
    int peso;
    String sonido;

    Animal(String sonido){
        this.sonido = sonido;
    }

}
