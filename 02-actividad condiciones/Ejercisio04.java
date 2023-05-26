import java.util.Scanner;

public class Ejercisio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       System.out.println("ingrese numero 1");
       int num1 = entrada.nextInt();
       System.out.println("ingrese numero 2");
       int num2 = entrada.nextInt();
       System.out.println("ingrese numero 3");
       int num3 = entrada.nextInt();

       if (num1 > num2 && num2 > num3) {
        System.out.println("el numero 1 es el mayor ");
        System.out.println("el numero 3 es el menor ");
       } else if (num2 > num1 && num1 > num3) {
        System.out.println("el numero 2 es el mayor ");
        System.out.println("el numero 3 es el menor ");
       }if (num3 > num1 && num2 < num1) {
        System.out.println("el numero 3 es el mayor ");
        System.out.println("el numero 2 es el menor ");
       }else if (num2 > num3 && num3 > num1) {
        System.out.println("el numero 2 es el mayor ");
        System.out.println("el numero 1 es el menor ");
       }if (num3 > num2 && num2>num1) {
        System.out.println("el numero 3 es el mayor ");
        System.out.println("el numero 1 es el menor ");
       }

    }
}
