package org.example;

import org.example.Reservable;

public class Reserva implements Reservable {
    private Persona persona;
    private String fechaHora;
    private String tipoReserva;

    public Reserva(Persona persona, String fechaHora, String tipoReserva) {
        this.persona = persona;
        this.fechaHora = fechaHora;
        this.tipoReserva = tipoReserva;
    }

    @Override
    public void hacerReserva() {
        System.out.println("Reserva realizada para " + persona.getNombre() + " el " + fechaHora);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada para " + persona.getNombre() + " el " + fechaHora);
    }

    @Override
    public String toString() {
        return "Reserva para " + persona.getNombre() + " el " + fechaHora + " (" + tipoReserva + ")";
    }
}
