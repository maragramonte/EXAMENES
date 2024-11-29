import java.util.Scanner;
public class Consultorio {

    // Método que calcula el coste de la consulta según el número de cita
    public static int costeConsulta(int numeroCita) {
        // Si es la primera o segunda cita
        if (numeroCita == 1 || numeroCita == 2) {
            return 200; // 200 euros por consulta
        }
        // Si es la tercera, cuarta o quinta cita
        else if (numeroCita >= 3 && numeroCita <= 5) {
            return 150; // 150 euros por consulta
        }
        // Si es la sexta cita o cualquier cita posterior
        else if (numeroCita >= 6) {
            return 100; // 100 euros por consulta
        }
        // Si el número de cita es inválido
        else {
            return 0; // Retornar 0 si el número de cita es menor que 1
        }
    }

    // Programa principal para probar la función
    public static void main(String[] args) {
        // Ejemplo 1: Cita 1
        System.out.println("Coste de la consulta para la cita 1: " + costeConsulta(1)); // Salida: 200

        // Ejemplo 2: Cita 2
        System.out.println("Coste de la consulta para la cita 2: " + costeConsulta(2)); // Salida: 200

        // Ejemplo 3: Cita 3
        System.out.println("Coste de la consulta para la cita 3: " + costeConsulta(3)); // Salida: 150

        // Ejemplo 4: Cita 5
        System.out.println("Coste de la consulta para la cita 5: " + costeConsulta(5)); // Salida: 150

        // Ejemplo 5: Cita 6
        System.out.println("Coste de la consulta para la cita 6: " + costeConsulta(6)); // Salida: 100

        // Ejemplo 6: Cita 10
        System.out.println("Coste de la consulta para la cita 10: " + costeConsulta(10)); // Salida: 100

        // Ejemplo 7: Cita -1 (cita inválida)
        System.out.println("Coste de la consulta para la cita -1: " + costeConsulta(-1)); // Salida: 0
    }
}
