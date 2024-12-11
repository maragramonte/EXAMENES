public class BusquedaBinariaModificada {
    
    public static int busquedaBinariaModificada(int[] arr, int num) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // Si encontramos el número, seguimos buscando hacia la izquierda
            if (arr[mid] == num) {
                while (mid > 0 && arr[mid - 1] == num) {
                    mid--;
                }
                return mid;  // Retornamos el primer índice donde aparece el número
            }
            // Si el número es mayor, nos movemos a la mitad derecha
            else if (arr[mid] < num) {
                low = mid + 1;
            }
            // Si el número es menor, nos movemos a la mitad izquierda
            else {
                high = mid - 1;
            }
        }
        
        // Si no encontramos el número, 'low' es el índice donde el número debe insertarse
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8};
        
        // Caso 1: Buscar un número que está en el arreglo (4)
        int result1 = busquedaBinariaModificada(arr, 4);
        System.out.println("Índice de la primera aparición de 4: " + result1);  // Salida: 2
        
        // Caso 2: Buscar un número que no está en el arreglo (3)
        int result2 = busquedaBinariaModificada(arr, 3);
        System.out.println("Índice donde 3 debería insertarse: " + result2);  // Salida: 2
    }
}
