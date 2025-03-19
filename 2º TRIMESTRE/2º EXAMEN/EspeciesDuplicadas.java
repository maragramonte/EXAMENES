/* INICIO

// Método para contar especies duplicadas
FUNCION especiesDuplicadas(especies)
    SI especies ES NULO O ESTÁ VACÍO ENTONCES
        RETORNAR 0  // No hay especies duplicadas
    FIN SI

    CREAR conjunto especiesUnicas VACÍO
    CREAR conjunto especiesDuplicadas VACÍO

    PARA CADA especie EN especies HACER
        especieNormalizada ← CONVERTIR A MINÚSCULAS(especie)
        SI especieNormalizada NO PUEDE AGREGARSE A especiesUnicas ENTONCES
            AGREGAR especieNormalizada A especiesDuplicadas
        FIN SI
    FIN PARA

    RETORNAR tamaño de especiesDuplicadas
FIN FUNCION

// PROGRAMA PRINCIPAL
INICIO
    // Definir y probar el primer conjunto de especies
    especies1 ← {"Rosa", "Lirio", "rosa", "Tulipan", "LIRIO", "Margarita"}
    IMPRIMIR "Especies duplicadas (Ejemplo 1): " + especiesDuplicadas(especies1)  // 2

    // Definir y probar el segundo conjunto de especies
    especies2 ← {"Orquidea", "Girasol", "Clavel", "Azucena"}
    IMPRIMIR "Especies duplicadas (Ejemplo 2): " + especiesDuplicadas(especies2)  // 0

    // Definir y probar el tercer conjunto de especies
    especies3 ← {"Bambu", "bambu", "BAMBU", "Bambu"}
    IMPRIMIR "Especies duplicadas (Ejemplo 3): " + especiesDuplicadas(especies3)  // 1
FIN
 */

import java.util.HashSet;
import java.util.Set;

public class EspeciesDuplicadas { 

    // Método para contar especies duplicadas
    public static int especiesDuplicadas(String[] especies) {
        if (especies == null || especies.length == 0) {
            return 0;  // Si el array es nulo o vacío, no hay especies duplicadas
        }

        Set<String> especiesUnicas = new HashSet<>();
        Set<String> especiesDuplicadas = new HashSet<>();

        for (String especie : especies) {
            String especieNormalizada = especie.toLowerCase();  // Normalizar a minúsculas
            if (!especiesUnicas.add(especieNormalizada)) {
                especiesDuplicadas.add(especieNormalizada);
            }
        }

        return especiesDuplicadas.size();
    }

    public static void main(String[] args) {
        // Ejemplo 1
        String[] especies1 = {"Rosa", "Lirio", "rosa", "Tulipan", "LIRIO", "Margarita"};
        System.out.println("Especies duplicadas (Ejemplo 1): " + especiesDuplicadas(especies1));  // 2

        // Ejemplo 2
        String[] especies2 = {"Orquidea", "Girasol", "Clavel", "Azucena"};
        System.out.println("Especies duplicadas (Ejemplo 2): " + especiesDuplicadas(especies2));  // 0

        // Ejemplo 3
        String[] especies3 = {"Bambu", "bambu", "BAMBU", "Bambu"};
        System.out.println("Especies duplicadas (Ejemplo 3): " + especiesDuplicadas(especies3));  // 1
    }
}