import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //. Escribir un programa que calcule el descuento aplicado a una compra ingresando el precio original y el
         //porcentaje de descuento, pero solo si el porcentaje de descuento es válido (entre 0 y 100)

         System.out.println("---DESCUENTO---");
         
         System.out.print("ingrese el precio del producto : ");
         int precio = entrada.nextInt();

         System.out.print("Ingrese el descuento a aplicar: ");
         int descuento = entrada.nextInt();

         if (descuento <= 100 & descuento >= 0){
           int valor = (precio * descuento)/100;

            int total = precio - valor;

            System.out.print("El valor del producto es de: "+total);
         }else{
            System.out.print("ingrese un porcentaje valido");
         }
    }
}
