package com.pe.fred.model;

import com.pe.fred.interfaces.Calcular;

public class Scopes {

    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable(){
        double number3 = 3;

        //Forma convencional
        /*Calcular calcular = new Calcular() {
            @Override
            public double calcular(double x, double y) {
                return x + y + number3;
            }
        };*/

        // Con lambda
        Calcular calcular = (a, b)-> {
            return a + b + number3;
        };

        return calcular.calcular(2,3);
    }

    public double probarAtributosStaticVariables(){
        Calcular calc = (a,b )-> {
            atributo1 = a + b;
            atributo2 = atributo1;
            return (atributo2);
        };
        return calc.calcular(5,10);
    }
}
