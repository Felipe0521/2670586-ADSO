import java.util.Scanner;
public class Ejercicio03 {
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
        System.out.println("---------------------------------------");
        System.out.println("El arreglo final es el siguiente: ");

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
        System.out.print("Ingrese posicion del arreglo: ");
        int posicion = entrada.nextInt();

        int resto =  arreglo.length - posicion;

         System.out.println("---------------------------------------");
         System.out.println("Anti horario: ");

        for (int i = posicion; i >= 0; i--) {
             if (i == posicion) {
              System.out.print("[");
           }
          
            if (i > 0 ) {
                 System.out.print(arreglo[i]+", ");
            }
            if (i == 0) {
                System.out.print(arreglo[i]);
                
            } 
            if (resto == 0) {
             System.out.print("]");
            }
           
        }
        
        if (resto > 0) {
                for (int j = posicion+1; j < arreglo.length; j++) {
                    System.out.print(", "+arreglo[j]);

                    if (j == (arreglo.length-1)) {
                    System.out.print("]");
                    } 
                }
             }
         
        


    }
}
