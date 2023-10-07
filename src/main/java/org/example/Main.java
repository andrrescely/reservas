package org.example;

public class Main {
    public static void main(String[] args) {
        Persona cliente = new Persona("Andres Cel", "123456789", "3214362163");
        Reserva reserva = new Reserva(cliente, "2023-10-30 12:00", "Hotel");

        reserva.hacerReserva();
        reserva.cancelarReserva();

        System.out.println(reserva);
    }
}







