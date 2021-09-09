package com.sofkau.exercises;

import java.util.Scanner;

public class Seven_int_numbers {

    public void int_numbers(){

        double number = -1;
        String number_string;
        System.out.println("En este ejercicio muestra solamente los números positivos");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Por favor ingrese un número: \n" +
                    " ");
            number_string = scanner.next();
            number = Double.parseDouble(number_string);
            if(number > 0){
                System.out.println("El número es = " + number);
                break;
            }
        } while (number < 0);
    }
}
