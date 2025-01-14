
package com.mycompany.repasojava;

import java.util.Scanner;

public class Ejercicio2 {
    /*Ejercicio 2: Mayor de tres números
        • Pide al usuario que ingrese tres números enteros. El programa debe mostrar cuál de
           los tres es el mayor.*/


    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Escribe el 1 numero entero de una serie de 3: ");
        int n1= teclado.nextInt();
        
        System.out.println("Escribe el 2 numero entero de una serie de 3: ");
        int n2= teclado.nextInt();
        
        System.out.println("Escribe el 3 numero entero de una serie de 3: ");
        int n3= teclado.nextInt();
        
        int mayor = n1;
        
        if(n2 > mayor){
           mayor = n2;
        }
        if(n3 > mayor){
            mayor = n3;
        }
        System.out.println("El numero mayor es " + mayor);
       
    }
    
}
