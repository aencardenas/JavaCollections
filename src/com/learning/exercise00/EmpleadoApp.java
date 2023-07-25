package com.learning.exercise00;

import com.learning.exercise00.Comparator.ComparatorEmpleado;
import com.learning.exercise00.Entidad.Empleado;
import com.learning.exercise00.Service.EmpleadoService;

import java.util.Collections;


public class EmpleadoApp {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoService();

        EmpleadoService.listaDeEmpleados.add(new Empleado("Andres","Cardenas","Mexico",23,10500));
        EmpleadoService.listaDeEmpleados.add((new Empleado("Mariana","Ampudia","Mexico",24,12000)));
        EmpleadoService.listaDeEmpleados.add(new Empleado("Elizabeth","Martinez","Venezuela",21,11000));
        EmpleadoService.listaDeEmpleados.add(new Empleado("Brian","Cardenas","Mexico",25,15000));
        EmpleadoService.listaDeEmpleados.add(new Empleado("Frida","Potenciano","Espana",12,300));

        System.out.println("Objetos ordenados por nombre: ");
        Collections.sort(EmpleadoService.listaDeEmpleados, ComparatorEmpleado.ordenarPorNombre);
        empleadoService.mostrarEmpleados();

        System.out.println("\nObjetos ordenados por edad: ");
        Collections.sort(EmpleadoService.listaDeEmpleados, ComparatorEmpleado.ordenarPorEdad);
        empleadoService.mostrarEmpleados();
    }
}
