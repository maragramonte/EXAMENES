/* Algoritmo verificarDiagonales
    Entrada: matriz (una matriz bidimensional de enteros)
    Salida: Verdadero si los elementos de la primera columna y la última fila son iguales entre sí, Falso en caso contrario

    Si matriz es nula o matriz está vacía o la primera fila de la matriz está vacía
        Retornar Falso
    Fin Si

    Crear conjunto primeraColumna vacío
    Crear conjunto ultimaFila vacío

    Para cada fila en la matriz hacer
        Agregar el primer elemento de la fila al conjunto primeraColumna
    Fin Para

    Asignar el índice de la última fila de la matriz a ultimaFilaIndex

    Para cada elemento en la última fila de la matriz hacer
        Agregar el elemento de la última fila al conjunto ultimaFila
    Fin Para

    Si el tamaño de primeraColumna es 1 y el tamaño de ultimaFila es 1
        Retornar Verdadero
    Sino
        Retornar Falso
    Fin Si
Fin Algoritmo


Algoritmo principal
    Imprimir verificarDiagonales([[1, 2, 3], [1, 2, 3], [1, 2, 3]])  // Debería imprimir Verdadero
    Imprimir verificarDiagonales([[1, 2, 3], [4, 5, 6], [7, 8, 9]])  // Debería imprimir Falso
    Imprimir verificarDiagonales([[2, 2, 2], [2, 2, 2], [2, 2, 2]])  // Debería imprimir Verdadero
    Imprimir verificarDiagonales([[1, 2], [1, 2], [1, 3]])  // Debería imprimir Falso
Fin Algoritmo
 */
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
