import java.util.*;

public class RegistroMuestrasGeneticas {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();

        // Simulación de ingreso de muestras
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\nLista de especies únicas procesadas :");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-001", "Dra. Villegas");
        muestrasInvestigador.put("M-002", "Dra. Moralez");
        muestrasInvestigador.put("M-003", "Dr. Dente");

        System.out.println("\nAsignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Paso 4: Mostrar resultados
        String idBuscar = "M-003";
        System.out.println("\nInvestigador asociado a la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}
