package com.sofkau.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class One_greater {
    Double[] array = {2.0, 5555.55, 829.22};
    ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(array));

    public void isGreater(){
        for(Double num1 : list){
            for(Double num2 : list) {

                System.out.println("Siendo el numero 1= " + num1 + "  y el numero 2= " + num2);
                if (num1 > num2) {
                    System.out.println("el número 1 es mayor al número 2");
                } else if (num2 > num1) {
                    System.out.println("el número 2 es mayor al número 1");
                } else if (num1 == num2) {
                    System.out.println("el número 1 es igual al número 2");
                }
            }
        }
    }
}
