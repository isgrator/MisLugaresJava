package com.example.mislugares;

/**
 * Created by Isabel María on 07/10/2017.
 */

public class Principal {
    public static void main( String[] args){
        Lugares lugares= new LugaresVector();
        for(int i=0; i<lugares.tamanyo(); i++) {
            System.out.println(lugares.elemento(i).toString());
        }
    }
}
