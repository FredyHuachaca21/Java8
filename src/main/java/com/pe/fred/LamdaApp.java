package com.pe.fred;

import com.pe.fred.interfaces.Operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaApp {

    public  void ordenar(){
        List<String> list = Arrays.asList("Fred", "Fredy", "Edgar", "Frank", "Alex", "Marck");
       /* Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(list, (p1, p2)-> p1.compareTo(p2));

        for (String elemento: list){
            System.out.println("elemento = " + elemento);
        }
    }

    public void calcular(){
        Operation operation = (x, y)-> (x+y)/2;
        System.out.println(operation.calcularPromedio(5,10));
    }

    public static void main(String[] args) {
        LamdaApp lamdaApp = new LamdaApp();
        lamdaApp.calcular();
    }
}
