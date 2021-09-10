package com.sofkau.exercises;
import Exercise16.*;

public class Controller {

    Persona persona = new Persona("juan",25,"H",50,1.54);

    public void excersice16_methods(){

        double imc;
        boolean legal_age;
        imc = persona.calculate_IMC();
        System.out.println("El IMC es: " + imc);
        legal_age = persona.is_legal_age();
        System.out.println("Es legal la edad?:" + legal_age);

    }



}

