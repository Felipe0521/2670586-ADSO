import java.util.Scanner;
public class Ejercisio03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Intercambio de variables: Escribe un programa que solicite al usuario dos numeros enteros, los almacene
//     en variables separadas e intercambie el valor de las dos variables (usando una variable auxiliar).
            int numero_1;
            int numero_2;
            int intercambio;

            System.out.print("Introduzca valor del numero 1: ");
        numero_1 = entrada.nextInt();

        System.out.print("Introduzca Valor del numero 2 : ");
        numero_2 = entrada.nextInt();

        System.out.println("Valores iniciales: numero 1 = " + numero_1 + "   numero 2 = " + numero_2);                                        
        
        intercambio = numero_1;
        numero_1 = numero_2;
        numero_2 = intercambio;  
            
        System.out.println("Valores intercambiados: numero 1 = " + numero_1 + "   numero 2 = " + numero_2);  
   
        }

        
         
}