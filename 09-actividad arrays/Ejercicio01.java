import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamanho del arreglo: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        String arreglo[] = new String[tamanho];
        System.out.println("---------------------------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese valor de la posicion " + i + ": ");
            String numero = entrada.nextLine();
            arreglo[i] = numero;
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }

            if (i >= 0) {
                System.out.print(arreglo[i] + ", ");
            }
            if (i == (arreglo.length - 1)) {
                System.out.print("]");
            }
        }
    }
}
