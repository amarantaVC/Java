public class SimuladorFarmacia {
    // Atributos
    String medicamento;
    int cantidad;
    double precioUnitario;
    double totalSinDescuento;
    boolean aplicaDescuento;
    double descuento;
    double totalAPagar;

    // Constructor
    public SimuladorFarmacia(String medicamento, int cantidad, double precioUnitario) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Métodos
    public void calcularTotal() {
        totalSinDescuento = cantidad * precioUnitario;

        // Verificar si aplica descuento
        aplicaDescuento = totalSinDescuento > 500.00;

        descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        totalAPagar = aplicaDescuento ? totalSinDescuento - descuento : totalSinDescuento;
    }

    public void mostrarInformacion() {
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);
    }
}
