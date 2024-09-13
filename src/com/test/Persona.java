package com.test;

public class Persona {
     static int numPersons;
     int age;

     Persona() {

         //En este caso, la variable static se autoincrementa en todos, la no static no.
         numPersons++;
         age++;
         System.out.println("numPersons = " + numPersons);
         System.out.println("age = " + age);
    }
}