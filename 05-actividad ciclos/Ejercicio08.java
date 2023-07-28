import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*
         Realizar una aplicación en JAVA, que solicite al usuario un numero entero N, se debe mostrar en pantalla una cuadricula
        de tamaño NxN. La cuadricula tendrá los siguientes números:
                - Iniciando en la esquina superior izquierda debe ubicar números primos cada dos posiciones hasta llegar al
                final de la matriz.
                - Iniciando en la esquina inferior derecha debe ubicar números No primos cada dos posiciones hasta llegar al
                inicio de la matriz.
         */

         System.out.print("Ingrese tamaño del cuadro: ");
         int n = entrada.nextInt();

          int tamaño = n * n;
          int cuenta_primos = 2;
          int cuenta_no_primos = 1;
          int contador = 1;


          if (n % 2 == 0) {
            
          }
        while (contador <= tamaño) {
            
            for (int i = 1; i <= n; i++ ){
                
                if (i == n) {
                    System.out.println("");
                }
            }
        }
    }
}
