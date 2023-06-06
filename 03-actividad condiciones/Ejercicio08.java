import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----BASE X ALTURA----");

        System.out.print("Ingrese la base del triangulo: ");
        int base = entrada.nextInt();

        System.out.print("Ingrese la base del triangulo: ");
        int altura = entrada.nextInt();

        int area = (base * altura)/2;

        if (base >= 0 & altura >= 0) {
            System.out.print("El area del triangulo es: "+area);
        } else{
            System.out.print("Ingrese datos positivos validos ");
        }
    }
}
