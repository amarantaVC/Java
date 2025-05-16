public class Principal {

    public static void main(String[] args) {
        // Create a declaration
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("RFC963", 1000.0);

        // Create a fiscal account
        CuentaFiscal cuentaFiscal = new CuentaFiscal("RFC963", 9500.0);

        // Show account info
        System.out.println("Declaracion enviada por RFC: " + declaracion.rfcContribuyente() + ", por $" + declaracion.montoDeclarado());
        cuentaFiscal.mostrarCuenta();

        // Validate RFC
        System.out.println("¿RFC válido para esta cuenta?: " + cuentaFiscal.validarRFC(declaracion));
    }
}
