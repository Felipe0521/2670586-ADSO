import java.util.Scanner;
public class Ejercisio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero_1;
        int numero_2;
        int division;
        int resto;

        System.out.println("ingrese el numero 1");
        numero_1 = entrada.nextInt();

        System.out.println("ingrese el numero 2");
        numero_2 = entrada.nextInt();

        division = numero_1/numero_2;
        resto = numero_1 % numero_2;

        System.out.println("el resutado de la division es: "+division);
        System.out.println("el resto de la division es: "+resto);
    }
}
