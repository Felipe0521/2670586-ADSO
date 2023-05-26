import java.util.Scanner;
public class Ejercisio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Ingrese el valor de x: ");
        x = entrada.nextInt();

        System.out.print("Ingrese el valor de y: ");
        y = entrada.nextInt();

        if (x > 0 && y > 0) {
            System.out.print("usted se encuentra el primer cuadrante ");
            
        }if (x < 0 && y > 0) {
            System.out.print("usted se encuentra el segundo cuadrante ");
            
        }if (x < 0 && y < 0) {
            System.out.print("usted se encuentra el tercer cuadrante ");
            
        }if (x > 0 && y < 0) {
            System.out.print("usted se encuentra el cuarto cuadrante ");
            
        }else{
            System.out.print("usted no se encuentra dentro de ningun cuadrante");
        }
    }
}
