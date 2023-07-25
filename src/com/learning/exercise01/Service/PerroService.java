package com.learning.exercise01.Service;

import com.learning.exercise01.Entidad.Perro;

import java.util.*;

public class PerroService {

    public static List<String> listaDeRazas = new ArrayList<>();

    public void anadirRaza() {
        Scanner sc = new Scanner(System.in);
        listaDeRazas.add(sc.nextLine().toUpperCase());
    }

    public void mostrarRazas() {
        System.out.println("\nRazas:");
        for (String raza:listaDeRazas) {
            System.out.println(raza);
        }
    }

    public void buscarRaza(String raza) {
        boolean isRaza = false;
        Iterator iterator = listaDeRazas.iterator();
        while (iterator.hasNext()) {
            isRaza = iterator.next().equals(raza.toUpperCase());
            if (isRaza) {
                iterator.remove();
                Collections.sort(listaDeRazas);
                mostrarRazas();
                break;
            }
        }

        if (!isRaza) {
            System.out.println("\nLa raza no se encuentra");
            Collections.sort(listaDeRazas);
            mostrarRazas();
        }

    }


}
