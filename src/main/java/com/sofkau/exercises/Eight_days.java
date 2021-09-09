package com.sofkau.exercises;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Scanner;

public class Eight_days {

    public void is_workday(){

        String day;
        String dayType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("En este programa identifica si un día de la semana es un día laboral o no");
        System.out.print("Por favor ingrese un día de la semana: \n" +
                " ");
        day = scanner.next();

        day = day.toLowerCase();
        System.out.println(day.getClass().getSimpleName());
        System.out.println(day);
        if(day == "lunes"){
            System.out.println("ES IGUAL");
        }
        switch (day){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": dayType = "es un día laboral"; break;
            case "sabado":
            case "domiengo": dayType = "es fin de semana!"; break;
            default: dayType = "está mal escrito"; break;
        }
        System.out.println("El día " + day + " " + dayType);
    }
}
