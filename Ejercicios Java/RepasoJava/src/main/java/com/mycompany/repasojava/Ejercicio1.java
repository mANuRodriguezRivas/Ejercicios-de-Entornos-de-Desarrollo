/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repasojava;

import java.util.Scanner;

/**
 *
 * @author mANu
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un numero ");
        int num = teclado.nextInt();
        
        String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Cero";
        
        System.out.println("El resultado es "+ resultado);
       
    }
    
}
