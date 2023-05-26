import java.util.Scanner;
public class Ejercisio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         //Realizar una pequeña aplicación en JAVA, donde se solicite al usuario tres números enteros y se indique en pantalla si los
         //números se ingresaron en orden ascendente

         System.out.println("ingrese primer numero");
         int num1 = entrada.nextInt();
         System.out.println("ingrese segundo numero");
         int num2 = entrada.nextInt();
         System.out.println("ingrese tercer numero");
         int num3 = entrada.nextInt();

         if (num1 > num2 && num2 >num3){
            System.out.println("Los numeros estan en orden ascendente");
         }if (num1 < num2 && num2 < num3) {
            System.out.println("Los numeros estan en orden descendente");
         }
    }
}
