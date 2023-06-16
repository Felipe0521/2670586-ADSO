import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("|-----BIENVENIDO-----|");
        System.out.println("| 1. Docente         |");
        System.out.println("| 2. Estudiante      |");
        System.out.println("| 3. Salir           |");
        System.out.println("|--------------------|");

        System.out.print("Ingrese una opcion; ");
        int opcion = entrada.nextInt();
        int docente = 1;
        int estudiante = 2;

        while (opcion <= 4 ) {
            if (opcion == docente) {
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
                docente++;
                opcion = 4;
                
            }if (opcion == estudiante) {
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

        estudiante++;
        opcion = 4;

            }if (opcion == 3){
                System.out.print("ADIOS!");
                opcion=5;

            }if(opcion == 4){
                System.out.println("|-----BIENVENIDO-----|");
                System.out.println("| 1. Docente         |");
                System.out.println("| 2. Estudiante      |");
                System.out.println("| 3. Salir           |");
                System.out.println("|--------------------|");
        
                System.out.print("Ingrese una opcion; ");
                 opcion = entrada.nextInt();
            }
        }
    }
}
