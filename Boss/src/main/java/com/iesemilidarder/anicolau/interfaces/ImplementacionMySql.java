package com.iesemilidarder.anicolau.interfaces;

public class ImplementacionMySql implements IntoData {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }
}