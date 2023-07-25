package com.learning.exercise00.Service;

import com.learning.exercise00.Entidad.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
    public static List<Empleado> listaDeEmpleados = new ArrayList<>();

    public void mostrarEmpleados() {
        for (Empleado empleado: listaDeEmpleados) {
            System.out.println("");
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Pais: " + empleado.getPais());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Sueldo: " + empleado.getSueldo());

        }
    }


}
