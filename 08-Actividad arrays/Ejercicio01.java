import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
          . Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y calcular
            la suma de todos los elementos del arreglo de enteros.
         */

         System.out.print("Ingrese tamanho del arreglo: ");
         int tamanho = entrada.nextInt();

         int arreglo[] = new int[tamanho];
         int cuenta = 0;

         for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; 
            cuenta = cuenta + arreglo[i];
         }

           System.out.print("Arreglo: [");
         for (int j = 0; j < arreglo.length; j++) {
            
           System.out.print(arreglo[j]+",");
         }
           System.out.println("]");
             System.out.print("La suma de los elementos del arreglo es: "+cuenta);
    }
}