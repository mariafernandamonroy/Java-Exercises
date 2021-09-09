package com.sofkau.exercises;

import java.util.Scanner;

public class Seven_int_numbers {

    public void int_numbers(){

        double number;
        String number_string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este ejercicio muestra solamente los números positivos");
        System.out.print("Por favor ingrese un número: \n" +
                " ");
        number_string = scanner.next();
        number = Double.parseDouble(number_string);

    }
}
