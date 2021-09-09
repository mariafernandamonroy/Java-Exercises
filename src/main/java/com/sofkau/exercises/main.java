package com.sofkau.exercises;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean salir = false;

        Scanner scanner = new Scanner(System.in);
        One_greater one_greater = new One_greater();
        Two_num_comparison two_num_comparison = new Two_num_comparison();

        while(!salir){
            System.out.print("Ingrese el número del ejercicio que desea probar: : \n" +
                    "1) Mayor qué \n" +
                    "2) Comparación entre números (mayor,menor o igual)\n" +
                    "19) salir\n" +
                    "");


            String exercise = scanner.next();
            switch (exercise){
                case "1": one_greater.isGreater();
                case "2": two_num_comparison.comparison();
                case "19": salir = true;

            }
        }

    }
}
