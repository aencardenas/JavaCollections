package com.learning.exercise03.Service;

import com.learning.exercise03.Entidad.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    //Lista de alumnos
    private List<Alumno> listaDeAlumnos = new ArrayList<>();

    public void crearAlumnos() {
        Scanner sc = new Scanner(System.in);
        Alumno alumno;
        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")) { //Bucle while para crear alumnos
            alumno = new Alumno();
            System.out.println("\nIngresando alumno: ");
            System.out.print("Ingresa el nombre: ");
            alumno.setNombre(sc.nextLine());
            System.out.print("Calificacion parcial 1: ");
            addCalificaciones(Integer.parseInt(sc.nextLine()),alumno);
            System.out.print("Calificacion parcial 2: ");
            addCalificaciones(Integer.parseInt(sc.nextLine()),alumno);
            System.out.print("Calificacion parcial 3: ");
            addCalificaciones(Integer.parseInt(sc.nextLine()),alumno);
            listaDeAlumnos.add(alumno);
            System.out.print("Desea ingresar otro alumno(S/N): ");
            opcion = sc.nextLine();
        }

        //Calcular la nota final del alumno requerido
        Alumno alumnoBusqueda = buscarAlumno();
        if (alumnoBusqueda != null) {
            notaFinal(alumnoBusqueda);
        } else {
            System.out.println("El alumno no esta en la lista");
        }

    }

    private void addCalificaciones(Integer calificacion, Alumno alumno) {
        alumno.getCalificaciones().add(calificacion);
    }

    private Alumno buscarAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngresa el nombre del alumno para calcular su nota final: ");
        String nombreDeAlumno = sc.nextLine();
        for (Alumno alumno:listaDeAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreDeAlumno)) {
                return alumno;
            }
        }

        return null;
    }

    private void notaFinal(Alumno alumno) {
        int sumaDeCalificaciones = 0;
        for (int i = 0; i < 3; i++) {
            sumaDeCalificaciones += alumno.getCalificaciones().get(i);

        }

        System.out.println("El promedio de " + alumno.getNombre() + " es: " + (sumaDeCalificaciones/3));
    }




}
