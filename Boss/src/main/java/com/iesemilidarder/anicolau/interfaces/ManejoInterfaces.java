package com.iesemilidarder.anicolau.interfaces;

public class ManejoInterfaces {

    public static void main(String[] args) {

        IntoData datos = new ImplementacionOracle();
        ejecutar(datos,"listar");

        datos  = new ImplementacionMySql();
        ejecutar(datos,"insertar");

    }

    private static void ejecutar(IntoData datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listar();
        }else if ("insertar".equals(accion)) {
            datos.insertar();
        }
    }

}