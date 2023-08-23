import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
         * Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un
            nuevo arreglo que contenga los elementos en orden inverso al arreglo original.

         */
        System.out.print("Ingresa tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        int arreglo[] = new int[tamanho];

       
       
        for (int i = 0; i < arreglo.length;i++){
            int numero_aleatorio = (int) (1+Math.random()*10);
            arreglo[i] = numero_aleatorio;
           
        }
         System.out.println("Arreglo : ");
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
         System.out.println("Arreglo inverso: ");
         for (int j = arreglo.length-1; j > -1; j--){
            if (j == tamanho-1) {
                 System.out.print("[");
            }
           
            if (j > 0) {
                System.out.print(arreglo[j]+", ");
            }

            if (j == 0) {
                System.out.print(arreglo[j]+"]");
            }
    }
}
}
