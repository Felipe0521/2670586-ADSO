import java.util.Scanner;
    public class Ejercisio08 {
         public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Concatenación de cadenas: Escribe un programa que tome dos cadenas de texto como entrada y las concatene en una sola cadena.//
        
         
         System.out.println("ingrese texto 1 a concatenar");
        String texto_1 = entrada.nextLine();

         System.out.println("Ingrese texto 2 a concatenar");
        String texto_2 = entrada.nextLine();

        String concatenado = texto_1 + texto_2;

         System.out.println(concatenado);



    }
}
