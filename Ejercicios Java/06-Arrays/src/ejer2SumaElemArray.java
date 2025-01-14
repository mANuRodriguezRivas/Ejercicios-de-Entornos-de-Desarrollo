/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mANu
 */
 import java.util.Scanner;
 
public class ejer2SumaElemArray {
    
     public static void main(String[] args) {
    
    int[] numeros = new int[5];
    Scanner teclado = new Scanner(System.in);
          
          for( int i = 0; i < numeros.length; i++){
            System.out.println("Introduzca un numero para la posicion " +i+":");
            numeros[i] = teclado.nextInt();   
            }
          
            int suma = 0;
            for(int i = 0; i <5; i++){
                suma += numeros[i];
            }
              System.out.println("La suma de los numeros es: " + suma);

}
}
