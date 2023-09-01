import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
          Solicitar al usuario ingresar un número N y un número M, crear un arreglo de tamaño N, llenarlo con datos
          aleatorios y buscar dentro del arreglo el número M. La aplicación debe devolver la posición donde se encuentra
          el número M o devolver -1 en caso de no encontrarlo.
         */

         System.out.print("Ingresa tamanho del arreglo: ");
         int tamanho = entrada.nextInt();
 
         int arreglo[] = new int[tamanho];
 
         System.out.print("ingresa numero a considerar: ");
         int numero = entrada.nextInt();
 
         int contador = 0;
 
         for (int i = 0; i < arreglo.length;i++){
             int numero_aleatorio = (int) (1+Math.random()*100);
             arreglo[i] = numero_aleatorio;
             
         }
         for (int j = 0; j < arreglo.length; j++){
             if (j == 0) {
                  System.out.print("[");
             }
            
             if (j < arreglo.length-1) {
                 System.out.print(arreglo[j]+", ");
             }
 
             if (j == arreglo.length-1) {
                 System.out.print(arreglo[j]+"]");
             }
            
         }
          System.out.println("");
         for (int i = 0; i < arreglo.length;i++){
             if (arreglo[i] == numero){
                 contador += 1;
                  System.out.println("El numero "+numero+" se encontro en la posicion "+(i+1));
             }
             
         }
        if (contador == 0) {
            System.out.print("-1");
        }
         
         
    }
}
