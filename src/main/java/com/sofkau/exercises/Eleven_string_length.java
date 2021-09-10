package com.sofkau.exercises;

import java.util.Scanner;

public class Eleven_string_length {

    public void string_length(){

        String phrase = "";
        int character_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa determina la longitud" +
                "y la cantidad de vocales de una cadena de texto");
        System.out.println("Escriba una frase: \n" +
                "" );
        phrase = scanner.nextLine();
        character_amount = phrase.length();

        System.out.println("Siendo la frase: " + phrase +
                " \n La cantidad de caractéres es: " + character_amount);
    }


}
