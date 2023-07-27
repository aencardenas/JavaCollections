package com.learning.exercise08.Service;

import com.learning.exercise08.CodigosPostalesApp;
import com.learning.exercise08.Entity.Ciudad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadService {

    public void agregarCiudad (HashMap<String, String> mapDePaises) {
        Scanner sc = new Scanner(System.in);
        Ciudad ciudad = new Ciudad();

        System.out.print("\nIngresa el nombre de la ciudad: ");
        ciudad.setNombreDeCiudad(sc.nextLine().toUpperCase());

        System.out.print("Ingresa el codigo postal: ");
        ciudad.setCodigoPostal(sc.nextLine().toUpperCase());

        mapDePaises.put(ciudad.getCodigoPostal(), ciudad.getNombreDeCiudad());

    }

    public void mostrarPaises (HashMap<String, String> mapDePaises) {
        System.out.println("\nPaises y codigos postales");
        for (Map.Entry<String,String> entry:mapDePaises.entrySet()) {
            System.out.println("Pais: " + entry.getValue() + ", Codigo postal: " + entry.getKey());

        }

    }

    public boolean buscarCodigoPostal (HashMap<String, String> mapDePaises, String key) {
        boolean isCodigoPostal = mapDePaises.containsKey(key);
        return isCodigoPostal;
    }

    public void eliminarCiudad (HashMap<String, String> mapDePaises, String codigoPostal) {
        mapDePaises.remove(codigoPostal);
    }
}
