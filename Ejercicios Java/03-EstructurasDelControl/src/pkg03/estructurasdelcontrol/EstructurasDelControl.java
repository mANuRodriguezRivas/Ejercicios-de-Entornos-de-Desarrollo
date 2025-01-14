/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.estructurasdelcontrol;

import java.util.Scanner;

/**
 *
 * @author mANu
 */
public class EstructurasDelControl {

    /**
     * @param args the command line arguments
     */
    
    // Ejercicio 1
    
    public static void main(String[] args) {
        
       int num;
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("Ingrese el numero deseado");
        num = teclado.nextInt();
      
     
      
      if(num % 2==0){
          System.out.println("El numero es par");    
      }else{
          System.out.println("El numero es impar");
      }
      
         // Ejercicio 2
      
      int edad;
     
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
      
      if(edad >=18){
          System.out.println("Es mayor de edad");
      }else{
          System.out.println("Es menor de edad");
      }
      
      
           // Ejercicio 3
          
      int calificacion;
      
        System.out.println("Ingrese su calificacion del 1 al 10");
        calificacion = teclado.nextInt();
        
        if(calificacion<5){
            System.out.println("Insuficiente");
        }else if(calificacion>=5&&calificacion<=6.9){
            System.out.println("Suficiente");
        }else if(calificacion>=7&&calificacion<=8.9){
            System.out.println("Bien");
        }else{
            System.out.println("Sobresaliente");
        
        
        
            
        }
      
   
      
    }
    
}
