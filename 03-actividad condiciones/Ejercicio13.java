import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----NUMERO DIVISIBLE POR 2, 3 Y 5?---");

        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.println("---------------- ");

        if (numero % 2 <= 0 & numero % 3 <= 0 & numero % 5 <= 0) {
            System.out.println("el numero es divisible por 2, 3 y 5 ");
        }else{
            System.out.println("el numero no es divisible por 2, 3 y 5 ");
        }
    }
}
