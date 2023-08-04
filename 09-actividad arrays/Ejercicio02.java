import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tamanho del arreglo: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        String arreglo[] = new String[tamanho];

        System.out.println("---------------------------------------");

        // anadir valor al array //
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese valor de la posicion " + i + ": ");
            String numero = entrada.nextLine();
            arreglo[i] = numero;
        }
        // imprimir arreglo //
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
        System.out.println("");
        System.out.print("Ingrese un nombre a comparar:");
        String nombre = entrada.nextLine();

        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length-1) {
                 if (nombre.equalsIgnoreCase(arreglo[i])) {
                System.out.println( "El nombre es igual a la posicion "+i+": "+arreglo[i] );
                
            }
            }
           
            if (i == arreglo.length-1) {
                if (nombre.equalsIgnoreCase(arreglo[i])) {
                System.out.println( "El nombre es igual a la posicion "+i+": "+arreglo[i] );
                
            }else{
                  System.out.println( "Los nombres son diferentes" );
            }
              

            }
        }

    }
}
