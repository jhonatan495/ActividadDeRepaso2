package com.mycompany.actividadderepaso2;

import java.util.ArrayList;

public class escuela {

    String NombreEscuela;
    String NombreDirector;
    int NumeroOficina;
    int telefono;
    ArrayList profesor;

    public void escuela(String NombreEscuela, String NombreDirector, int NumeroOficina, int telefono) {
        this.NombreEscuela = NombreEscuela;
        this.NombreDirector = NombreDirector;
        this.NumeroOficina = NumeroOficina;
        this.telefono = telefono;
        profesor.add(new escuela());
    }

    public int N_profesor() {

        return profesor.size();
    }

    public String getNombreEscuela() {
        return NombreEscuela;
    }

    public void setNombreEscuela(String NombreEscuela) {
        this.NombreEscuela = NombreEscuela;
    }

    public String getNombreDirector() {
        return NombreDirector;
    }

    public void setNombreDirector(String NombreDirector) {
        this.NombreDirector = NombreDirector;
    }

    public int getNumeroOficina() {
        return NumeroOficina;
    }

    public void setNumeroOficina(int NumeroOficina) {
        this.NumeroOficina = NumeroOficina;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
