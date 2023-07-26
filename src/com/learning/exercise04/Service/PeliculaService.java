package com.learning.exercise04.Service;

import com.learning.exercise04.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PeliculaService {

    public ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

    public void crearPelicula() {
        Scanner sc = new Scanner(System.in);
        Pelicula pelicula = null;
        String choice = "S";

        while (choice.equals("S")) {

            if (pelicula == null) {
                pelicula = new Pelicula();
            }

            System.out.print("Ingresa el titulo de la pelicula: ");
            pelicula.setTitulo(sc.nextLine());
            System.out.print("Ingresa el director de la pelicula: ");
            pelicula.setDirector(sc.nextLine());
            System.out.print("Ingresa la duracion en minutos de la pelicula: ");
            pelicula.setMinutos(Integer.parseInt(sc.nextLine()));

            listaDePeliculas.add(pelicula);
            pelicula = null; //Reiniciamos la variable para que en la siguiente iteracion cree una nueva instancia si el udiario asi lo desea

            System.out.print("\nDesea ingresar otra pelicula (S/N)");
            choice = sc.nextLine().toUpperCase();

        }
    }

    public void mostrarPeliculas() {
        System.out.println("\nPeliculas: \n");
        for (Pelicula pelicula:listaDePeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getMinutos() + "min");
            System.out.println("------------------------");
        }
    }

    public void mostrarPeliculasMayoresDeUnaHora() {
        System.out.println("\nPeliculas de duracion mayor a 60min: \n");
        listaDePeliculas.stream()
                .filter(pelicula -> pelicula.getMinutos() > 60)
                .forEach(pelicula -> {
                    System.out.println("Titulo: " + pelicula.getTitulo());
                    System.out.println("Director: " + pelicula.getDirector());
                    System.out.println("Duracion: " + pelicula.getMinutos());
                    System.out.println("------------------------");
                });
    }
}
