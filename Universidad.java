package com.mycompany.actividadderepaso2;

import java.util.ArrayList;

public class Universidad {

    String Direccion;
    int Telefono;
    double Extendion;
    ArrayList facultad;

    public void Universidad(String Direccion, int Telefono, double Extendion) {
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Extendion = Extendion;
        facultad.add(new Universidad());
    }

    public int N_facultad() {

        return facultad.size();
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public double getExtendion() {
        return Extendion;
    }

    public void setExtendion(double Extendion) {
        this.Extendion = Extendion;
    }

}
