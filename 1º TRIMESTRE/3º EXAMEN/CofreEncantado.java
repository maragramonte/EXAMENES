public class CofreEncantado {

    // Método que determina si el ingrediente no está en el cofre
    static boolean tieneIngrediente(int[] cofre, int ingrediente) {
        // Usamos búsqueda binaria para encontrar el ingrediente
        int izquierda = 0, derecha = cofre.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Si encontramos el ingrediente, lo retornamos true
            if (cofre[medio] == ingrediente) {
                return true;
            }

            // Ajustamos la búsqueda según el valor en medio
            if (cofre[medio] < ingrediente) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        // Si no se encuentra, retornamos false
        return false;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] cofre = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // Ejemplo 1
        System.out.println(tieneIngrediente(cofre, 23)); // true

        // Ejemplo 2
        System.out.println(tieneIngrediente(cofre, 15)); // false
    }
}
