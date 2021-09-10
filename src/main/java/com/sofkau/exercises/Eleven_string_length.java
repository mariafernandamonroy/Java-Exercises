package com.sofkau.exercises;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Eleven_string_length {

    public void string_length(){

        String phrase = "";
        int character_amount;
        int vocals_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa determina la longitud" +
                "y la cantidad de vocales de una cadena de texto");
        System.out.println("Escriba una frase: \n" +
                "" );
        phrase = scanner.nextLine();
        phrase = phrase.toLowerCase();
        character_amount = phrase.length();
        vocals_amount =  string_vocals(phrase);
        System.out.println("Siendo la frase: " + phrase +
                " \n La cantidad de caractéres es: " + character_amount +
                " \n y la cantidad de vocales de la frase es: " + vocals_amount);
    }
    public int string_vocals(String phrase){

        int counter = 0;
       for(int character = 0; character < phrase.length(); character++ ){
           if(phrase.charAt(character) == 'a' ||
               phrase.charAt(character) == 'e' ||
               phrase.charAt(character) == 'i'||
               phrase.charAt(character) == 'o'||
               phrase.charAt(character) == 'u')
           {
                counter = counter + 1;
           }
       }
       return counter;
    }
}
