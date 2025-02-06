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
