public class TraductorDuende {

    // Método que traduce el mensaje al lenguaje de los duendes (invierte el mensaje)
    static String traductorDuende(String mensaje) {
        // Usamos StringBuilder para invertir el mensaje
        StringBuilder sb = new StringBuilder(mensaje);
        return sb.reverse().toString();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        System.out.println(traductorDuende("seta"));   // "ates"
        System.out.println(traductorDuende("bosque")); // "euqsob"
    }
}
