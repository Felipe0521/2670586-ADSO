import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int maxnum;

        System.out.println("----MAXIMO DE 4 NUMEROS---- ");

        System.out.print("Escriba el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.print("Escriba el tercer numero: ");
        int num3 = entrada.nextInt();

        System.out.print("Escriba el cuarto numero: ");
        int num4 = entrada.nextInt();

        maxnum = num1;

        if (num2 > maxnum) {
            maxnum = num2;
        } 
        if (num3 > maxnum) {
            maxnum = num3;
        }
        if (num4 > maxnum) {
            maxnum = num4;
        }
        System.out.print("------------------------ ");
        System.out.print("El numero mayor es " +maxnum);
        
    }
}