/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.y.cadenas.ejercicios.impl;

import arreglos.y.cadenas.ejercicios.IArreglosyRandom;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author MimiInternet
 */
public class ArreglosyRandomImpl implements IArreglosyRandom{

    @Override
    public int colocarMaximo(int arreglo[], int var){
        var = 9999;
        int temporal;
        for(int i=0; i<arreglo.length-1; i++){
            if(arreglo[i] > arreglo[i+1]){
                temporal = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = temporal;
            }
        }
        return var;
    }

    @Override
    public int max(int a[])  {
        int max = a[0];
        for(int i=1; i < a.length; i++){
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    @Override
    public int maxRecursivo(int a[], int inicio, int fin){
        // Verificamos el caso base
        if(inicio == fin){
            return a[inicio];
        }else{
            int mitad = (fin - inicio)/2+inicio;
            int maxIzq;
            int maxDer;
            
            maxIzq = maxRecursivo(a, inicio, mitad);
            maxDer = maxRecursivo(a, mitad+1, fin);
            
            if(maxIzq > maxDer)
                return maxIzq;
            else
                return maxDer;
           
        }
    }

    @Override
    public void mezcla(int a[], int b[]){
        int lonA = a.length, lonB = b.length;
        int c[] = new int[lonA+lonB];
        int i= 0, j = 0,k = 0;
        
        while( i < lonA && j < lonB  ){
            if( a[i] < b[j] ){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        
        while(i < lonA){
            c[k] = a[i];
            i++;
            k++;
        }
        
        while(j < lonB){
            c[k] = b[j];
            j++;
            k++;
        }
        
        System.out.println("\n c = "+Arrays.toString(c));
    }

    /*
    Este metodo elige un elemento al azar p: pivote
    de un arreglo de enteros. Y crea dos arreglos
    uno contiene los elementos más pequeños
    que p, y el otro los más grandes.
    */
    @Override
    public void particion(int a[]){
        int n = a.length, indiceP, p;
        int menores[] = new int[n-1];
        int mayores[] = new int[n-1];
        int men = 0, may = 0;
        Random r = new Random();
        indiceP = r.nextInt(n);
        p = a[indiceP];
        System.out.println("Pivote = "+p);
        
        for(int i=0; i<n; i++){
            if(a[i] < p){
                menores[men] = a[i];
                men++;
            }
            if(a[i] > p){
                mayores[may] = a[i];
                may++;
            }
        }
        
        System.out.println("Menores "+Arrays.toString(menores));
        System.out.println("Mayores: "+Arrays.toString(mayores));
        

    }
    
}
