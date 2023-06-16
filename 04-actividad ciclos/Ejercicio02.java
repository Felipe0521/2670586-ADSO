import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("=> Ingrese la cantidad de materias : ");
        double cantidad = entrada.nextInt();
        double sumaNotas= 0;
        int contador=1;
        int sumaCreditos = 0;
        while (contador <= cantidad) {
            System.out.print("=> Ingrese nota materia "+contador+": ");
            double nota = entrada.nextDouble();

            System.out.print("=> Creditos materia "+contador+": ");
            int credito = entrada.nextInt();

            sumaNotas = sumaNotas + (nota*credito);
            sumaCreditos = sumaCreditos + credito; 
            contador = contador + 1;

        }
        double promedio = sumaNotas/sumaCreditos;
    
        System.out.println(" promedio del semestre "+promedio);
        System.out.println("total creditos: "+sumaCreditos);

    }
    }

