/* función secuenciaCompleta(input):
    dividir input en un arreglo de cadenas partes usando espacio como delimitador
    convertir cada cadena de partes a un número entero y almacenar en el arreglo numeros
    
    encontrar el valor mínimo de numeros y almacenarlo en min
    encontrar el valor máximo de numeros y almacenarlo en max
    
    crear un arreglo de booleanos presentes con tamaño (max - min + 1)
    
    para cada numero en numeros:
        marcar como verdadero en presentes[numero - min]
    
    crear una cadena vacía faltantes
    
    para cada índice i desde 0 hasta el tamaño de presentes - 1:
        si presentes[i] es falso:
            agregar el valor (i + min) a faltantes
    
    si faltantes está vacío:
        devolver "1"
    sino:
        devolver faltantes sin el último espacio extra

función principal:
    imprimir secuenciaCompleta("1 3 4 6")    // Debe devolver "2 5"
    imprimir secuenciaCompleta("1 2 3 4 5")  // Debe devolver "1"
    imprimir secuenciaCompleta("5 7 9 10")   // Debe devolver "6 8" */

import java.util.Arrays;

public class Secuencia {

    public static String secuenciaCompleta(String input) {
        // Dividir la cadena de entrada en un array de cadenas
        String[] partes = input.split(" ");
        
        // Convertir las cadenas a un array de enteros
        int[] numeros = Arrays.stream(partes)
                              .mapToInt(Integer::parseInt)
                              .toArray();
        
        // Encontrar el mínimo y el máximo de la secuencia
        int min = Arrays.stream(numeros).min().orElse(Integer.MAX_VALUE);
        int max = Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);
        
        // Crear un array de booleanos para marcar los números presentes en la secuencia
        boolean[] presentes = new boolean[max - min + 1];
        
        // Marcar los números presentes en el array
        for (int num : numeros) {
            presentes[num - min] = true;
        }
        
        // Crear un StringBuilder para almacenar los números faltantes
        StringBuilder faltantes = new StringBuilder();
        
        // Buscar los números faltantes en la secuencia
        for (int i = 0; i < presentes.length; i++) {
            if (!presentes[i]) {
                faltantes.append(i + min).append(" ");
            }
        }
        
        // Si no hay números faltantes, devolver "1"
        if (faltantes.length() == 0) {
            return "1";
        }
        
        // Convertir el StringBuilder a una cadena y eliminar el último espacio
        return faltantes.toString().trim();
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(secuenciaCompleta("1 3 4 6")); // "2 5"
        System.out.println(secuenciaCompleta("1 2 3 4 5")); // "1"
        System.out.println(secuenciaCompleta("5 7 9 10")); // "6 8"
    }
}
