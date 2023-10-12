public class Ejercisio14 {
    public static void main(String[] args) {
         /*Verificar ordenado de arreglo: Escribe una función que tome
     un arreglo de números como entrada y
    devuelva un valor booleano que indique si esta
    ordenado de forma ascendente. */

    int array1[] = {12,34,21,231,111};
    int array2[] = {1,11,23,45,65,76};
    int array3[] = {10,11,23,45,65,66};
    verificarOrden(array1);
    verificarOrden(array2);
      verificarOrden(array3);   
    }

    public static void verificarOrden(int[] array){
        boolean ordenAscendente = false;
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1) {
                 if (array[i] < array[i+1] ) {
                aux += 1;
            }
            }
           
        }

        if (aux == array.length-1) {
            ordenAscendente = true;
        }

        System.out.println("El arreglo es ascendente: "+ordenAscendente);
    }
   


}
