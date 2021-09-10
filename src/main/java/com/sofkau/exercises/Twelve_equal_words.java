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
    public String word_diferences(String word1,String word2){

        int word1_length;
        int word2_length;
        int length = 0;
        String string_letter_word1;
        String string_letter_word2;
        String new_word1 = "";
        String new_word2 = "";
        word1_length = word1.length();
        word2_length = word2.length();

        if(word1_length >= word2_length){length = word1_length;}
        else if (word2_length > word1_length){length = word2_length;}

        for(int letter = 0; letter < length; letter++){
            if( word1.charAt(letter) != word2.charAt(letter)){
                string_letter_word1 = Character.toString(word1.charAt(letter));
                new_word1 = word1.replace(string_letter_word1,"(" + word1.charAt(letter) + ")");
                System.out.println("word1:" + new_word1);
                string_letter_word2 = Character.toString(word2.charAt(letter));
                new_word2 = word2.replace(string_letter_word2,"(" + word2.charAt(letter) + ")");
                System.out.println("word2:" + new_word2);
            }
        }

        String diferences = new_word1.concat("," + new_word2);
        return diferences;
    }
}
