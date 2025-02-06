
import java.util.HashMap;
import java.util.Map;

public class Plantas {

    public static int especiesDuplicadas(String[] especies) {
        // Mapa para contar las ocurrencias de cada especie
        Map<String, Integer> contador = new HashMap<>();

        // Contar las ocurrencias de cada especie (sin distinción de mayúsculas)
        for (String especie : especies) {
            String especieLower = especie.toLowerCase(); // Convertir a minúsculas
            contador.put(especieLower, contador.getOrDefault(especieLower, 0) + 1);
        }

        // Contar cuántas especies tienen más de una ocurrencia
        int especiesDuplicadas = 0;
        for (int count : contador.values()) {
            if (count > 1) {
                especiesDuplicadas++;
            }
        }

        return especiesDuplicadas;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(especiesDuplicadas(new String[]{"Rosa", "Lirio", "rosa", "Tulipan", "LIRIO", "Margarita"})); // 2
        System.out.println(especiesDuplicadas(new String[]{"Orquidea", "Girasol", "Clavel", "Azucena"})); // 0
        System.out.println(especiesDuplicadas(new String[]{"Bambu", "bambu", "BAMBU", "Bambu"})); // 1
    }
}