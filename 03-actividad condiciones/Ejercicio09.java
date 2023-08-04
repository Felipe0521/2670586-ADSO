import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Escribir un programa que calcule el salario semanal de un empleado ingresando las horas trabajadas y la tarifa
        //por hora. Si el empleado trabajó más de 40 horas, se le pagará un 50% extra por las horas extras.

        int horas;
        int valor;
        int extra;
        int valorExtra;
        int resultado;

        System.out.println("---SALARIO SEMANAL---");

        System.out.print("Ingrese las horas trabajadas esta semana: ");
        horas = entrada.nextInt();

        valor = horas * 4833;

        if (horas > 40) {
           extra = horas - 40 ;
           valorExtra = ((extra * 4833) * 50) / 100;
            resultado = valorExtra + valor;

            System.out.print("Su salario total mas horas extra es : " +resultado);
        }if (horas <= 40){
            System.out.print("Su salario total  es : " +valor+ "pesos");
        }
    }
}
