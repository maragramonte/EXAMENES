/* FUNCION especiesDuplicadas(especies)
    // Crear un mapa para contar las ocurrencias de cada especie
    MAPA contador

    // Contar las ocurrencias de cada especie (sin distinción de mayúsculas)
    PARA cada especie EN especies HACER
        // Convertir el nombre de la especie a minúsculas
        especieLower = convertirAminusculas(especie)

        // Actualizar el contador de la especie en el mapa
        contador[especieLower] = contador.obtenerOporDefecto(especieLower, 0) + 1
    FIN PARA

    // Contar cuántas especies tienen más de una ocurrencia
    especiesDuplicadas = 0
    PARA cada count EN contador.valores HACER
        SI count > 1 ENTONCES
            especiesDuplicadas = especiesDuplicadas + 1
        FIN SI
    FIN PARA

    RETORNAR especiesDuplicadas
FIN FUNCION

FUNCION principal()
    // Ejemplos de uso
    IMPRIMIR especiesDuplicadas(["Rosa", "Lirio", "rosa", "Tulipan", "LIRIO", "Margarita"]) // 2
    IMPRIMIR especiesDuplicadas(["Orquidea", "Girasol", "Clavel", "Azucena"]) // 0
    IMPRIMIR especiesDuplicadas(["Bambu", "bambu", "BAMBU", "Bambu"]) // 1
FIN FUNCION */

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