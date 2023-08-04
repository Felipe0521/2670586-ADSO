import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        int arreglo[] = new int[tamanho];
        int minimo = 100;

        for (int i = 0; i < arreglo.length; i++) {
           int aleatorio = (int) (Math.random()*100);
           arreglo[i] = aleatorio; 
           if (arreglo[i] < minimo) {
               minimo = arreglo[i];
           }
        }

          System.out.print("Arreglo: [");
        for (int j = 0; j < arreglo.length; j++) {
           
          System.out.print(arreglo[j]+",");
        }
          System.out.println("]");
            System.out.print("El valor minimo de los elementos del arreglo es: "+minimo); 
    }
}
