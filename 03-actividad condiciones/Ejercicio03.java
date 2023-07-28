import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("----NUMERO PAR E IMPAR----");
        System.out.print("Escriba un numero: ");
        int numero = entrada.nextInt();

        System.out.println("------------------");

        if (numero % 2 <= 0) {
            System.out.print("el numero es par");
        }else{
            System.out.print("el numero es impar");
        }
    }
}
