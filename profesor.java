
package com.mycompany.actividadderepaso2;


public class profesor {
    String NombreCompleto;
    String CorreoElectronico;

    public profesor(String NombreCompleto, String CorreoElectronico) {
        this.NombreCompleto = NombreCompleto;
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    
}
