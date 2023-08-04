import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
         Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y
        encontrar el valor máximo del arreglo de enteros.
         */

         System.out.print("Ingrese tamanho del arreglo: ");
         int tamanho = entrada.nextInt();

         int arreglo[] = new int[tamanho];
         int maximo = 0;

         for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; 
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
         }

           System.out.print("Arreglo: [");
         for (int j = 0; j < arreglo.length; j++) {
            
           System.out.print(arreglo[j]+",");
         }
           System.out.println("]");
             System.out.print("El valor maximo de los elementos del arreglo es: "+maximo); 
    }
}
