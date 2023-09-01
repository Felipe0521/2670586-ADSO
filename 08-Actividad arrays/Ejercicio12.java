import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y contar
        cuantos números primos se encuentran dentro del arreglo.*/

        System.out.print("Ingresa tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        int arreglo[] = new int[tamanho];
        
        for (int i = 0; i < arreglo.length; i++) {
            int numero_aleatorio = (int) (2*Math.random()*100);
            arreglo[i] = numero_aleatorio;
           }

        System.out.print("Arreglo Original: ");
        for (int j = 0; j < arreglo.length; j++){
            if (j == 0) {
                System.out.print("[");
            }
        
            if (j < arreglo.length-1) {
                System.out.print(arreglo[j]+", ");
            }

            if (j == arreglo.length-1) {
                System.out.print(arreglo[j]+"]");
                 System.out.println("");
            }

        }

        int primos = arreglo.length;  

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 2; j < arreglo[i]; j++) {
                if (arreglo[i] % j == 0) {
                    primos = primos - 1;
                    break;  
                }
            }
        }
        
        System.out.println("Cantidad de primos en el arreglo: " + primos);
        

        
        
    }
}
