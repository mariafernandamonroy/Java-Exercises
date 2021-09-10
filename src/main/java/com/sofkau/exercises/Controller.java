package com.sofkau.exercises;
import Exercise16.*;

import java.util.Scanner;

public class Controller {



    public void excersice16_methods() {

        String name;
        String sex = "";
        String sex_temp;
        int age;
        double weight;
        double height;
        String input_string;
        String input[];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribir separados por coma: nombre, edad, sexo, peso, altura");
        input_string = scanner.nextLine();
        input = input_string.split(",");
        name = input[0];
        age = Integer.parseInt(input[1]);
        sex_temp = input[2];
        if(sex_temp.equalsIgnoreCase("Masculino")){sex = "M";}
        else if(sex_temp.equalsIgnoreCase("Femenino")){sex = "F";}
        weight = Double.parseDouble(input[3]);
        height = Double.parseDouble(input[4]);

        Persona persona1 = new Persona(name,age,sex,weight,height);
        Persona persona2 = new Persona(name,age,sex);
        Persona persona3 = new Persona();

        persona3.setNombre("Maria");
        persona3.setEdad(24);
        persona3.setSexo("Femenino");
        persona3.setPeso(49);
        persona3.setAltura(1.54);





    }



}

