package com.learning.exercise01.Service;

import com.learning.exercise01.Entidad.Perro;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PerroServiceTest {
    public PerroServiceTest() {
    }

    private ArrayList<String> listaDePerros;

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        listaDePerros = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAnadirRaza() {
        listaDePerros.add("Beagle");
        assertEquals(1,listaDePerros.size());
        listaDePerros.add("Pitbull");
        assertEquals(2,listaDePerros.size());
    }


    @Test
    void buscarRaza() {
        listaDePerros.add("Beagle".toUpperCase());
        listaDePerros.add("Pitbull".toUpperCase());
        listaDePerros.add("Doberman".toUpperCase());
        listaDePerros.add("Pastor Aleman".toUpperCase());

        boolean isRaza = false;
        Iterator iterator = listaDePerros.iterator();
        while (iterator.hasNext()) {
            isRaza = iterator.next().equals("PASTOR ALEMAN");
            if (isRaza) {
                iterator.remove();
                Collections.sort(listaDePerros);
                break;
            }
        }

        //Validar que se encuentra la raza
        assertTrue(isRaza);
        //Validar que se elimina la raza encontrada
        assertEquals(3,listaDePerros.size());

    }
}