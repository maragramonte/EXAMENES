/* INICIO

// Método para verificar si una matriz es mágica
FUNCION isMagicSquare(matriz)
    SI matriz ES NULO O ESTÁ VACÍA O NO ES CUADRADA ENTONCES
        RETORNAR FALSO  // No es una matriz cuadrada o es nula/vacía
    FIN SI

    n ← LONGITUD(matriz)  // Tamaño de la matriz (N x N)
    sumaMagica ← 0  // Suma mágica (se calcula con la primera fila)

    // Calcular la suma mágica (suma de la primera fila)
    PARA j DESDE 0 HASTA n - 1 HACER
        sumaMagica ← sumaMagica + matriz[0][j]
    FIN PARA

    // Verificar la suma de cada fila
    PARA i DESDE 1 HASTA n - 1 HACER
        sumaFila ← 0
        PARA j DESDE 0 HASTA n - 1 HACER
            sumaFila ← sumaFila + matriz[i][j]
        FIN PARA
        SI sumaFila ≠ sumaMagica ENTONCES
            RETORNAR FALSO  // La suma de la fila no coincide con la suma mágica
        FIN SI
    FIN PARA

    // Verificar la suma de cada columna
    PARA j DESDE 0 HASTA n - 1 HACER
        sumaColumna ← 0
        PARA i DESDE 0 HASTA n - 1 HACER
            sumaColumna ← sumaColumna + matriz[i][j]
        FIN PARA
        SI sumaColumna ≠ sumaMagica ENTONCES
            RETORNAR FALSO  // La suma de la columna no coincide con la suma mágica
        FIN SI
    FIN PARA

    // Verificar la suma de la diagonal principal
    sumaDiagonal1 ← 0
    PARA i DESDE 0 HASTA n - 1 HACER
        sumaDiagonal1 ← sumaDiagonal1 + matriz[i][i]
    FIN PARA
    SI sumaDiagonal1 ≠ sumaMagica ENTONCES
        RETORNAR FALSO  // La suma de la diagonal principal no coincide con la suma mágica
    FIN SI

    // Verificar la suma de la diagonal secundaria
    sumaDiagonal2 ← 0
    PARA i DESDE 0 HASTA n - 1 HACER
        sumaDiagonal2 ← sumaDiagonal2 + matriz[i][n - 1 - i]
    FIN PARA
    SI sumaDiagonal2 ≠ sumaMagica ENTONCES
        RETORNAR FALSO  // La suma de la diagonal secundaria no coincide con la suma mágica
    FIN SI

    RETORNAR VERDADERO  // La matriz es mágica
FIN FUNCION

// PROGRAMA PRINCIPAL
INICIO
    // Definir y probar la primera matriz (1x1 mágica)
    matriz1 ← {{6}}
    IMPRIMIR "Matriz 1 es mágica: " + isMagicSquare(matriz1)  // VERDADERO

    // Definir y probar la segunda matriz (2x2 no mágica)
    matriz2 ← {{1, 2}, {3, 4}}
    IMPRIMIR "Matriz 2 es mágica: " + isMagicSquare(matriz2)  // FALSO

    // Definir y probar la tercera matriz (3x3 mágica)
    matriz3 ← {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}
    IMPRIMIR "Matriz 3 es mágica: " + isMagicSquare(matriz3)  // VERDADERO

    // Definir y probar la cuarta matriz (4x4 mágica)
    matriz4 ← {{1, 15, 14, 4}, {12, 6, 7, 9}, {8, 10, 11, 5}, {13, 3, 2, 16}}
    IMPRIMIR "Matriz 4 es mágica: " + isMagicSquare(matriz4)  // VERDADERO

    // Definir y probar la quinta matriz (nula)
    matriz5 ← NULO
    IMPRIMIR "Matriz 5 es mágica: " + isMagicSquare(matriz5)  // FALSO
FIN
 */

public class MatrizMagica {

    // Método para verificar si una matriz es mágica
    public static boolean isMagicSquare(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz.length != matriz[0].length) {
            return false;  // No es una matriz cuadrada o es nula/vacía
        }

        int n = matriz.length;  // Tamaño de la matriz (N x N)
        int sumaMagica = 0;     // Suma mágica (se calcula con la primera fila)

        // Calcular la suma mágica (suma de la primera fila)
        for (int j = 0; j < n; j++) {
            sumaMagica += matriz[0][j];
        }

        // Verificar la suma de cada fila
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaMagica) {
                return false;  // La suma de la fila no coincide con la suma mágica
            }
        }

        // Verificar la suma de cada columna
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaMagica) {
                return false;  // La suma de la columna no coincide con la suma mágica
            }
        }

        // Verificar la suma de la diagonal principal
        int sumaDiagonal1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal1 += matriz[i][i];
        }
        if (sumaDiagonal1 != sumaMagica) {
            return false;  // La suma de la diagonal principal no coincide con la suma mágica
        }

        // Verificar la suma de la diagonal secundaria
        int sumaDiagonal2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal2 += matriz[i][n - 1 - i];
        }
        if (sumaDiagonal2 != sumaMagica) {
            return false;  // La suma de la diagonal secundaria no coincide con la suma mágica
        }

        return true;  // La matriz es mágica
    }

    public static void main(String[] args) {
        // Ejemplo 1: Matriz 1x1
        int[][] matriz1 = {{6}};
        System.out.println("Matriz 1 es mágica: " + isMagicSquare(matriz1));  // true

        // Ejemplo 2: Matriz 2x2 no mágica
        int[][] matriz2 = {{1, 2}, {3, 4}};
        System.out.println("Matriz 2 es mágica: " + isMagicSquare(matriz2));  // false

        // Ejemplo 3: Matriz 3x3 mágica
        int[][] matriz3 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        System.out.println("Matriz 3 es mágica: " + isMagicSquare(matriz3));  // true

        // Ejemplo 4: Matriz 4x4 mágica
        int[][] matriz4 = {{1, 15, 14, 4}, {12, 6, 7, 9}, {8, 10, 11, 5}, {13, 3, 2, 16}};
        System.out.println("Matriz 4 es mágica: " + isMagicSquare(matriz4));  // true

        // Ejemplo 5: Matriz nula
        int[][] matriz5 = null;
        System.out.println("Matriz 5 es mágica: " + isMagicSquare(matriz5));  // false
    }
}