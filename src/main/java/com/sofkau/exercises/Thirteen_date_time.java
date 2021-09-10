package com.sofkau.exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Thirteen_date_time {

    public void date_time_actual(){

        LocalDateTime fecha_tiempo;
        DateTimeFormatter formatter;
        String formattedLocalDate;
        fecha_tiempo = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        formattedLocalDate = fecha_tiempo.format(formatter);
        System.out.println("Este programa imprime la fecha y hora actual en formato" +
                "(AAAA/MM/DD) (HH:MM:SS)");
        System.out.println("La fecha y hora actual es: "+formattedLocalDate);
    }
}
