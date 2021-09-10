package com.sofkau.exercises;
import Exercise16.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {



    public void excersice16_methods() {

        class error extends Exception{
            public error(String mensaje){
                super(mensaje);
            }
        }

        String name;
        String sex = "";
        String sex_temp;
        int age;
        double weight;
        double height;
        String input_string;
        String input[];
        double imc;
        boolean legal_age;
        Persona persons[] = new Persona[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribir: nombre");
        name = scanner.nextLine();
        System.out.println("Edad");
        try{age = Integer.parseInt(scanner.nextLine());}
        catch (Exception e) {System.out.println("Ingrese la edad nuevamente");
            age = Integer.parseInt(scanner.nextLine());}
        System.out.println("Sexo (Masculino, Femenino)");
        try{
            sex_temp = scanner.nextLine();
            if(sex_temp.equalsIgnoreCase("Masculino")|| sex_temp.equalsIgnoreCase("Femenino")){
                System.out.println("entro aqui");}
            else{
                System.out.println("entro al else");
                error e = new error("");
                throw e;
            }
        }
        catch (Exception excepcion) {
            excepcion.printStackTrace();
            System.out.println("Ingrese Masculino o femenino solamente");
            sex_temp = scanner.nextLine();
        }
        if(sex_temp.equalsIgnoreCase("Masculino")){sex = "M";}
        else if(sex_temp.equalsIgnoreCase("Femenino")){sex = "F";}
        System.out.println("Peso (Kg)");
        try{weight = Double.parseDouble(scanner.nextLine());}
        catch (Exception e) {
            System.out.println("Ingrese el peso nuevamente");
            weight = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Altura (m)");
        try{height = Double.parseDouble(scanner.nextLine());}
        catch (Exception e){
            System.out.println("Ingrese altura nuevamente");
            height = Double.parseDouble(scanner.nextLine());
        }

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

        System.out.println(persons.length);

        for(int i = 0; i < persons.length; i++ ){
            imc =  persons[i].calculate_IMC();
            if(imc == -1){
                System.out.println(persons[i].getNombre() + " Se encuentra por debajo del peso ideal");
            }else if(imc == 0){
                System.out.println(persons[i].getNombre() + " Se encuentra en el peso ideal");
            }else if(imc == 1){
                System.out.println(persons[i].getNombre() + " Se encuentra por encima del peso ideal");
            }
            legal_age = persons[i].is_legal_age();
            if(legal_age == true){
                System.out.println(persons[i].getNombre() + " Es mayor de edad");
            }else if(legal_age == false){
                System.out.println(persons[i].getNombre() + " No es mayor de edad");
            }
            System.out.println(persons[i].toString());
        }


    }
}

