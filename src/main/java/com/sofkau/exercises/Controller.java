package com.sofkau.exercises;
import Exercise16.*;

public class Controller {

    public void excersice16_methods(){
        double imc;
        imc = calculate_imc(10, 1.50);
        System.out.println("El IMC es: " + imc);
    }
    public double calculate_imc( double peso, double altura){
        double result_imc;
        Persona persona = new Persona("juan",25,"H",peso,altura);
        result_imc = persona.calculate_IMC();
        return result_imc;
    }



}

