package com.learning.exercise06.Entity;

public class Productos {

    //Atributos
    private String nombreDeProducto;
    private double precioProducto;

    //Constructor vacio
    public Productos() {
    }

    //Constructor por parametros
    public Productos(String nombreDeProducto, double precioProducto) {
        this.nombreDeProducto = nombreDeProducto;
        this.precioProducto = precioProducto;
    }

    //Getters y Setters
    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
