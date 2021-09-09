package com.sofkau.exercises;

import java.util.Scanner;

public class Four_product_iva {

    public void calculate_iva(){

        double price;
        double tax;
        double final_price;
        double iva = 0.21;
        String price_string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este ejercicio se calcula el IVA del precio neto de un producto");
        System.out.print("Por favor ingrese el precio del producto: \n" +
                " ");
        price_string = scanner.next();
        price = Double.parseDouble(price_string);

        tax = price * iva;
        final_price = price + tax;
        System.out.print("El precio del producto + iva es = " + final_price);

    }
}
