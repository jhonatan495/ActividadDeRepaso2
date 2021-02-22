package com.mycompany.actividadderepaso2;

import java.util.ArrayList;

public class facultad {

    int NumeroOficina;
    String Tipo;
    int Telefono;
    String NombreDelDecano;
    ArrayList escuela;

    public void facultad(int NumeroOficina, String Tipo, int Telefono, String NombreDelDecano) {
        this.NumeroOficina = NumeroOficina;
        this.Tipo = Tipo;
        this.Telefono = Telefono;
        this.NombreDelDecano = NombreDelDecano;
        escuela.add(new facultad());
    }

    public int N_escuela() {

        return escuela.size();
    }

    public int getNumeroOficina() {
        return NumeroOficina;
    }

    public void setNumeroOficina(int NumeroOficina) {
        this.NumeroOficina = NumeroOficina;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreDelDecano() {
        return NombreDelDecano;
    }

    public void setNombreDelDecano(String NombreDelDecano) {
        this.NombreDelDecano = NombreDelDecano;
    }

}
