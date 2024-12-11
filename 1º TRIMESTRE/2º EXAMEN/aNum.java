public class NIFExtractor {

    public static int Anum(char[] nif) {
        // Verificar que el array tenga al menos 9 elementos (8 dígitos y una letra)
        if (nif.length != 9) {
            throw new IllegalArgumentException("El NIF debe tener 9 caracteres.");
        }

        // Verificar que los primeros 8 caracteres son dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(nif[i])) {
                throw new IllegalArgumentException("Los primeros 8 caracteres deben ser dígitos.");
            }
        }

        // Convertir los primeros 8 caracteres a un número
        String numeroStr = new String(nif, 0, 8); // Obtener los primeros 8 caracteres
        int numero = Integer.parseInt(numeroStr); // Convertirlo a un número entero
        
        return numero;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        char[] nif = {'1', '2', '3', '4', '5', '6', '7', '8', 'A'};
        int numero = Anum(nif);
        System.out.println("El número correspondiente al NIF es: " + numero);
    }
}
