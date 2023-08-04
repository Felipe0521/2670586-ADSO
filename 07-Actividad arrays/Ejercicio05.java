import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese Tamaño del arreglo: ");
        int tamaño = entrada.nextInt();
       
        int arreglo[] = new int[tamaño];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese valor de la posicion "+i+": ");
           int numero = entrada.nextInt();
            arreglo[i] = numero;
        }
        System.out.println("------------------------------------");
        System.out.println("Arreglo: ");

        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
               System.out.print("[");
            }
           
             if (i >= 0 ) {
                  System.out.print(arreglo[i]+", ");
             }
             if (i == (arreglo.length-1)) {
                 System.out.print("]");
             } 
         }
          
         System.out.println("");
                
         System.out.print("Ingrese Numero de movimientos: ");
         int cant_movimientos = entrada.nextInt();

         int contador = 1;
         int resto = 1;
         while (contador <= cant_movimientos) {
             
            if (resto > arreglo.length-1) {
                resto = 0;
            }
            System.out.print("Movimiento "+contador+":  ");

            for (int i = resto; i < arreglo.length; i++) {
                 if (i == resto) {
               System.out.print("[");
            }
           
             if (i >= 0 ) {
                  System.out.print(arreglo[i]+", ");
             }
             
            }
            for (int j = 0; j < resto; j++) {
               
                 System.out.print(arreglo[j]+", ");
                
            }
             System.out.print("]");
            contador++;
            resto++;
            System.out.println("");
                
         }
         
    }
}