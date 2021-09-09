package com.sofkau.exercises;

import java.util.Scanner;

public class Three_circle_radius {

    public void calculate_radius(){

        double radius;
        String radius_string;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese el radio del círculo: \n" +
                " ");
        radius_string = scanner.next();
        radius = Double.parseDouble(radius_string);
    }
}
