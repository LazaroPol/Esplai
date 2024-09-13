package com.ejercicioalumnos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main extends Alumno{

    static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Main main = new Main();
    static boolean isNotFinished = true;

    public static void main(String[] args) throws IOException {

        while (isNotFinished){
            System.out.println("Que operacion quieres hacer?");
            int operation = Integer.parseInt(br.readLine());

            if (operation == 1){
                System.out.println("Inserta el nombre del alumno");
                String name = br.readLine();
                System.out.println("Inserta la edad del alumno");
                int age = Integer.parseInt(br.readLine());
                Alumno alumnoAñadido = new Alumno();

                alumnoAñadido.setName(name);
                alumnoAñadido.setAge(age);
                listaAlumnos.add(alumnoAñadido);
            }

            if (operation == 2){

                System.out.println("Introduce el nombre que quieres modificar");
                String oldName = br.readLine();
                System.out.println("Introduce el nuevo nombre");
                String newName = br.readLine();

                listaAlumnos.forEach(alumno -> {

                    String nameChecker = alumno.getName();
                    if (nameChecker.equals(oldName)){
                        alumno.setName(newName);
                    }
                });
            }
            if (operation == 3){

                System.out.println("Introduce el nombre que quieres eliminar");
                String nameToDelete = br.readLine();
                Iterator<Alumno> iterator = listaAlumnos.iterator();
                while(iterator.hasNext()){
                    Alumno alumnoBorrado = iterator.next();
                    if (alumnoBorrado.getName().equals(nameToDelete)){
                        iterator.remove();

                    }
                }
                System.out.println("Nombre eliminado " + nameToDelete);
            }
            System.out.println("Lista de alumnos " + getAllAlumnos(listaAlumnos));

            System.out.println("Has acabado?");
            String response = br.readLine();
            if (response.equals("Si")){
                isNotFinished = false;
                System.out.println("Has acabado las operaciones");
            }
        }
    }
    public static ArrayList<Alumno> getAllAlumnos(ArrayList<Alumno> listaAlumnos){
        listaAlumnos.forEach(alumno -> alumno.getName());
        return listaAlumnos;
    }
}
