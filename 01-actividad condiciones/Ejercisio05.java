import java.util.Scanner;
public class Ejercisio05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       // Cálculo del área de un triángulo: Escribe un programa que tome la base y la altura de un triángulo como
       // entrada y calcule su área utilizando la fórmula: área = (base * altura) / 2.
          int base;
          int altura;
          int area;

            System.out.println("Introduzca la base: ");
            base = entrada.nextInt();

            System.out.println("Introduzca la altura");
            altura = entrada.nextInt();

            area = (base*altura)/2;

            System.out.println("El area es igual a: "+area);
        }

        
}