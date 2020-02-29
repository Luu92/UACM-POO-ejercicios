package arreglos.y.cadenas;


import arreglos.y.cadenas.ejercicios.IArreglosyRandom;
import arreglos.y.cadenas.ejercicios.IOperacionesAritmeticas;
import arreglos.y.cadenas.ejercicios.IPalindromo;
import arreglos.y.cadenas.ejercicios.impl.ArreglosyRandomImpl;
import arreglos.y.cadenas.ejercicios.impl.OperacionesAritmeticasImpl;
import arreglos.y.cadenas.ejercicios.impl.PalindromoImpl;
import java.util.Arrays;


public class App {
    
    public static void main(String args[]){
        
        IArreglosyRandom arreglosYRandom = new ArreglosyRandomImpl();
        IPalindromo palindromo = new PalindromoImpl();
        IOperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticasImpl();
        
        System.out.println("---------Arreglo------------");
        int a[] = {12,78,45,-3,98,29,1,8,15,31,67};
        System.out.println("a = "+Arrays.toString(a));
        arreglosYRandom.particion(a);
        
        System.out.println("--------Padlindromo-----------");
        //pide una cadena de caracteres y dice si es palindromo
        palindromo.esPalindromo("puto");
        palindromo.reversa("otupilif");
        
        System.out.println("---------Operaciones----------");
        operacionesAritmeticas.multiplicaNumeros(15, 12);
        operacionesAritmeticas.sumaNumeros(15, 20);
    }
    
}
