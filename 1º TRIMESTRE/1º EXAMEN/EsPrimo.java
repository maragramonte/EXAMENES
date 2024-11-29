import java.util.Scanner;
public class EsPrimo {

    // Método que comprueba si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número tiene divisores distintos de 1 y él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Si el número es divisible por i, no es primo
            }
        }

        // Si no tiene divisores, es primo
        return true;
    }

    // Programa principal para probar el método
    public static void main(String[] args) {
        // Ejemplo 1: Comprobar si 3 es primo
        System.out.println("¿Es 3 primo? " + esPrimo(3)); // Salida: true

        // Ejemplo 2: Comprobar si 15 es primo
        System.out.println("¿Es 15 primo? " + esPrimo(15)); // Salida: false

        // Ejemplo 3: Comprobar si 1 es primo
        System.out.println("¿Es 1 primo? " + esPrimo(1)); // Salida: false

        // Ejemplo 4: Comprobar si 7 es primo
        System.out.println("¿Es 7 primo? " + esPrimo(7)); // Salida: true
    }
}
