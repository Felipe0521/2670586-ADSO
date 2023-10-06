public class Ejercisio10 {
    public static void main(String[] args) {
        int array1[] = {43,5,6,7,3};
        
        promedioArray(array1);
    }

    public static void promedioArray(int[] array){
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
             
            suma += array[i];
           
        }
        double promedio = suma/array.length;

        System.out.print("El promedio del arreglo es: "+promedio);
    }
}
