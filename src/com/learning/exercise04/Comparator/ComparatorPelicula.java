package com.learning.exercise04.Comparator;

import com.learning.exercise04.Entidad.Pelicula;

import java.util.Comparator;

public class ComparatorPelicula {

    public static Comparator<Pelicula> ordenarPorDuracionMenorAMayor = Comparator.comparing(Pelicula::getMinutos);

    public static Comparator<Pelicula> ordenarPorDuracionMayorAMenor = Comparator.comparing(Pelicula::getMinutos).reversed();

    public static Comparator<Pelicula> ordenarPorTitulo = Comparator.comparing(Pelicula::getTitulo);

    public static Comparator<Pelicula> ordenarPorDirector = Comparator.comparing(Pelicula::getDirector);
}
