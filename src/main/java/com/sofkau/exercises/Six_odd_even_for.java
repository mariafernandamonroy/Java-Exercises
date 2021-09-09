package com.sofkau.exercises;

import java.util.ArrayList;

public class Six_odd_even_for {

    public void find_odd_even(){

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("Este programa muestra los números pares e impares del 1 al 100:");
        System.out.println("Los números pares entre el 1 al 100 son: ");
        System.out.println(even);
        System.out.println("Los números imapres entre el 1 al 100 son: ");
        System.out.println(odd);
    }
}
