import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.println("---TIENE EDAD PARA VOTAR?--- ");

        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();

        System.out.println("------------------------------");

        if (edad >= 18 ) {
            System.out.print("usted tiene edad para votar, su edad es: "+edad);
        }else{
            System.out.print("usted no tiene edad para votar, su edad es: "+edad);
        }
    }
}
