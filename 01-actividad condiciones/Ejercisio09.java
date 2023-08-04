import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;
public class Ejercisio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       // Comprobación de número par/impar: Escribe un programa que tome un número como entrada y
       //determine si es par o impar.
       int numero;
       System.out.println("ingrese un numero: ");
       numero = entrada.nextInt();

       if (numero % 2 == 0) {
        System.out.println("el numero es par");
    } else {
        System.out.println("el nuemro es impar");
    }
}

    }

