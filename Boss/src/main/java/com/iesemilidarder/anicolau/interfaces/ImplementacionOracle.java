package com.iesemilidarder.anicolau.interfaces;

public class ImplementacionOracle implements IntoData {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }
}