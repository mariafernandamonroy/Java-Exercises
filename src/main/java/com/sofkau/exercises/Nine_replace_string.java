package com.sofkau.exercises;

import java.util.Scanner;

public class Nine_replace_string {

    public void replace_concat_string(){

        String phrase = "La sonrisa sera la mejor arma contra la tristeza";
        String phrase2 = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa cambia la vocal 'a' por 'e' en la primera frase" +
                "y adiciona una nueva frase a la anterior");
        System.out.println("Escriba la frase que desea adicionar a : \n" +
                phrase + " + ..." );
        phrase2 = scanner.nextLine();
        phrase = phrase.replace('a','e');
        phrase = phrase.concat(" ");
        phrase = phrase.concat(phrase2);
        System.out.println(phrase);
    }
}
