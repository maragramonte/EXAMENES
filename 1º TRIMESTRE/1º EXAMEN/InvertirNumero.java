import java.util.Scanner;
public class InvertirNumero {

    // Método que invierte los dígitos de un número
    public static int invertirNumero(int numero) {
        int invertido = 0;

        // Mientras el número sea mayor que 0
        while (numero > 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito invertido al número
            invertido = invertido * 10 + digito;

            // Eliminar el último dígito del número
            numero /= 10;
        }

        return invertido;
    }

    // Programa principal para probar el método
    public static void main(String[] args) {
        // Ejemplo 1: Invertir el número 3974
        System.out.println("Invertir 3974: " + invertirNumero(3974)); // Salida: 4793

        // Ejemplo 2: Invertir el número 63
        System.out.println("Invertir 63: " + invertirNumero(63));   // Salida: 36

        // Ejemplo 3: Invertir el número 19
        System.out.println("Invertir 19: " + invertirNumero(19));   // Salida: 91

        // Ejemplo 4: Invertir el número 9
        System.out.println("Invertir 9: " + invertirNumero(9));     // Salida: 9
    }
}
