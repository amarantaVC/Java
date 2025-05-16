public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Amaranta");
        Patrulla patrulla = new Patrulla("Patrulla", "Dante");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Josue");

        ambulancia.iniciarOperacion();

        patrulla.iniciarOperacion();

        bomberos.iniciarOperacion();
    }
}
