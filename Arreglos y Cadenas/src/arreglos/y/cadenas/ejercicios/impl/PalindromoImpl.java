package arreglos.y.cadenas.ejercicios.impl;

import arreglos.y.cadenas.ejercicios.IPalindromo;
import java.util.Arrays;

public class PalindromoImpl implements IPalindromo {
    
    @Override
     /*
    Devuelve true si la cadena es palindromo
    en otro caso devuelve false
    */
    public boolean esPalindromo(String cadena) {
        char cadenaCaracteres[] = cadena.toCharArray();
        int i = 0;
        int j = cadenaCaracteres.length-1;
        
        while(i < j){
            if(cadenaCaracteres[i] == cadenaCaracteres[j]){
                i++;
                j--;
            }else{
                System.out.println("No es palindromo");
                return false;
            }
        }
        System.out.println("Si es palindromo");
        return true;
    }
    
    @Override
     /*
    Primero copia la cadena a otro arreglo
    pero al revés:
    cadena1 = "hola"
    cadena2 = "aloh"
    Después la imprime
    */
    public void reversa(String cadena) {
        char cadenaCaracteres[] = cadena.toCharArray();
        int longitudCadena = cadenaCaracteres.length;
        char cadenaReversa[] = new char[longitudCadena];
        int i = 0;
        int j = longitudCadena-1;
        
        while(i <= longitudCadena-1){
            cadenaReversa[i] = cadenaCaracteres[j];
            i++;
            j--;
        }
        System.out.println("La cadena al revés es: " + Arrays.toString(cadenaReversa));
    }
}
