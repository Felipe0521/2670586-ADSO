import java.util.Scanner;
public class Ejercisio15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la longitud en metros: ");
        double metros = entrada.nextDouble();

        System.out.println("La longitud en centimetros es " + metros * 100);
        System.out.println("La longitud en pulgadas es " + metros * 39.3700787);
        System.out.println("La longitud en pies es " + metros * 3.280839895);
}
}