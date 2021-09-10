package com.sofkau.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Twelve_equal_words {

    public void equal_words(){

        String word1;
        String word2;
        String string_words;
        String words[];
        String diferences = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa identifica la diferencia entre dos palabras");
        System.out.println("Ingrese dos palabras separadas por coma (ex. casa,perro): ");

        string_words = scanner.nextLine();
        words = string_words.split(",");
        word1 = words[0];
        word2 = words[1];
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Las palabras " + string_words + " son iguales");
        }else{
            diferences = word_diferences(word1,word2);
            System.out.println("Las palabras son diferentes: " + diferences);
        }
    }

}
