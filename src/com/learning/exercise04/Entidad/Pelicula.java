package com.learning.exercise04.Entidad;

public class Pelicula {
    //Atributos de clase
    private String titulo;
    private String director;
    private Integer minutos;

    //Constructor vacio
    public Pelicula() {
    }

    //Constructor por parametros
    public Pelicula(String titulo, String director, Integer minutos) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
    }

    //Getter y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }
}
