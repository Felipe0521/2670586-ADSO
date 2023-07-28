import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
         Realizar una aplicación en JAVA que solicite al usuario dos numeros N y M, los cuales indicaran un rango. La aplicación
        debe mostrar en pantalla los numeros factoriales calculados desde el numero N hasta el numero M.

         */

         System.out.print("Ingrese numero Minimo: ");
         int minimo = entrada.nextInt();

          System.out.print("Ingrese numero Maximo: ");
         int maximo = entrada.nextInt();
         int cuenta = 1;
         

        for (int i = minimo; i <= maximo; i++){

            System.out.print("Factorial (!"+i+") : ");

            for (int j = 1; j <= i; j++) {
                cuenta = cuenta*j;
                if (j < i ) {
                     System.out.print(j+" x ");
                }else{
                     System.out.print(j);
                }
    
            }
            System.out.println(" = "+cuenta);
            cuenta = 1;

        }
       
    }
}
