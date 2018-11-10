package com.iesemilidarder.anicolau.data;

public class ManejoGenericos {

    public static void main(String[] args) {

        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();


        ClaseGenerica<Boolean> objB = new ClaseGenerica<>(true);

        ClaseGenerica<String>objetoStr = new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();


    }

}