import java.util.Scanner;
    public class Ejercisio07 {
       public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       // Cálculo de descuento: Pide al usuario el precio de un producto y un porcentaje de descuento. Calcula el precio final aplicando el descuento. Muestra el precio final por pantalla.//
        int precio;
        int porcentaje;
        int descuento;

        System.out.println("ingrese el precio del producto");
        precio = entrada.nextInt();

        System.out.println("Ingrese el descuento a aplicar: ");
        porcentaje = entrada.nextInt();

        descuento = (precio/100)*porcentaje;
        precio = precio - descuento;

        System.out.println("el precio con descuento es: "+precio);
       }
}
