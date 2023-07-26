package com.learning.exercise05;

import com.learning.exercise05.Service.PaisService;

import java.util.Scanner;

public class PaisApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaisService paisService = new PaisService();
        paisService.crearPais();
        System.out.println("\nPaises ordenados alfabeticamente");
        paisService.ordenarPaisesAlfabeticamente();
        System.out.print("\nElige un pais: ");
        paisService.eliminarPais(sc.nextLine());
        paisService.mostrarPaises();
    }

}
