/* INICIO

// Método para verificar si los elementos de la primera columna y la última fila son idénticos
FUNCION verificarDiagonales(matriz)
    SI matriz ES NULO O ESTÁ VACÍA ENTONCES
        RETORNAR FALSO  // Matriz vacía o nula
    FIN SI

    filas ← LONGITUD(matriz)
    columnas ← LONGITUD(matriz[0])

    // Verificar si todos los elementos de la primera columna son iguales
    PARA i DESDE 1 HASTA filas - 1 HACER
        SI matriz[i][0] ≠ matriz[0][0] ENTONCES
            RETORNAR FALSO  // Elementos de la primera columna no son iguales
        FIN SI
    FIN PARA

    // Verificar si todos los elementos de la última fila son iguales
    PARA j DESDE 1 HASTA columnas - 1 HACER
        SI matriz[filas - 1][j] ≠ matriz[filas - 1][0] ENTONCES
            RETORNAR FALSO  // Elementos de la última fila no son iguales
        FIN SI
    FIN PARA

    RETORNAR VERDADERO  // Ambas condiciones se cumplen
FIN FUNCION

// Método para imprimir una matriz
FUNCION imprimirMatriz(matriz)
    PARA CADA fila EN matriz HACER
        PARA CADA valor EN fila HACER
            IMPRIMIR valor SIN SALTO DE LÍNEA
        FIN PARA
        IMPRIMIR SALTO DE LÍNEA
    FIN PARA
FIN FUNCION

// PROGRAMA PRINCIPAL
INICIO
    // Definir y probar la primera matriz
    matriz1 ← {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}
    IMPRIMIR "Matriz 1:"
    imprimirMatriz(matriz1)
    IMPRIMIR "Resultado: " + verificarDiagonales(matriz1)  // VERDADERO

    // Definir y probar la segunda matriz
    matriz2 ← {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
    IMPRIMIR "Matriz 2:"
    imprimirMatriz(matriz2)
    IMPRIMIR "Resultado: " + verificarDiagonales(matriz2)  // FALSO

    // Definir y probar la tercera matriz (No cuadrada)
    matriz3 ← {{5, 6, 7}, {5, 8, 9}, {5, 10, 11}}
    IMPRIMIR "Matriz 3:"
    imprimirMatriz(matriz3)
    IMPRIMIR "Resultado: " + verificarDiagonales(matriz3)  // VERDADERO
FIN
 */

public class VerificarDiagonales {

    // Método para verificar si los elementos de la primera columna y la última fila son idénticos
    public static boolean verificarDiagonales(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return false;  // Matriz vacía o nula
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si todos los elementos de la primera columna son iguales
        for (int i = 1; i < filas; i++) {
            if (matriz[i][0] != matriz[0][0]) {
                return false;  // Elementos de la primera columna no son iguales
            }
        }

        // Verificar si todos los elementos de la última fila son iguales
        for (int j = 1; j < columnas; j++) {
            if (matriz[filas - 1][j] != matriz[filas - 1][0]) {
                return false;  // Elementos de la última fila no son iguales
            }
        }

        return true;  // Ambas condiciones se cumplen
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplo 1
        int[][] matriz1 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Resultado: " + verificarDiagonales(matriz1));  // true

        // Ejemplo 2
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Resultado: " + verificarDiagonales(matriz2));  // false

        // Ejemplo 3 (Matriz no cuadrada)
        int[][] matriz3 = {
            {5, 6, 7},
            {5, 8, 9},
            {5, 10, 11}
        };

        System.out.println("\nMatriz 3:");
        imprimirMatriz(matriz3);
        System.out.println("Resultado: " + verificarDiagonales(matriz3));  // true
    }
}