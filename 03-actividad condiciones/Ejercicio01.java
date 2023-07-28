import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----NUMERO NEGATIVO Y POSITIVO----");
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero < 0){
            System.out.print("el numero es negativo");
        }else{
            System.out.print("el numero es positivo");
        }
    }

}
