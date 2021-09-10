package com.sofkau.exercises;

import java.util.ArrayList;
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
        char[] word1_list = word1.toCharArray();
        char[] word2_list = word2.toCharArray();
        ArrayList<String> new_word1 = new ArrayList<String>();
        ArrayList<String> new_word2 = new ArrayList<String>();
        word1_length = word1.length();
        word2_length = word2.length();
        String diferences = "";

        if(word1_length >= word2_length){length = word1_length;}
        else if (word2_length > word1_length){length = word2_length;}

        for(int letter = 0; letter < length; letter++){

            if(word1_list[letter] != word2_list[letter]){
                new_word1.add("(" + word1_list[letter] + ")");
                new_word2.add("(" + word2_list[letter] + ")");
            }else{
                new_word1.add(Character.toString(word1_list[letter]));
                new_word2.add(Character.toString(word2_list[letter]));
            }
        }
        word1 =  String.join("",new_word1);
        word2 =  String.join("",new_word2);

        diferences = word1.concat("," + word2);
        return diferences;
    }
}
