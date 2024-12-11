public class TraductorDireccion {

    public static String traducirDireccion(char direccion) {
        // Convertimos el carácter a mayúsculas por si se introduce en minúscula
        direccion = Character.toUpperCase(direccion);
        
        // Evaluamos la dirección y retornamos la palabra correspondiente en español
        switch (direccion) {
            case 'N':
                return "norte";
            case 'S':
                return "sur";
            case 'E':
                return "este";
            case 'W':
                return "oeste";
            default:
                return "DIRECCIÓN ERRONEA";
        }
    }

    public static void main(String[] args) {
        // Pruebas de la función
        System.out.println(traducirDireccion('N'));  // norte
        System.out.println(traducirDireccion('S'));  // sur
        System.out.println(traducirDireccion('E'));  // este
        System.out.println(traducirDireccion('W'));  // oeste
        System.out.println(traducirDireccion('X'));  // DIRECCIÓN ERRONEA
        System.out.println(traducirDireccion('n'));  // norte (por la conversión a mayúscula)
    }
}
