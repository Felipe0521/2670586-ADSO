import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Solicitar al usuario ingresar un número N y un número M, crear dos arreglos de tamaño N y M respectivamente,
        llenarlos con datos aleatorios y crear un arreglo que debe contener la información de los dos arreglos originales.
        La información debe estar ordenada de forma ascendente. */


        System.out.print("Ingresa tamaño de arreglo N:");
        int tamanhoN = entrada.nextInt();

         System.out.print("Ingresa tamaño de arreglo M:");
        int tamanhoM = entrada.nextInt();

        int arreglo_1[] = new int[tamanhoN];
        int arreglo_2[] = new int[tamanhoM];

        // llenar arreglos aleatoriamente //
        for (int i = 0; i < arreglo_1.length; i++) {
            int numero_aleatorio = (int) (Math.random()*100);
            arreglo_1[i] = numero_aleatorio;
           }
        for (int i = 0; i < arreglo_2.length; i++) {
            int numero_aleatorio = (int) (Math.random()*100);
            arreglo_2[i] = numero_aleatorio;
           }
           // imprimir originales //

           System.out.print("Arreglo Original N: ");
           for (int j = 0; j < arreglo_1.length; j++){
                if (j == 0) {
                    System.out.print("[");
                }
            
                if (j < arreglo_1.length-1) {
                    System.out.print(arreglo_1[j]+", ");
                }
    
                if (j == arreglo_1.length-1) {
                    System.out.print(arreglo_1[j]+"]");
                    System.out.println("");
                }
            }
             
           System.out.print("Arreglo Original M: ");
           for (int j = 0; j < arreglo_2.length; j++){
                if (j == 0) {
                    System.out.print("[");
                }
            
                if (j < arreglo_2.length-1) {
                    System.out.print(arreglo_2[j]+", ");
                }
    
                if (j == arreglo_2.length-1) {
                    System.out.print(arreglo_2[j]+"]");
                    System.out.println("");
                }
            }


        //imprimir arreglos en uno de forma ascendente//
         System.out.print("Arreglo N Y M en ascendente: ");
         System.out.print("[");
         for (int i = 0; i <= 100; i++) {
            for (int index = 0; index < arreglo_1.length; index++) {
                if (arreglo_1[index] == i) {
                    System.out.print(arreglo_1[index]+", ");
                }
            }
            for (int j = 0; j < arreglo_2.length; j++) {
                if (arreglo_2[j] == i) {
                    System.out.print(arreglo_2[j]+", ");
                    
                }
            }
         }
          System.out.print("]");
    }
   
}
