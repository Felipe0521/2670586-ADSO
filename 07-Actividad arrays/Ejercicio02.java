import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamano del arreglo: ");
       int tamano = entrada.nextInt();

       int arreglo[] = new int[tamano];
       
        int numero = 2;
        int contPrimos = 0;

        while (contPrimos < tamano) {
          if (numero == 4) {
            numero = 5;
          }
         if (numero <= 5){
          arreglo[contPrimos] = numero;
          contPrimos++;
         }
         if (numero > 6) {
          if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 9 != 0 && numero % 7 != 0 && numero % 11 != 0) {
            arreglo[contPrimos] = numero;
            contPrimos++;
          }
         }
         numero++;
        }

         System.out.println("Numeros primos generados: ");
        for (int i = 0; i < arreglo.length; i++){

          System.out.print("["+arreglo[i]+"] ");
        }

    }
  }