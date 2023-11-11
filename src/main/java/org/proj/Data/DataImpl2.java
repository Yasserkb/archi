package org.proj.Data;

import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl2 implements Data {
    @Override
    public double getData() {
        System.out.println("Recuperation de la base de donnees ");
        double data = 10;
        return data;
    }
}
