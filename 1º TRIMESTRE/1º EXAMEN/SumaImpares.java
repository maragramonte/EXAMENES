import java.util.Scanner;
public class SumaImpares {

    // Método que suma los números impares en el intervalo [a, b]
    public static int sumaImpares(int a, int b) {
        int suma = 0;
        
        // Si a es mayor que b, el intervalo es inválido, retornamos 0
        if (a > b) {
            return 0;
        }

        // Iteramos desde a hasta b (inclusive)
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {  // Si el número es impar
                suma += i;
            }
        }

        return suma;
    }

    // Programa principal para probar el método
    public static void main(String[] args) {
        // Ejemplo 1: suma de impares entre 3 y 7
        System.out.println("Suma de impares entre 3 y 7: " + sumaImpares(3, 7)); // Salida: 15

        // Ejemplo 2: suma de impares entre 7 y 3 (intervalo inválido)
        System.out.println("Suma de impares entre 7 y 3: " + sumaImpares(7, 3)); // Salida: 0

        // Ejemplo 3: suma de impares entre 4 y 8
        System.out.println("Suma de impares entre 4 y 8: " + sumaImpares(4, 8)); // Salida: 12
    }
}