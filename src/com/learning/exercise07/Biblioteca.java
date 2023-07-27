package com.learning.exercise07;

import com.learning.exercise07.Entity.Libro;
import com.learning.exercise07.Service.LibroService;

import java.util.HashSet;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibroService ls = new LibroService();

        int choice;

        do {
            System.out.println("\t\nBiblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devovler libro");
            System.out.println("4. Mostrar libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    ls.agregarLibro();
                    break;
                case 2:
                    boolean esValidoPrestar = ls.prestarLibros();
                    if (esValidoPrestar) {
                        System.out.println("\nOperacion exitosa");
                    } else {
                        System.out.println("\nOperacion fallida");
                    }
                    break;
                case 3:
                    boolean esValidoDevolver = ls.devolverLibros();
                    if (esValidoDevolver) {
                        System.out.println("\nOperacion exitosa");
                    } else {
                        System.out.println("\nOperacion fallida");
                    }
                    break;
                case 4:
                    ls.mostrarLibros();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }while(choice != 5);
    }
}
