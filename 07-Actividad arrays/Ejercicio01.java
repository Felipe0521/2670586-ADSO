import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamano del arreglo: ");
      int tamano = entrada.nextInt();

      int arreglo[] = new int[tamano];
        int numero = 1;
      for (int i = 0; i < arreglo.length; i++) {
        
        arreglo[i] = numero;
        System.out.println("Posicion "+i+" es: "+arreglo[i]);
        numero = numero+2;
    }
    
}
}