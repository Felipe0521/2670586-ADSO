import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese un numero entre 1 y 6:  ");
        int numero = entrada.nextInt();

        
      while (numero >= 1 || numero <=6 ) {
        if (numero == 1) { int aleatorio = (int) ( Math.random() * 10-1);
          
            System.out.print(aleatorio);
            int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
        }
         if (numero == 2) {
           int aleatorio = (int) (10 + Math.random() * 100-1);
            System.out.print(aleatorio);
           int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
        }
         if (numero == 3) {
           int aleatorio = (int) (100+ Math.random() * 1000-1);
            System.out.println("El numero construido es:  "+aleatorio);
             int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
            
        }
         if (numero == 4) {
           int aleatorio = (int) (1000+ Math.random() * 10000-1);
             System.out.println("El numero construido es:  "+aleatorio);
             int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
            
        }
         if (numero == 5) {
           int aleatorio = (int) (10000 + Math.random() * 100000-1);
            System.out.println("El numero construido es:  "+aleatorio);
             int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
            
        }
         if (numero == 6) {
           int aleatorio = (int) (100000 + Math.random() * 1000000-1);
             System.out.println("El numero construido es:  "+aleatorio);
             int almacenado = aleatorio;
             System.out.print("Resultado producto:  "+almacenado * 2);
            
        }
        numero = 7;
      }
    }
}
