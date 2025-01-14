/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pkg02.operadoresjava;

/**
 *
 * @author mANu
 */
public class ejercicio3operadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            int edad = 25;
      boolean esCiudadano = true;
      
      if(edad>=18&&esCiudadano){
          System.out.println("El ciudadano puede votar");
      }else{
          System.out.println("El ciudadano No puede votar");
      }
    }
}
