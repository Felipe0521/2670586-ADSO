import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int anho;

        System.out.println("----ANHO BISIESTO?---");

        System.out.print("ingrese un anho: ");
        anho = entrada.nextInt();

        System.out.println("---------------- ");

        if (anho % 4 <= 0) {
            System.out.print("el anho es bisiesto ");
        }else{
            System.out.print("el anho no es bisiesto ");
        }
    }
}
