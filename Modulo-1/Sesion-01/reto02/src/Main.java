public class Main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Conferencia", 3650.42);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        System.out.println("\nDesafio adicional: entrada record");

        Entrada_Record entradaR1 = new Entrada_Record("Concierto", 455.00);
        Entrada_Record entradaR2 = new Entrada_Record("Congreso", 456.78);

        entradaR1.mostrarInformacion();
        entradaR2.mostrarInformacion();
    }
}
