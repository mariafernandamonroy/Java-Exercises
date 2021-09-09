package com.sofkau.exercises;

import java.util.Scanner;

public class Two_num_comparison {


    public void comparison(){

        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese los dos números a comparar, separados por coma (numero 1,numero 2): \n" +
                " ");
        String numbers = scanner.next();
        String numbers_split[] = numbers.split(",");
        double num1 = Double.parseDouble(numbers_split[0]);
        double num2 = Double.parseDouble(numbers_split[1]);

        if (num1 > num2) { result = "el número 1 es mayor al número 2"; }
        else if (num1 < num2) { result = "el número 1 es menor al número 2"; }
        else if (num1 == num2) { result = "el número 1 es igual al número 2"; }

        System.out.println(result);
    }
}
