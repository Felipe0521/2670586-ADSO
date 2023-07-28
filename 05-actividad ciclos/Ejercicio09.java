import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
         Dado un número entero N, se calcula la raíz digital de N sumando los dígitos que lo componen. El proceso se repite sobre
        el nuevo número hasta que el resultado obtenido tiene un sólo dígito, este último número es la raíz digital del número N
         */

       
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        

        
        int sumaCifras = 0;
        int raiz = 0;
        int num = Math.abs(numero); 

        while (num > 0) {
            int cifra = num % 10; 
            sumaCifras += cifra; 
            num /= 10; 
        }

         System.out.println("La suma de las cifras del número es: " + sumaCifras);

       while (sumaCifras > 0){
        int cifra = sumaCifras % 10;
        raiz += cifra;
        sumaCifras /= 10;  
       }
        
        System.out.println("La Raiz Digital de "+numero+" es : "+ raiz);
    


         
    }
}
