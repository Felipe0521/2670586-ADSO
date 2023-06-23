import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

         System.out.println("----NUMERO PRIMO O NO---- ");
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int i = 1;
       while ( i == 1) {
        if (numero >= 2) {
            if (numero % numero == 0 || numero % 2 == 0) {
             System.out.print("el numero no es primo");
             i=2;
            
        }if (numero % 2 != 0) {
             System.out.print("el numero  es primo");
             i=2;
             
        }if (numero < 2) {
            
         System.out.print("el numero no es primo");
       
        
        }
        }
        
       }
      
    }
}
