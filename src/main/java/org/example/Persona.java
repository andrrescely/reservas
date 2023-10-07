package org.example;

public class Persona {
    private String nombre;
    private String documento;
    private String numeroContacto;

    public Persona(String nombre, String documento, String numeroContacto) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + documento + ", Contacto: " + numeroContacto;
    }
}
