package com.sofkau.exercises;
import Exercise16.*;

import java.util.Scanner;

public class Controller {

    Persona persona = new Persona("juan",25,"F",50,1.54);

    public void excersice16_methods() {

        double imc;
        boolean legal_age;
        String object;
        imc = persona.calculate_IMC();
        System.out.println("El IMC es: " + imc);
        legal_age = persona.is_legal_age();
        System.out.println("Es legal la edad?:" + legal_age);
        object = persona.toString();
        System.out.println(object);

    }



}

