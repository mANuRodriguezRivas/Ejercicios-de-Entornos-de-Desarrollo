/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author mANu
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // Ejercicio 8
        Scanner teclado = new Scanner(System.in);

             
             System.out.println("Ingrese un numero entero");
             int numbr = teclado.nextInt();
             
             boolean esPrimo = true;
             
             for (int i=2; i < numbr ; i++){
                        if(numbr % i == 0){
                            esPrimo = false;
                            break;
                        }
    
    
}
                        if(esPrimo && numbr >1){
                     System.out.println( numbr + "el numero es primo");
                }    else{
                      System.out.println( numbr +"el numero No es primo");
} 
             

    
    