import java.util.Scanner;
public class Ejercisio04{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

            int numero_1;
            int numero_2;
            

            System.out.print("Introduzca valor del numero 1: ");
        numero_1 = entrada.nextInt();

        System.out.print("Introduzca Valor del numero 2 : ");
        numero_2 = entrada.nextInt();

        System.out.println("Valores iniciales: numero 1 = " + numero_1 + "   numero 2 = " + numero_2);                                        
        
        numero_1 = numero_1 + numero_2;
        numero_2 = numero_1 - numero_2;
        numero_1 = numero_1 - numero_2;  
            
        System.out.println("Valores intercambiados: numero 1 = " + numero_1 + "   numero 2 = " + numero_2);  
   

    }
}