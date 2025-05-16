public class Principal {
    public static void main(String[] args) {
        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("UX123", "Paris", "40:30 AM");

        // Crear un pasajero
        Pasajero pasajero1 = new Pasajero("Julian Castro", "CP136254");

        // Reservar asiento para el pasajero
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("Felicidades! su reserva fue realizada con éxito.");
            vuelo1.mostrarItinerario();
        } else {
            System.out.println("Oh no! No se pudo reservar el asiento.");
        }

        // Cancelar la reserva
        vuelo1.cancelarReserva();

        // Mostrar itinerario después de cancelar la reserva
        vuelo1.mostrarItinerario();

        // Reservar asiento con nombre y pasaporte
        if (vuelo1.reservarAsiento("Carmen Yegres", "LT632695")) {
            System.out.println("\nReserva realizada con éxito.");
            vuelo1.mostrarItinerario();
        } else {
            System.out.println("No se pudo reservar el asiento.");
        }

    }
}
