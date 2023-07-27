package com.learning.exercise08.Entity;

import com.learning.exercise08.CodigosPostalesApp;

public class Ciudad {

    //Atributos de clase
    private String nombreDeCiudad;
    private String codigoPostal;
    //Constructor vacio
    public Ciudad() {
    }

    //Constructor por parametros
    public Ciudad(String nombreDeCiudad, String codigoPostal) {
        this.nombreDeCiudad = nombreDeCiudad;
        this.codigoPostal = codigoPostal;
    }
    //Getters y Setters
    public String getNombreDeCiudad() {
        return nombreDeCiudad;
    }

    public void setNombreDeCiudad(String nombreDeCiudad) {
        this.nombreDeCiudad = nombreDeCiudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
