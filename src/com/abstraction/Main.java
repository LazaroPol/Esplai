package com.abstraction;

import com.interfaces.Granjero;

public class Main {
    public static void main(String[] args) {

        Vaca vaca = new Vaca("muuuuu");
        vaca.comunicarse();
        Cerdo cerdo = new Cerdo("oinkoink");
        cerdo.comunicarse();
        Gallina gallina = new Gallina("kokoko");
        gallina.comunicarse();

        Granjero granjero = new Granjero();
        granjero.comunicarse();









    }
}
