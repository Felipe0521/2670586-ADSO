import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
        

        System.out.print("=> Ingrese la cantidad de notas: ");
        double cantidad = entrada.nextInt();
        double sumaNotas= 0;
        int contador=1;
        while (contador <= cantidad) {
            System.out.print("=> Ingrese nota "+contador+": ");
            double nota = entrada.nextDouble();

            sumaNotas = sumaNotas + nota;
            contador = contador + 1;
        }
        double promedio = sumaNotas/cantidad;
        System.out.print("El promedio del estudiante es "+promedio);
    }
}
