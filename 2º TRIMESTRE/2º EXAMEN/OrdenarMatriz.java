/* INICIO

// Método para ordenar una matriz bidimensional
FUNCION ordenarMatriz(matriz, ascendente)
    CREAR lista VACÍA
    // Convertir la matriz en una lista de enteros
    PARA CADA fila EN matriz HACER
        PARA CADA valor EN fila HACER
            AGREGAR valor A lista
        FIN PARA
    FIN PARA

    // Ordenar la lista
    SI ascendente ES VERDADERO ENTONCES
        ORDENAR lista EN ORDEN ASCENDENTE
    SINO
        ORDENAR lista EN ORDEN DESCENDENTE
    FIN SI

    // Reconstruir la matriz con los elementos ordenados
    index ← 0
    PARA i DESDE 0 HASTA LONGITUD(matriz) - 1 HACER
        PARA j DESDE 0 HASTA LONGITUD(matriz[i]) - 1 HACER
            matriz[i][j] ← lista[index]
            index ← index + 1
        FIN PARA
    FIN PARA
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
    // Definir y mostrar la primera matriz
    matriz1 ← {{9, 8, 5}, {4, 2, 1}}
    IMPRIMIR "Matriz original 1:"
    imprimirMatriz(matriz1)

    // Ordenar y mostrar la primera matriz en orden descendente
    ordenarMatriz(matriz1, FALSO)
    IMPRIMIR "Matriz ordenada descendentemente:"
    imprimirMatriz(matriz1)

    // Definir y mostrar la segunda matriz
    matriz2 ← {{8, 1, 5}, {4, 2, 10}}
    IMPRIMIR "Matriz original 2:"
    imprimirMatriz(matriz2)

    // Ordenar y mostrar la segunda matriz en orden ascendente
    ordenarMatriz(matriz2, VERDADERO)
    IMPRIMIR "Matriz ordenada ascendentemente:"
    imprimirMatriz(matriz2)
FIN
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarMatriz {

    // Método para ordenar una matriz bidimensional
    public static void ordenarMatriz(int[][] matriz, boolean ascendente) {
        // Paso 1: Convertir la matriz en una lista de enteros
        List<Integer> lista = new ArrayList<>();
        for (int[] fila : matriz) {
            for (int valor : fila) {
                lista.add(valor);
            }
        }

        // Paso 2: Ordenar la lista
        if (ascendente) {
            Collections.sort(lista);  // Orden ascendente
        } else {
            Collections.sort(lista, Collections.reverseOrder());  // Orden descendente
        }

        // Paso 3: Reconstruir la matriz con los elementos ordenados
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lista.get(index++);
            }
        }
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
            {9, 8, 5},
            {4, 2, 1}
        };

        System.out.println("Matriz original 1:");
        imprimirMatriz(matriz1);

        ordenarMatriz(matriz1, false);  // Orden descendente
        System.out.println("\nMatriz ordenada descendentemente:");
        imprimirMatriz(matriz1);

        // Ejemplo 2
        int[][] matriz2 = {
            {8, 1, 5},
            {4, 2, 10}
        };

        System.out.println("\nMatriz original 2:");
        imprimirMatriz(matriz2);

        ordenarMatriz(matriz2, true);  // Orden ascendente
        System.out.println("\nMatriz ordenada ascendentemente:");
        imprimirMatriz(matriz2);
    }
}