package com.sofkau.exercises;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean salir = false;

        Scanner scanner = new Scanner(System.in);
        One_greater one_greater = new One_greater();
        Two_num_comparison two_num_comparison = new Two_num_comparison();
        Three_circle_area three_circle_area = new Three_circle_area();
        Four_product_iva four_product_iva = new Four_product_iva();

        while(!salir){
            System.out.print("Ingrese el número del ejercicio que desea probar: : \n" +
                    "1) Mayor qué \n" +
                    "2) Comparación entre números (mayor,menor o igual) \n" +
                    "3) Calcular el área de un círculo \n" +
                    "4) Calcular el precio de un producto + iva \n" +
                    "19) salir\n" +
                    "");


            String exercise = scanner.next();
            switch (exercise){
                case "1": one_greater.isGreater();
                case "2": two_num_comparison.comparison();
                case "3": three_circle_area.calculate_radius();
                case "4": four_product_iva.calculate_iva();
                case "19": salir = true;

            }
        }

    }
}
