/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.operadoresjava;

/**
 *
 * @author mANu
 */
public class ejercicio1operadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numA = 15;
        int numB = 4;
        
        int suma = numA + numB;
        int resta = numA - numB;
        int multiplicacion = numA*numB;
        int division = numA / numB;
        int modulo = numA % numB;
        
        System.out.println("La suma entre A y B es "+ suma);
        System.out.println("La resta entre A y B es  "+ resta);
        System.out.println("La multiplicacion entre A y B es "+ multiplicacion);
        System.out.println("La division entre A y B es "+ division);
        System.out.println("El modulo de A y B es "+ modulo);
    }
    
}
