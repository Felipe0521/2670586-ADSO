import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamanho del arreglo: ");
        int tamanho = entrada.nextInt();

        float arreglo[] = new float[tamanho];
        float cuenta = 0;

        for (int i = 0; i < arreglo.length; i++) {
           float aleatorio = (float) (Math.random()*100);
           arreglo[i] = aleatorio; 
           cuenta = cuenta + arreglo[i];
        }

        cuenta = cuenta / tamanho;
          System.out.print("Arreglo: [");
        for (int j = 0; j < arreglo.length; j++) {
           
          System.out.print(arreglo[j]+",");
        }
          System.out.println("]");
            System.out.print("El valor promedio de los elementos del arreglo es: "+cuenta); 
    }
}
