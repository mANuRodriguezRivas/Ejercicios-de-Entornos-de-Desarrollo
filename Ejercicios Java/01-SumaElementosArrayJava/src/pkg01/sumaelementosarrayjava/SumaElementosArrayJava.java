/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.sumaelementosarrayjava;

import java.util.Scanner;

/**
 *
 * @author mANu
 */
public class SumaElementosArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
        
        int []num = new int[5];
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.println("Introduzca un numero para la posicion " +  i + ": ");
            num[i]= scanner.nextInt();
            
        }
        
    }
    
}
