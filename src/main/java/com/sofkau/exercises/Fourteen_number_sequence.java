package com.sofkau.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Fourteen_number_sequence {

    public void number_sequence(){

        int number;
        String number_string;
        ArrayList numbers = new ArrayList();
        System.out.println("Ingrese el número inicial");
        Scanner scanner = new Scanner(System.in);
        number_string = scanner.nextLine();
        number = Integer.parseInt(number_string);

        for(int i = number; i < 1000;i = i+2){
            numbers.add(i);
        }
        System.out.println("La secuencia de números desde " + number + " hasta 1000 es: \n" +
                numbers);
    }
}
