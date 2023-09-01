import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Solicitar al usuario ingresar un número N, crear dos arreglos de N, llenar los dos arreglos con datos aleatorios y
        crear un tercer arreglo de tamaño N, el cual contendrá la suma de los dos arreglos. */

        System.out.print("Ingresa tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        int arreglo_1[] = new int[tamanho];
        int arreglo_2[] = new int[tamanho];
         int arreglo_3[] = new int[tamanho];

         // llenar aleatoriamente //
        for (int i = 0; i < arreglo_1.length; i++) {
            int numero_aleatorio = (int) (2*Math.random()*10);
            arreglo_1[i] = numero_aleatorio;
           }

        for (int i = 0; i < arreglo_2.length; i++) {
            int numero_aleatorio = (int) (2*Math.random()*10);
            arreglo_2[i] = numero_aleatorio;
           }

        // imprimir 2 primeros arreglos //
        System.out.print("Arreglo 1 de tamanho "+tamanho+": ");
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
          
        System.out.print("Arreglo 2 de tamanho "+tamanho+": ");
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

         // imprimir tercer arreglo //
         System.out.print("Suma de ambos arreglos por posicion: ");
         for (int i = 0; i < tamanho; i++) {
            int suma = arreglo_1[i] + arreglo_2[i];
            arreglo_3[i] = suma;

             if (i == 0) {
                 System.out.print("[");
             }
         
             if (i < arreglo_3.length-1) {
                 System.out.print(arreglo_3[i]+", ");
             }
 
             if (i == arreglo_3.length-1) {
                 System.out.print(arreglo_3[i]+"]");
                 System.out.println("");
             }
         }
    }
}
