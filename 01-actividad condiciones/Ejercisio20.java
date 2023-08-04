import java.util.Scanner;
public class Ejercisio20 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("introduce 5 digitos numericos: ");
        int numero = entrada.nextInt();

        
        int suma = 0;

        
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        
        System.out.println("la suma de los digitos es " + suma);
    }
}
