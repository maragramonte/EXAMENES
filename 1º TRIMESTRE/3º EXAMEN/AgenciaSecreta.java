public class AgenciaSecreta {

    // Verificar si un carácter es una letra mayúscula válida (excluyendo Ñ)
    static boolean esLetraMayusculaMenosEnye(char caracter) {
        return 'A' <= caracter && caracter <= 'Z' && caracter != 'Ñ';
    }

    // Verificar si un carácter es un dígito válido
    static boolean esDigitoValido(char caracter) {
        return '0' <= caracter && caracter <= '9';
    }

    // Verificar si el identificador cumple con el formato
    static boolean esAgenteSecreto(char[] identificador) {
        if (identificador.length != 9) return false;

        for (int i = 0; i < 8; i++) {
            if (!esDigitoValido(identificador[i])) return false;
        }

        return esLetraMayusculaMenosEnye(identificador[8]);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        System.out.println(esAgenteSecreto(new char[]{'0','3','4','4','5','0','8','4','Y'})); // true
        System.out.println(esAgenteSecreto(new char[]{'2','3','4',';','*','5','0','8','5','V'})); // false
    }
}