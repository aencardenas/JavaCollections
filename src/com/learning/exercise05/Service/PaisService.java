package com.learning.exercise05.Service;

import com.learning.exercise05.Comparator.ComparatorPais;
import com.learning.exercise05.Entity.Pais;

import java.util.*;

public class PaisService {

    private HashSet<Pais> setDePaises = new HashSet();

    public void crearPais() {
        Scanner sc = new Scanner(System.in);
        Pais pais = null;
        String choice = "S";

        while (choice.equals("S")) {

            if (pais == null) {
                pais = new Pais();
            }

            System.out.print("\nIngresa el nombre de un pais: ");
            pais.setNombre(sc.nextLine().toUpperCase());

            setDePaises.add(pais);
            pais = null;

            System.out.print("Desea ingresar otro pais (S/N)?: ");
            choice = sc.nextLine().toUpperCase();

        }

    }

    public void mostrarPaises() {
        System.out.println("Lista de paises: ");
        for (Pais pais: setDePaises) {
            System.out.println(pais.getNombre());
        }
    }


    public void ordenarPaisesAlfabeticamente() {
        ArrayList<Pais> listaDePaises = new ArrayList<>(setDePaises); //Se convierte el HashSet a lista
        Collections.sort(listaDePaises, ComparatorPais.ordenarAlfabeticamente);
        System.out.println("Lista de paises: ");
        for (Pais pais: listaDePaises) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais(String pais) {
        Iterator<Pais> iterator = setDePaises.iterator();
        boolean isPais = false;
        while (iterator.hasNext()) {
            Pais auxPais = iterator.next();
            if(pais.toUpperCase().equals(auxPais.getNombre().toUpperCase())) {
                iterator.remove();
                isPais = true;
                break;
            }
        }

        if (!isPais) {
            System.out.println("El pais no se encuentra en el conjunto");
        }
    }
}
