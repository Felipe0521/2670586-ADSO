import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
         * Solicitar al usuario ingresar un número N, crear un arreglo de tamaño N, llenarlo con datos aleatorios y crear un
            arreglo nuevo con los datos del arreglo original sin repetir.
         */
       System.out.print("Ingrese tamanho del arreglo: ");
       int tamanho = entrada.nextInt();
       
       int arreglo[] = new int[tamanho];

       for (int i = 0; i < arreglo.length; i++) {
        int numero_aleatorio = (int) (Math.random()*10);
        arreglo[i] = numero_aleatorio;
       }
       // imprimir arreglo original //
       System.out.print("Arreglo Original: ");
       for (int j = 0; j < arreglo.length; j++){
            if (j == 0) {
                System.out.print("[");
            }
        
            if (j < arreglo.length-1) {
                System.out.print(arreglo[j]+", ");
            }

            if (j == arreglo.length-1) {
                System.out.print(arreglo[j]+"]");
            }
        }
        //  
        System.out.println("");
        System.out.print("Arreglo sin repetir: ");
        System.out.print("[");
        
        // impimir no repetidos//
        for (int i = 0; i < arreglo.length; i++) {
            boolean unico = true;
            for (int j = i; j < arreglo.length; j++) {
                
             if (arreglo[j] == arreglo[i] ) {
                if (i != j) {
                     unico = false;
                }
               
             }  

            }
           if (unico == true) {
            System.out.print(arreglo[i]+", ");
           }
        }
        System.out.print("]");
    }
}
