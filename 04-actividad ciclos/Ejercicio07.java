import java.util.Scanner;
public class Ejercicio07 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mcm = calcularMCM(num1, num2, num3);

        System.out.println("El MCM de " + num1 + ", " + num2 + " y " + num3 + " es: " + mcm);
    }

    public static int calcularMCM(int num1, int num2, int num3) {
        int mcm = 1;
        int divisor = 2;

        while (num1 > 1 || num2 > 1 || num3 > 1) {
            if (num1 % divisor == 0 || num2 % divisor == 0 || num3 % divisor == 0) {
                mcm *= divisor;

                if (num1 % divisor == 0) {
                    num1 /= divisor;
                }

                if (num2 % divisor == 0) {
                    num2 /= divisor;
                }

                if (num3 % divisor == 0) {
                    num3 /= divisor;
                }
            } else {
                divisor++;
            }
        }

        return mcm;
    }
}

