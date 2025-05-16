import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var saldo = 1000.0; //saldo inicial
        int opcion;


        do {
            // Mostramos menú de opciones
            System.out.println("Bienvenido al Cajero Automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // se lee la opción del usuario
            opcion = entrada.nextInt();

            // ejecutamos la opción seleccionada
            switch (opcion) {
                case 1 -> {
                    // buscamos consultar saldo
                    System.out.println("Su saldo es: $" + saldo);
                }
                case 2 -> {
                    // se deposita el dinero
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = entrada.nextDouble();

                    if (cantidadDeposito <= 0) {
                        System.out.println("La cantidad a depositar debe ser mayor que cero.");
                        continue; // volvemos al inicio
                    }

                    saldo += cantidadDeposito;
                    System.out.println("Felicidades! su depósito fue exitoso. Su nuevo saldo es: $" + saldo);
                }
                case 3 -> {
                    // se retira el dinero
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = entrada.nextDouble();

                    if (cantidadRetiro <= 0) {
                        System.out.println("Ten encuenta que la cantidad a retirar debe ser mayor que cero.");
                        continue;
                    }

                    if (cantidadRetiro <= saldo) {
                        saldo -= cantidadRetiro;
                        System.out.println("Felicidades! su retiro fue exitoso. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Oh no! Fondos insuficientes. Su saldo actual es: $" + saldo);
                    }
                }
                case 4 -> {
                    // Salir
                    System.out.println("Gracias por usar el Cajero Automático. ¡Hasta luego!");
                }
                default -> {
                    // Opción no válida
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                }
            }
        } while (opcion != 4);

        entrada.close();
    }
}