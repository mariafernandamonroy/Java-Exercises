package com.sofkau.exercises;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean salir = false;

        Scanner scanner = new Scanner(System.in);
        One_num_comparison one_num_comparison = new One_num_comparison();

        while(!salir){
            System.out.print("Ingrese el número del ejercicio que desea probar: : \n" +
                    "1) Mayor qué \n" +
                    "2) Nevera\n" +
                    "19) salir\n" +
                    "");


            String exercise = scanner.next();
            switch (exercise){
                case "1": one_num_comparison.isGreater();
                case "19": salir = true;

            }
        }

    }
}
