import java.util.Scanner;

public class Ejercisio07 {

    public static void main(String[] args) {
        

       
       llenarArreglo(6);



    }
     public static void llenarArreglo(int tamanho){
         int arreglo[] = new int[tamanho];
        System.out.println("Arreglo lleno: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            int aleatorio = (int) (Math.random()*100);

            arreglo[i] = aleatorio;

            if (i >= 0 && i < arreglo.length) {
                System.out.print(arreglo[i]+",");
            }

            if (i == arreglo.length-1) {
                System.out.print("]");
            }
        }
        
        }

}

  
