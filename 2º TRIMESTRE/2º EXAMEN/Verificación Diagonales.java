/* INICIO verificaciondiagonales(matriz)
    num = matriz[0][0]
    PARA i DESDE 0 HASTA longitud de matriz - 1 HACER
        SI matriz[i][i] NO ES IGUAL A num ENTONCES
            RETORNAR falso
        FIN SI
    FIN PARA
    RETORNAR verdadero
FIN */

public class VerificacionDiagonales {
    public static boolean verificaciondiagonales(int[][] matriz){
        int numPrincipal = matriz[0][0];
        int numSecundaria = matriz[0][matriz.length - 1];
        
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][i] != numPrincipal || matriz[i][matriz.length - 1 - i] != numSecundaria){
                return false;
            }
        }
        return true;
    }
}