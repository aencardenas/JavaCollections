package com.learning.exercise04.Service;

import com.learning.exercise04.Comparator.ComparatorPelicula;
import com.learning.exercise04.Entidad.Pelicula;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PeliculaServiceTest {
    public PeliculaServiceTest() {
    }

    private ArrayList<Pelicula> listaDePeliculas;
    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(new Pelicula("IRONMAN","ALEJANDRO AMENABAR",59));
        listaDePeliculas.add(new Pelicula("SPIDERMAN","STAN LEE",90));
        listaDePeliculas.add(new Pelicula("AMORES PERROS","JUAN RIOS",120));
        listaDePeliculas.add(new Pelicula("EL PRINCIPITO","ZULEYKA",40));


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crearPelicula() {
        listaDePeliculas.add(new Pelicula("EL REY LEON","DISNEY",110));
        assertEquals(5,listaDePeliculas.size());
    }

    @Test
    void testOrdenarPorDuracionMenorAMayor() {

        //Peliculas antes de usar el comparator
        Pelicula pelicula1 = listaDePeliculas.get(0);
        Pelicula pelicula2 = listaDePeliculas.get(1);
        Pelicula pelicula3 = listaDePeliculas.get(2);
        Pelicula pelicula4 = listaDePeliculas.get(3);

        //Ordenar las peliculas en orden de menor a mayor duracion
        Collections.sort(listaDePeliculas,ComparatorPelicula.ordenarPorDuracionMenorAMayor);

        //Validar que se hayan ordenada correctamente
        assertEquals(pelicula4, listaDePeliculas.get(0));
        assertEquals(pelicula1, listaDePeliculas.get(1));
        assertEquals(pelicula2, listaDePeliculas.get(2));
        assertEquals(pelicula3, listaDePeliculas.get(3));
    }
}