import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        /*
          Realizar una aplicación en JAVA que solicite al usuario un numero N (entero entre 1 y 6). La aplicación debe crear N
          cantidad de numeros aleatorios (enteros entre 0 y 9) se pueden repetir y almacenarlos en una variable entera de
          izquierda a derecha. Por ultimo la aplicación debe mostrar en pantalla la variable creada con los N numeros aleatorios y
          el resultado de multiplicar esta variable entre 2.
         */
        
         System.out.print("Ingrese un numero entre 1 y 6: ");
        int numero = entrada.nextInt();
        int numero_aleatorio = 0;
        
        int min = (int) Math.pow(10, numero - 1);
        int max = (int) Math.pow(10, numero) - 1;

        if (numero > 0 && numero < 7) {
         
            numero_aleatorio = (int) (min+Math.random()*max);
            
          int producto = numero_aleatorio * 2;
           System.out.println("El numero construido es: "+numero_aleatorio);

           System.out.print("El producto es: "+producto);

          

        }else{
                   System.out.print("Ingrese un numero valido entre 1 y 6 ");

        }
        
      }
    }

