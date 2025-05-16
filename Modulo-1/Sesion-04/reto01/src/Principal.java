public class Principal {
    public static void main(String[] args) {
        // Create 2 Factura objects with the same folio
        Factura factura1 = new Factura("FAC001", "Pedro Marquez", 1450.00);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450.00);

        // Print the Factura objects
        System.out.println(factura1);
        System.out.println(factura2);

        // Compare the Factura objects
        System.out.println("¿Las facturas son iguales?: " + factura1.equals(factura2));
    }
}
