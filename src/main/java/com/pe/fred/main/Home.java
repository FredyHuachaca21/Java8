package com.pe.fred.main;

import com.pe.fred.interfaces.Calcular;
import com.pe.fred.model.Scopes;

public class Home {
    public static void main(String[] args) {
        Scopes scopes = new Scopes();
        System.out.println(scopes.probarAtributosStaticVariables());
    }
}
