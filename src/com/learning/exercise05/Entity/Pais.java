package com.learning.exercise05.Entity;

public class Pais {
    //Atributo
    private String nombre;

    //Constructor vacio
    public Pais() {
    }

    //Constructor por parametro
    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
