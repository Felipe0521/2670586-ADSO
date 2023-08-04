import java.util.Scanner;
public class Ejercisio12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //Calcular el área de un rectángulo: Escribe un programa que tome el ancho y la altura de un rectángulo
        //como entrada y calcule su área.
        int base;
        int altura;
        int area;

        System.out.println("ingrese el ancho del triangulo: ");
        base = entrada.nextInt();

        System.out.println("ingrese la altura del triangulo: ");
        altura = entrada.nextInt();

        area = (base*altura)/2;

        System.out.println("el area del triangulo es: "+area);

    }
    
}
