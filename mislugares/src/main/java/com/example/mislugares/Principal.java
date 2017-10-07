package com.example.mislugares;

/**
 * Created by Isabel María on 07/10/2017.
 */

public class Principal {
    public static void main( String[] args){
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar "+ lugar.toString());
    }
}
