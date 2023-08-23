import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
         * Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y separar
            los números pares e impares en dos arreglos diferentes.

         */

         System.out.print("Ingrese tamanho del arreglo: ");
         int tamanho = entrada.nextInt();

         int arreglo[] = new int[tamanho];

         for (int i = 0; i < arreglo.length; i++) {
            int numero_aleatorio = (int) (1+Math.random()*100);
            arreglo[i] = numero_aleatorio;
         }
         
         // imprime original 
          System.out.print("Arreglo original:  ");
         for (int j = 0; j < arreglo.length; j++) {
            if (j == 0) {
                 System.out.print("[ ");
            }
            if (j < arreglo.length-1) {
                System.out.print(arreglo[j]+", ");
            }
             if (j == arreglo.length-1) {
                 System.out.print("]");
            }
         }
         System.out.println("");
         // imprime par
         System.out.print("Arreglo pares:  ");
         for (int j = 0; j < arreglo.length; j++) {
            if (j == 0) {
                 System.out.print("[ ");
            }
            if (arreglo[j] % 2 == 0) {
                System.out.print(arreglo[j]+", ");
            }
             if (j == arreglo.length-1) {
                 System.out.print("]");
            }
         }

          System.out.println("");
         // imprime impar
         System.out.print("Arreglo impares:  ");
         for (int j = 0; j < arreglo.length; j++) {
            if (j == 0) {
                 System.out.print("[ ");
            }
            if (arreglo[j] % 2 != 0) {
                System.out.print(arreglo[j]+", ");
            }
             if (j == arreglo.length-1) {
                 System.out.print("]");
            }
         }
    }
}
