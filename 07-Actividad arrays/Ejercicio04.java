import java.util.Scanner;
public class Ejercicio04 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
         * Realizar una aplicación en Java que solicite al usuario un numero entero, cree un arreglo de la longitud del numero 
        ingresado. El arreglo se debe llenar con datos ingresados por el usuario, se imprime el arreglo original y posteriormente 
        se debe imprimir el arreglo los números ordenados de forma descendente.
         */

         System.out.print("Ingrese tamaño del arreglo: ");
         int tamano = entrada.nextInt();

         int arreglo [] = new int[tamano];
            
        // llenado por el usuario //
         for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese posicion de arreglo "+i+": ");
            int numero = entrada.nextInt();

            arreglo[i] = numero;
         }
        
         // imprime original //
         System.out.println("Arreglo original");
         for (int j = 0; j < arreglo.length; j++){

            System.out.print("["+arreglo[j]+"]");
         }

         System.out.println("");

         // imprime descendente // 
         System.out.println("Arreglo descendente");

         
         for (int j = tamano-1; j >= 0; j--){

            System.out.print("["+arreglo[j]+"]");
            
         }
         
   }
}