public class NIFValidator {

    public static boolean TieneFormatoNIF(char[] nif) {
        // Verificar que el array tiene exactamente 9 caracteres
        if (nif.length != 9) {
            return false;
        }

        // Verificar que los primeros 8 caracteres son dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(nif[i])) {
                return false;
            }
        }

        // Verificar que el último carácter es una letra mayúscula y no es 'Ñ'
        char letra = nif[8];
        if (!Character.isUpperCase(letra) || letra == 'Ñ') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        char[] nifValido = {'1', '2', '3', '4', '5', '6', '7', '8', 'A'};
        char[] nifInvalido = {'1', '2', '3', '4', '5', '6', '7', '8', 'Ñ'};
        
        System.out.println(TieneFormatoNIF(nifValido));   // true
        System.out.println(TieneFormatoNIF(nifInvalido)); // false
    }
}
