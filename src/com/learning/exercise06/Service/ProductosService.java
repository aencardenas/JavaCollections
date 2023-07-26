package com.learning.exercise06.Service;

import com.learning.exercise06.Entity.Productos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductosService {

    private HashMap<String,Double> mapDeProductos = new HashMap<>();

    public void agregarProducto () {
        Scanner sc = new Scanner(System.in);
        Productos producto = new Productos();

        System.out.print("\nIngresa el nombre del producto: ");
        producto.setNombreDeProducto(sc.nextLine().toUpperCase());

        System.out.print("Ingresa el precio del producto: ");
        producto.setPrecioProducto(sc.nextDouble());

        mapDeProductos.put(producto.getNombreDeProducto(), producto.getPrecioProducto());
    }

    public void modificarPrecioDeProducto (String keyProducto) {
        Scanner sc = new Scanner(System.in);

        boolean isProducto = mapDeProductos.containsKey(keyProducto);

        while (!isProducto) {
            System.out.print("\nEl producto no existe, ingresa uno nuevamente: ");
            keyProducto = sc.nextLine().toUpperCase();
            isProducto = mapDeProductos.containsKey(keyProducto);
        }

        System.out.print("Ingresa el nuevo precio de " + keyProducto + ": ");
        mapDeProductos.put(keyProducto, sc.nextDouble());
    }

    public void eliminarProducto (String keyProducto) {
        Scanner sc = new Scanner(System.in);
        boolean isProducto = mapDeProductos.containsKey(keyProducto);

        while (!isProducto) {
            System.out.print("\nEl producto no existe, ingresa uno nuevamente: ");
            keyProducto = sc.nextLine().toUpperCase();
            isProducto = mapDeProductos.containsKey(keyProducto);
        }

        System.out.println("\nProducto eliminado");
        mapDeProductos.remove(keyProducto);
    }

    public void mostrarProductoYPrecios () {
        System.out.println("\nLista de productos:");
        for (Map.Entry<String,Double> entry:mapDeProductos.entrySet()) {
            String producto = entry.getKey();
            Double precio = entry.getValue();

            System.out.println("Producto: " + producto + ", Precio: " + precio);
        }
    }
}
