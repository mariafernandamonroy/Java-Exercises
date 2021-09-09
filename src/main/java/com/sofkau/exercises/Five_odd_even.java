package com.sofkau.exercises;

import java.util.ArrayList;

public class Five_odd_even {

    public void find_odd_even(){

        int counter = 0;
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        while(counter < 100){
            counter = counter + 1;
            System.out.println(counter);
            if(counter % 2 == 0){
                even.add(counter);
            }else{
                odd.add(counter);
            }
        }
        System.out.println("Este programa muestra los números pares e impares del 1 al 100:");
        System.out.println("Los números pares entre el 1 al 100 son: ");
        System.out.println(even);
        System.out.println("Los números imapres entre el 1 al 100 son: ");
        System.out.println(odd);
    }
}

