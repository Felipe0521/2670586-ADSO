import java.util.Scanner;
public class Ejercicio07 {
    

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
         Escriba un programa que pida al usuario un numero entero N impar y luego imprima en pantalla un rombo, donde N es el
        ancho y la altura del rombo.
         */

         System.out.print("Ingrese tamaño del rombo: ");
         int tamaño = entrada.nextInt();
         int p = 2;
        
        if (tamaño % 2 != 0) {
             for (int i = 1; i <= tamaño; i=i+p){
                  if (i == 1) {
                   System.out.print("    ");
                  }  
                   if (i == 3) {
                   System.out.print("   ");
                  }  
                   if (i == 5) {
                   System.out.print("  ");
                  }  
                   if (i == 7) {
                   System.out.print(" ");
                  }  
             for (int j = 1; j <= i; j++) {
                
                System.out.print("x");

            }
            System.out.println(" ");

            if (i == tamaño) {
                p = -2;
                i = tamaño;
            }
            if (i == -1) {
                break;
            }
         }
        }else{
             System.out.print("Tamaño invalido :( tiene que ser par ");
        }
        

          
    }
}
