package com.pe.fred.model;

import com.pe.fred.interfaces.Operation;

public class Sintaxis {

    public double probarSintaxis(){
        Operation operation = (x, y) -> (x + y)/2;
        return operation.calcularPromedio(10,25);
    }

    public double promedioMasSuma(){
        Operation operation = (x, y)->{
            Double adicion = 3.5;
            return (x+y)/2 + adicion;
        };
        return operation.calcularPromedio(5,10);
    }
}
