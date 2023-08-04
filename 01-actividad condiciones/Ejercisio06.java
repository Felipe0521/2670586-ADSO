import java.util.Scanner;

public class Ejercisio06 {
   public static void main(String[] args){
     Scanner entrada = new Scanner(System.in); 

     //Cálculo del promedio: Escribe un programa que tome una serie de números como entrada y calcule su promedio//

        int numero_1, numero_2, numero_3, promedio;

        System.out.println("introduzca el numero 1");
        numero_1 = entrada.nextInt();

        System.out.println("introduzca el numero 2");
        numero_2 = entrada.nextInt();

        System.out.println("introduzca el numero 3");
        numero_3 = entrada.nextInt();


       promedio = (numero_1+numero_2+numero_3)/3;

       System.out.println("el promedio de lo numero es: "+promedio);



   }
    
}
