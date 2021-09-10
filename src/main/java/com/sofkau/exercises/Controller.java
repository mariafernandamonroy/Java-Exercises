package com.sofkau.exercises;
import Exercise16.*;

import java.util.ArrayList;
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
        double imc;
        Persona persons[] = new Persona[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribir: nombre, edad, sexo (Masculino,Femenino), peso (Kg), altura (m)");
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

        persona2.setPeso(100);
        persona2.setAltura(1.70);

        persona3.setNombre("Maria");
        persona3.setEdad(24);
        persona3.setSexo("Femenino");
        persona3.setPeso(49);
        persona3.setAltura(1.54);

        persons[0] = persona1;
        persons[1] = persona2;
        persons[2] = persona3;

        for(int i = 0; i < persons.length-1; i++ ){
            imc =  persons[i].calculate_IMC();
            System.out.println(persons[i]);
            System.out.println(imc);
            if(imc == -1){
                System.out.println(persons[i].getNombre() + " Se encuentra por debajo del peso ideal");
            }else if(imc == 0){
                System.out.println(persons[i].getNombre() + " Se encuentra en el peso ideal");
            }else if(imc == 1){
                System.out.println(persons[i].getNombre() + " Se encuentra por encima del peso ideal (Sobrepeso");
            }
        }




//        double imc;
//        boolean legal_age;
//        String object;
//        imc = persona.calculate_IMC();
//        System.out.println("El IMC es: " + imc);
//        legal_age = persona.is_legal_age();
//        System.out.println("Es legal la edad?:" + legal_age);
//        object = persona.toString();
//        System.out.println(object);

    }



}

