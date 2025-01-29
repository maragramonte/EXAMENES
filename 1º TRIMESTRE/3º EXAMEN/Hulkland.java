public class Hulkland {

    // Método que calcula el precio de la entrada según el número de visitas
    static int precioEntradaHulkland(int numVisitas) {
        // Condiciones basadas en el número de visitas
        if (numVisitas >= 6) {
            return 100; // Para 6 visitas o más, el precio es 100 smashcoins
        } else if (numVisitas >= 3) {
            return 150; // Para 3, 4 o 5 visitas, el precio es 150 smashcoins
        } else {
            return 200; // Para las 2 primeras visitas, el precio es 200 smashcoins
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        System.out.println(precioEntradaHulkland(1)); // 200
        System.out.println(precioEntradaHulkland(3)); // 150
        System.out.println(precioEntradaHulkland(7)); // 100
    }
}
