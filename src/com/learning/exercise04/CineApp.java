package com.learning.exercise04;

import com.learning.exercise04.Comparator.ComparatorPelicula;
import com.learning.exercise04.Service.PeliculaService;

import java.util.Collections;
import java.util.Comparator;

public class CineApp {
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        ps.crearPelicula();
        ps.mostrarPeliculas();
        ps.mostrarPeliculasMayoresDeUnaHora();
        System.out.println("\nPeliculas ordenadas por duracion (mayor a menor): ");
        Collections.sort(ps.listaDePeliculas, ComparatorPelicula.ordenarPorDuracionMayorAMenor);
        ps.mostrarPeliculas();
        System.out.println("\nPeliculas ordenadas por duracion(menor a mayor): ");
        Collections.sort(ps.listaDePeliculas,ComparatorPelicula.ordenarPorDuracionMenorAMayor);
        ps.mostrarPeliculas();
        System.out.println("\nPeliculas ordenadas por titulo: ");
        Collections.sort(ps.listaDePeliculas, ComparatorPelicula.ordenarPorTitulo);
        ps.mostrarPeliculas();
        System.out.println("\nPeliculas ordenadas por director: ");
        Collections.sort(ps.listaDePeliculas, ComparatorPelicula.ordenarPorDirector);
        ps.mostrarPeliculas();
    }
}
