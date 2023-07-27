package com.learning.exercise07.Entity;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int numeroDeEjemplaresPrestados;

    //Constructor vacio
    public Libro() {
    }

    //Constructor por parametros
    public Libro(String titulo, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDeEjemplares=" + numeroDeEjemplares +
                ", numeroDeEjemplaresPrestados=" + numeroDeEjemplaresPrestados +
                '}';
    }
}
