package com.learning.exercise06;

import com.learning.exercise06.Service.ProductosService;

import java.util.Scanner;

public class ProductosApp {
    public static void main(String[] args) {
        ProductosService productosService = new ProductosService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\t\nADIDAS-eSTORE");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precios");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){

                case 1:
                    productosService.agregarProducto();
                    break;
                case 2:
                    System.out.print("\nIngresa el nombre del producto: ");
                    productosService.modificarPrecioDeProducto(sc.nextLine().toUpperCase());
                    break;
                case 3:
                    System.out.print("\nIngresa el nombre del producto: ");
                    productosService.eliminarProducto(sc.nextLine().toUpperCase());
                    break;
                case 4:
                    productosService.mostrarProductoYPrecios();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while(choice != 5);
    }

}
