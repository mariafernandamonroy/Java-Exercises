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
        Five_odd_even five_odd_even = new Five_odd_even();
        Six_odd_even_for six_odd_even_for = new Six_odd_even_for();
        Seven_int_numbers seven_int_numbers = new Seven_int_numbers();
        Eight_days eight_days = new Eight_days();
        Nine_replace_string nine_replace_string = new Nine_replace_string();
        Ten_delete_string_spaces ten_delete_string_spaces = new Ten_delete_string_spaces();
        Eleven_string_length eleven_string_length = new Eleven_string_length();
        Twelve_equal_words twelve_equal_words = new Twelve_equal_words();

        while(!salir){
            System.out.print("Ingrese el número del ejercicio que desea probar: : \n" +
                    "1) Mayor qué \n" +
                    "2) Comparación entre números (mayor,menor o igual) \n" +
                    "3) Calcular el área de un círculo \n" +
                    "4) Calcular el precio de un producto + iva \n" +
                    "5) Mostrar números pares e impares (While) \n" +
                    "6) Mostrar números pares e impares (For) \n" +
                    "7) Mostrar números positivos (do while) \n" +
                    "8) ¿Días laborales? (switch case) \n" +
                    "9) Remplazar y concatenar cadenas de texto \n" +
                    "10) Eliminar espacios en una cadena de texto \n" +
                    "11) Contar la cantidad de carácteres y vocales en una cadena de texto \n" +
                    "12) ¿Palabras iguales? \n" +
                    "19) salir\n" +
                    "");

            String exercise = scanner.next();
            switch (exercise){
                case "1": one_greater.isGreater(); break;
                case "2": two_num_comparison.comparison(); break;
                case "3": three_circle_area.calculate_radius(); break;
                case "4": four_product_iva.calculate_iva(); break;
                case "5": five_odd_even.find_odd_even(); break;
                case "6": six_odd_even_for.find_odd_even(); break;
                case "7": seven_int_numbers.int_numbers(); break;
                case "8": eight_days.is_workday(); break;
                case "9": nine_replace_string.replace_concat_string(); break;
                case "10": ten_delete_string_spaces.delete_string_spaces(); break;
                case "11": eleven_string_length.string_length(); break;
                case "12": twelve_equal_words.equal_words(); break;
                case "19": salir = true;  break;
                default:
                    System.out.println("Selección inválida, intente nuevamente");

            }
        }

    }
}
