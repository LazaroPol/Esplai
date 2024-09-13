package com.ejerciciodelaoca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Game {

    static HashMap<Integer, Integer> ocas;
    static boolean isTrue = true;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Player> playerList = new ArrayList<>();
        System.out.println("Cuantos jugadores sois?");
        int playerNum = Integer.parseInt(br.readLine());
        ocas = getOcas();


        for (int i = 0; i < playerNum; i++ ){
                    Player player = new Player();
                    player.setName("Player" + i);
                    player.setBlock(0);
                    player.setTurn(0);
                    playerList.add(player);
        }
        System.out.println(playerNum + " Jugadores creados");
        int casillas = 0;
        while (isTrue){

            for (Player player : playerList){

                casillas = player.getBlock() + (int) throwDice();
                player.setBlock(casillas);
                System.out.println("casilla " + player.getBlock());

                getOcas();

                if (player.getBlock() >= 63){
                    isTrue = false;
                    System.out.println("Has ganado");
                }
            }
        }
    }

    static int getPosition(int position, Player player){
        position = ocas.get(position);



        return 0;
    }

    static HashMap<Integer, Integer> getOcas() {
        HashMap<Integer, Integer> ocas = new HashMap<Integer, Integer>();
        ocas.put(5, 9);
        ocas.put(9, 14);
        ocas.put(14, 18);
        ocas.put(18, 23);
        ocas.put(23, 27);
        ocas.put(27, 32);
        ocas.put(32, 36);
        ocas.put(36, 41);
        ocas.put(41, 45);
        ocas.put(45, 50);
        ocas.put(50, 54);
        ocas.put(54, 59);
        ocas.put(59, 54);
        return ocas;
    }

    static HashMap<Integer, Integer> getPuentes() {
        HashMap<Integer, Integer> puentes = new HashMap<Integer, Integer>();
        puentes.put(6, 12);
        puentes.put(12, 6);
        return puentes;
    }

    static HashMap<Integer, Integer> getDados() {
        HashMap<Integer, Integer> dados = new HashMap<Integer, Integer>();
        dados.put(26, 53);
        dados.put(53, 26);
        return dados;
    }




    public static double throwDice() {

        return Math.floor(Math.random() * (6 - 1 + 1)) + 1;
    }
}
