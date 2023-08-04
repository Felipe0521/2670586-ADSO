import java.util.Scanner;
public class Ejercisio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       // Cálculo del perímetro y área de un círculo: Escribe un programa que tome el radio de un círculo como
      //entrada y calcule su perímetro (2 * π * radio) y su área (π * radio^2).
      int radio;
      double perimetro;
      double area;
      double pi;

      System.out.println("introduzca el radio del circulo");
      radio = entrada.nextInt();
       pi=3.1416;
       perimetro = 2*pi*radio;
       area = pi*radio*radio;

       System.out.println("el perimetro del circulo es: "+perimetro);
       System.out.println("el area del circulo es: "+area);
    }
}
