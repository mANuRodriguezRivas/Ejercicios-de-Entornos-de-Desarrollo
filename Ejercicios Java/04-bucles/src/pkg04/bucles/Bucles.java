/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.bucles;
    import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mANu
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ejercicio 1
        
         
        for(int i=1;i<11;i++){
        System.out.println(i);
    }
        
           // Ejercicio 2
        
         
      int num= 2;
      while (num<=20){
          System.out.println(num);
          num = num+2;
 
      
    }
      
            // Ejercicio 3
            
            int suma = 0;
            
            for(int i=1;i<100;i++){
        suma = suma + i;
    }
            System.out.println("El resultado de la suma de los numeros del 1 al 100 es :"+suma);
   
    
           // Ejercicio 4

            
            System.out.println("Inroduzca un numero");
            int num = teclado.nextInt();
            
            if( num <0){
                System.out.println("El número debe ser positivo. Por favor, inténtalo de nuevo.");
                
            }else if(num >= 0){
                System.out.println("Número válido, vamos a calcular el factorial...");
            }
            
            int resultadoFactorial = 1;
            String descomposicion = num+"! = ";
            for ( int i =1; i <= num; i ++){
                resultadoFactorial*= i;
                descomposicion += i;
                if(i < num){
                    descomposicion+= "*";
                }
            }
            descomposicion += " = " + resultadoFactorial;
            System.out.println(descomposicion);
            
       
      }
    
}

            // Ejercicio 5
   
        System.out.println("Ingrese un numero y le mostrare la tabla de multiplicar correspondiente");
        
        int nume = teclado.nextInt();
        
        for(int i=0;i<=10;i++){
        int result = nume * i;
        System.out.println(nume+"x"+i+"="+result);
}
          // Ejercicio 6
          
          System.out.println("Ingrese un numero entero");
          
          int numer = teclado.nextInt();
          int suma1 = 0;
          
          while (numer >0) {    
              suma1 += numer % 10;
              numer = numer /10;
            
        }
          System.out.println("La suma de los digitos es: " + suma1);    
        
}
       //Ejercicio 7
    
           System.out.println("Introduzca un numero: " );  
           
           int number = teclado.nextInt();
           int resultadoInver = 0;
           
           
           while(number >0){
           int digito = number % 10;
           resultadoInver = resultadoInver* 10 + digito;
           number = number/10;
          
}
             System.out.println("El numero invertido "+ resultadoInver);
             
             
             // Ejercicio 8
             
             System.out.println("Ingrese un numero entero");
             int numbr = teclado.nextInt();
             
             boolean esPrimo = true;
             
             for (int i=2; i < numbr ==0 ; i++){
                        if(numbr % i == 0){
                            esPrimo = false;
                            break;
                        }
    
    
}
                        if(esPrimo && numbr >1){
                     System.out.println( numbr + "el numero es primo");
                      }   else{
                      System.out.println( numbr +"el numero No es primo");
} 
             
}
    
     


 
        
     

    
    

