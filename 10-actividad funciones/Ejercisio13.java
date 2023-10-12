public class Ejercisio13 {
    public static void main(String[] args) {
        /*Ordenar un arreglo: Escribe una función que tome un arreglo
         de números como entrada y lo ordene en
        orden ascendente. */

        int array[] = {12,45,65,22,11,32,87};

        ordenarArreglo(array);
    }
    public static void ordenarArreglo(int[] array){
        int menor = array[0];
        int mayor = array[0];

        // encontrar mayor y menor //
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
            }if(array[i] < menor){
                menor = array[i];
            }
        }

        // imprimir ascendente//
        int contador = menor;
         System.out.print("[ ");
       while (contador <= mayor) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == contador) {
                    System.out.print(array[i]+", ");
                }
               
            }
            contador += 1;
       }
       System.out.print("]");
    }
}
