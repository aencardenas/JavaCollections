package com.learning.exercise03.Entidad;

import java.util.ArrayList;

public class Alumno {

    //Atributos de clase
    private String nombre;
    private ArrayList<Integer> calificaciones;

    //Constructor vacio
    public Alumno() {
        calificaciones = new ArrayList<>();
    }

    //Constructor por parametros
    public Alumno(String nombre, ArrayList<Integer> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }


}
