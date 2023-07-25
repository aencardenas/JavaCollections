package com.learning.exercise00.Entidad;

public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private String pais;
    private Integer edad;

    private int sueldo;

    //Constructor vacio
    public Empleado() {
    }

    //Constructor por parametros
    public Empleado(String nombre, String apellido, String pais, int edad, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
