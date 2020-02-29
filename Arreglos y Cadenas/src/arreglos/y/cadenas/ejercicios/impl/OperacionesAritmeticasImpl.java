package arreglos.y.cadenas.ejercicios.impl;

import arreglos.y.cadenas.ejercicios.IOperacionesAritmeticas;

public class OperacionesAritmeticasImpl implements IOperacionesAritmeticas{
    
    public void sumaNumeros(double a, double b){
        double resultado = a+b;
        System.out.println("El resultado de la suma es: "+resultado);
    }
           
    public void multiplicaNumeros(double a, double b){
        double resultado = a*b;
        System.out.println("El resultado del producto es: "+resultado);
    }
    
}
