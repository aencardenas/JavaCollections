package com.learning.exercise00.Comparator;

import com.learning.exercise00.Entidad.Empleado;

import java.util.Comparator;

public class ComparatorEmpleado{

    public static Comparator<Empleado> ordenarPorNombre = Comparator.comparing(Empleado::getNombre);

    public static Comparator<Empleado> ordenarPorEdad = Comparator.comparing(Empleado::getEdad);
}
