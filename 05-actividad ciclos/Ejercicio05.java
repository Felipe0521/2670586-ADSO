import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*Dado un numero entero N, el programa debe mostrar en pantalla la sucesión de numeros necesarios para producir el
        factorial y al final el resultado del factorial. */

        System.out.print("=> Ingrese un numero para su posterior factorizacion: ");
        int numero = entrada.nextInt();
        int cuenta = 1;

        System.out.println("Factorial: ");
        for (int i = 1; i <= numero; i++) {
            
            cuenta = cuenta*i;
            if (i < numero) {
                 System.out.print(i+" x ");
            }else{
                 System.out.print(i);
            }

           
        }
        System.out.print(" = "+cuenta);
    }
}
