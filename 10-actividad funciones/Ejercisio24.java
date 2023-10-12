 public class Ejercisio24 {
    public static void main(String[] args) {
        /*Contar los números pares e impares en un arreglo: Crea una función que tome
         un arreglo de números como entrada y devuelva la cantidad de números
          pares e impares en el arreglo. */
        int array[] = {12,3,5,76,34,1};
          paresImpares(array);
    }

    public static void paresImpares(int[] array){
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                pares += 1;
            }if(array[i]%2 != 0){
                impares += 1;
            }
        }
        System.out.print("El arreglo tiene "+pares+" pares y "+impares+" impares");
    }
    
 }