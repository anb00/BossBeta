package com.iesemilidarder.anicolau.data;

public class Product extends Activity{
    private String description;

    public Product(String name, double price, String description){
        super(name,price);
        this.description = description;
    }

    public String obtenerDescription() {

        return "Nombre: " + name +
                ", Precio: " + price +
                ", Descripción: " + description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String departamento) {
        this.description = description;
    }


}