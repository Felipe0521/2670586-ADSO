import java.util.Scanner;

public class Ejercisio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificacion de la materia 1: ");
        int grado1 = scanner.nextInt();

        System.out.println("Ingrese el credito de la materia 1: ");
        int credito1 = scanner.nextInt();

        System.out.println("Ingrese la calificaci0n de la materia 2: ");
        int grado2 = scanner.nextInt();

        System.out.println("Ingrese el credito de la materia 2: ");
        int credito2 = scanner.nextInt();

        System.out.println("Ingrese la calificacion de la materia 3: ");
        int grado3 = scanner.nextInt();

        System.out.println("Ingrese el credito de la materia 3: ");
        int credito3 = scanner.nextInt();

        int totalCreditos = credito1 + credito2 + credito3;
        int totalCalificaciones = grado1 * credito1 + grado2 * credito2 + grado3 * credito3;

        double promedioponderado = (double) totalCalificaciones / totalCreditos;

        System.out.println("El promedio ponderado es " + promedioponderado);
    }
}