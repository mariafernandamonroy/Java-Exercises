package com.sofkau.exercises;

import java.util.Scanner;

public class Fifteen_menu {

    public void show_menu(){

        String option;
        boolean out = false;
        Scanner scanner = new Scanner(System.in);
        while (!out) {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            option = scanner.nextLine();
            switch (option) {
                case "8": out = true; break;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo");
            }
        }
    }
}
