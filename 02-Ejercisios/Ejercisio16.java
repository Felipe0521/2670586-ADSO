import java.util.Scanner;
public class Ejercisio16 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la inversi0n inicial: ");
        double principal = entrada.nextDouble();

        System.out.println("Ingrese la tasa de interes: ");
        double tasaDeInteres = entrada.nextDouble();

        System.out.println("Ingrese el numero de periodos: ");
        int periodos = entrada.nextInt();

        double interesCompuesto = principal * Math.pow((1 + tasaDeInteres / 100), periodos);

        System.out.println("El monto final es " + interesCompuesto);
       }
}


