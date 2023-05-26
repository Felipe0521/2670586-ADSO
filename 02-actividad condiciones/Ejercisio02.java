import java.util.Scanner;
public class Ejercisio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        System.out.print("ingrese el numero de tres cifras: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.print("El numero ingresado es par");
            
        }else{
            System.out.print("el numero ingresado es impar ");
        }

    }
}
