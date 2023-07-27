package com.learning.exercise07.Service;

import com.learning.exercise07.Entity.Libro;

import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    HashSet<Libro> librosSet = new HashSet<Libro>();

    public void agregarLibro () {
        Scanner sc = new Scanner(System.in);

        Libro libro = null;
        String choice = "S";

        while (choice.equals("S")) {
            if (libro == null) {
                libro = new Libro();
            }

            System.out.print("\nIngresa el titulo del libro: ");
            libro.setTitulo(sc.nextLine().toUpperCase());

            System.out.print("Ingresa el autor del libro: ");
            libro.setAutor(sc.nextLine().toUpperCase());

            System.out.print("Ingresa el numero de ejemplares: ");
            libro.setNumeroDeEjemplares(Integer.parseInt(sc.nextLine()));

            System.out.print("Ingresa el numero de ejemplares prestados: ");
            libro.setNumeroDeEjemplaresPrestados(Integer.parseInt(sc.nextLine()));

            librosSet.add(libro);
            libro = null;

            System.out.print("Desea ingresar otro libro(S/N): ");
            choice = sc.nextLine().toUpperCase();
        }
    }

    public Libro buscarLibro () {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngresa el nombre del libro: ");
        String titulo = sc.nextLine().toUpperCase();

        for (Libro libro:librosSet) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean prestarLibros () {

        Libro libro = buscarLibro();

        if (libro != null) {
            int ejemplares = libro.getNumeroDeEjemplares();
            int ejemplaresPrestados = libro.getNumeroDeEjemplaresPrestados();
            if (ejemplares > 0) {
                libro.setNumeroDeEjemplares(ejemplares - 1);
                libro.setNumeroDeEjemplaresPrestados(ejemplaresPrestados + 1);
                return true;
            }
        }

        return false;
    }

    public boolean devolverLibros () {

        Libro libro = buscarLibro();

        if (libro != null) {
            int ejemplares = libro.getNumeroDeEjemplares();
            int ejemplaresPrestados = libro.getNumeroDeEjemplaresPrestados();
            if (ejemplaresPrestados > 0) {
                libro.setNumeroDeEjemplares(ejemplares + 1);
                libro.setNumeroDeEjemplaresPrestados(ejemplaresPrestados - 1);
                return true;
            }
        }

        return false;
    }

    public void mostrarLibros(){
        System.out.println("\nLista de libros: ");
        for (Libro libro:librosSet) {
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Ejemplares: " + libro.getNumeroDeEjemplares());
            System.out.println("Prestados: " + libro.getNumeroDeEjemplaresPrestados());
            System.out.println("-------------------------\n");
        }
    }
}
