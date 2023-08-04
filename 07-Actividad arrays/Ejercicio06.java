import java.util.Scanner;
import java.util.Random;
public class Ejercicio06 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
          Llenar un arreglo de N posiciones (el valor de N es ingresado por el usuario), imprimir el arreglo en pantalla y
        posteriormente crear dos arreglos, donde el primer arreglo debe contener los números primos del arreglo original y el
        segundo arreglo debe contener los números no primos. En pantalla de debe mostrar los 3 arreglos y la longitud de cada
        uno
         */

        System.out.print("Ingrese tamaño del arreglo: "); 
        int tamano = entrada.nextInt();

        int arreglo[] = new int[tamano];

       
        // llenar arreglo //
        for (int i = 0; i < arreglo.length; i++) {
            int llenar = (int) (1+Math.random()*100);
            arreglo[i] = llenar;
        }

        // imprimir arreglo//
        System.out.print("Arreglo Original:  ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
               System.out.print("[");
            }
           
             if (i >= 0 ) {
                  System.out.print(arreglo[i]+", ");
             }
             if (i == (arreglo.length-1)) {
                 System.out.print("]");
             } 
         }

         System.out.println("  ");
         // encontrar Primos //
         System.out.print("Arreglo primos:  ");
         for (int i = 0; i < arreglo.length; i++){
            if (i == 0) {
                 System.out.print("[");
            }
        
            for (int index = 2; index < arreglo[i]; index++){
                if (arreglo[i] % index == 0 ) {
                    break;
                }
                if (index == arreglo[i]-1) {
                     System.out.print(arreglo[i]+", ");
                }
            }
             if (i == arreglo.length-1) {
                 System.out.print("]");
            }
         }

         System.out.println("");
         
         // encontrar No primos //
          System.out.print("Arreglo No primos:  ");
         for (int j = 0; j < arreglo.length; j++) {
            if (j == 0) {
                 System.out.print("[");
            }
           for (int index = 2; index < arreglo[j]; index++){
            if (arreglo[j] % index  == 0) {
                 System.out.print(arreglo[j]+", ");
                 index = arreglo[j]-1;
            }
           }
           if (j == arreglo.length-1) {
             System.out.print("]");
           }
         }
    }
}
