import java.util.Scanner;
public class Ejercisio02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
            //Escribe un programa que convierta una temperatura en grados Celsius a
             // grados Fahrenheit. La fórmula de conversión es: F = (C * 9/5) + 32
   
             int celsius;
             int resultado;

             System.out.println("Ingrese temperatura en grados celsius: ");
            celsius = entrada.nextInt();

            resultado = (celsius*9/5) + 32;
            System.out.println("la temperatura en farenheit es: "+resultado);
        }

        
         
}