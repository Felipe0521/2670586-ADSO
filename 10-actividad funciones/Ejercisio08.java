public class Ejercisio08 {
    public static void main(String[] args) {
        
        int array[] = {1,4,6,8,34,31};

        imprimirArreglo(array);

    }

    public static void imprimirArreglo(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }

            if (i >= 0 && i < array.length) {
                System.out.print(array[i]+",");
            }

            if (i == array.length-1) {
                System.out.print("]");
            }
        }
    }
}
