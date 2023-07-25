package com.learning.exercise01;

import com.learning.exercise01.Service.PerroService;

import java.util.Scanner;

public class PerroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerroService ps = new PerroService();
        String choice = "S";


        while (choice.equals("S")) {
            System.out.println("Ingrese una raza de perro: ");
            ps.anadirRaza();
            System.out.println("Desea ingresar otra raza (S/N): ");
            choice = sc.nextLine().toUpperCase();

        }

        ps.mostrarRazas();

        //Parte 2
        System.out.println("\nSeleccione una raza de la lista: ");
        ps.buscarRaza(sc.nextLine());
    }
}
