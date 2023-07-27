package com.learning.exercise08;

import com.learning.exercise08.Service.CiudadService;

import java.util.HashMap;
import java.util.Scanner;

public class CodigosPostalesApp {
    public static HashMap<String, String> mapDePaises = new HashMap<String,String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CiudadService cs = new CiudadService();

        int choice;
        do {

            System.out.println("\n\tMenu");
            System.out.println("1. Agregar ciudad");
            System.out.println("2. Eliminar ciudad");
            System.out.println("3. Mostrar paises");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    cs.agregarCiudad(mapDePaises);
                    break;
                case 2:
                    System.out.print("\nIngresa el codigo postal para eliminar la ciudad: ");
                    String codigoPostal = sc.nextLine().toUpperCase();
                    if (cs.buscarCodigoPostal(mapDePaises, codigoPostal)){
                        cs.eliminarCiudad(mapDePaises,codigoPostal);
                        System.out.println("Ciudad eliminada");
                    } else {
                        System.out.println("\nEl codigo no corresponde a una ciudad de la lista");
                    }
                    break;
                case 3:
                    cs.mostrarPaises(mapDePaises);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while(choice != 4);
    }
}
