import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        int arreglo[] = new int[tamanho];

        System.out.print("ingresa numero a considerar: ");
        int numero = entrada.nextInt();

        int contador = 0;

        for (int i = 0; i < arreglo.length;i++){
            int numero_aleatorio = (int) (1+Math.random()*10);
            arreglo[i] = numero_aleatorio;
            if (arreglo[i] == numero){
                contador += 1;
            }
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
         System.out.print("El numero "+numero+" se encontro "+contador+" veces");
    }
}