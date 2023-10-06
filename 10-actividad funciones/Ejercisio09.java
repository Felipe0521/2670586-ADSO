public class Ejercisio09 {
    public static void main(String[] args) {
        int array1[] = {1,4,6,8,34,31};

        minimoArreglo(array1);

    }

    public static void minimoArreglo(int[] array){
         int aux = array[0];
        for (int i = 0; i < array.length; i++) {
             
            if (array[i] < aux) {
                aux = array[i];
            }

           
        }
        System.out.println("El valor minimo del arreglo es: "+aux);
    }
}
