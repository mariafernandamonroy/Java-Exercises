package com.sofkau.exercises;

import java.util.Scanner;

public class Three_circle_area {

    public void calculate_radius(){

        double radius;
        double area;
        String radius_string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este ejercicio se puede calcular el área de un círculo" +
                "según su radio dado por el usario");

        System.out.print("Por favor ingrese el radio del círculo: \n" +
                " ");
        radius_string = scanner.next();
        radius = Double.parseDouble(radius_string);
        area = Math.PI * Math.pow(radius,2);

        System.out.println("Con el radio proporcionado = " +radius_string + "\n " +
                "El área del círculo es =" + area);
    }
}
