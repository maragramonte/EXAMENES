
import java.util.HashSet;
import java.util.Set;

public class MatrizVerificacion {

    public static boolean verificarDiagonales(int[][] matriz) {
        // Verificar que la matriz no esté vacía y tenga al menos una fila y una columna
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return false;
        }

        Set<Integer> primeraColumna = new HashSet<>();
        Set<Integer> ultimaFila = new HashSet<>();

        // Recorrer la matriz para llenar los conjuntos
        for (int i = 0; i < matriz.length; i++) {
            // Agregar el elemento de la primera columna
            primeraColumna.add(matriz[i][0]);
        }

        // Recorrer la última fila
        int ultimaFilaIndex = matriz.length - 1;
        for (int j = 0; j < matriz[ultimaFilaIndex].length; j++) {
            // Agregar el elemento de la última fila
            ultimaFila.add(matriz[ultimaFilaIndex][j]);
        }

        // Verificar si hay un solo elemento en cada conjunto
        return primeraColumna.size() == 1 && ultimaFila.size() == 1;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(verificarDiagonales(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}})); // true
        System.out.println(verificarDiagonales(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // false
        System.out.println(verificarDiagonales(new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}})); // true
        System.out.println(verificarDiagonales(new int[][]{{1, 2}, {1, 2}, {1, 3}})); // false
    }
}