package com.learning.exercise03.Service;

import com.learning.exercise03.Entidad.Alumno;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoServiceTest {
    public AlumnoServiceTest() {
    }

    private List<Alumno> listaDeAlumnos;
    private ArrayList<Integer> listaDeCalificaciones;

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        listaDeAlumnos = new ArrayList<>();
        listaDeCalificaciones = new ArrayList<>();
        listaDeCalificaciones.add(9);
        listaDeCalificaciones.add(10);
        listaDeCalificaciones.add(8);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCrearAlumnos() {
        listaDeAlumnos.add(new Alumno("Andres",listaDeCalificaciones));
        assertEquals(1,listaDeAlumnos.size());
    }

    @Test
    void testBuscarAlumno() {
        listaDeAlumnos.add(new Alumno("Andres",listaDeCalificaciones));
        boolean isAlumno = false;
        for (Alumno alumno:listaDeAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase("Andres")) {
                 isAlumno = true;
            }
        }
        assertTrue(isAlumno);


    }

    @Test
    void testNotaFinal() {
        listaDeAlumnos.add(new Alumno("Andres",listaDeCalificaciones));
        int promedio = (listaDeCalificaciones.get(0) + listaDeCalificaciones.get(1) + listaDeCalificaciones.get(2))/3;
        assertEquals(9,promedio);
    }

}