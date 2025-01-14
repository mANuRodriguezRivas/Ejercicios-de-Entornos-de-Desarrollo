/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Arrays;

public class ejer3OrdenarArray {

 
    public static void main(String[] args) {
 int[] num = new int[7];
 
 for ( int i =0; i < num.length; i++){
     num[i] = (int) (Math.random() * 100)+1;
    
     System.out.println("Numero en la posicion " + i + ": " + num[i]); 
 } 
 Arrays.sort(num);
 System.out.println("Array despues de ordenar:");
 
    for (int i = 0; i < 7; i++) {
            System.out.println("Numero en la posicion " + i + ": " + num[i]);
        }
    } 
}
