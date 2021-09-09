package com.sofkau.exercises;

import java.util.Scanner;

public class Four_product_iva {

    public void calculate_iva(){

        double price;
        double final_price;
        String price_string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este ejercicio calcula el IVA al precio neto de un producto");
        System.out.print("Por favor ingrese el precio del producto: \n" +
                " ");
        price_string = scanner.next();
        price = Double.parseDouble(price_string);
    }
}
