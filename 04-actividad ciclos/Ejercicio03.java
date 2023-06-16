import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la altura de la pirámide
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura de la piramide: ");
        int altura = entrada.nextInt();
        
        for (int espacio = 1; espacio <= altura; espacio++){

            for (int blanco = 1; blanco <= altura - espacio;blanco++){
                System.out.print(" ");
            }

            for (int letra = 1; letra <= 2 * espacio -1; letra++) {
                System.out.print("x");
            }
            System.out.println("");
        }

        
        
    }
    
}
