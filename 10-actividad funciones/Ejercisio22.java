public class Ejercisio22 {
    public static void main(String[] args) {
        /*22. Generar números primos: Escribe una función que reciba un numero entero,
         cree un arreglo de tamaño del número ingresado y devuelva el arreglo lleno con
          números primos. */

          generaPrimos(8);
          generaPrimos(5);

    }
    public static void generaPrimos(int cantidad){
        int arreglo[] = new int[cantidad];
       
        for (int i = 0; i < arreglo.length; i++) {
            
            
            boolean esPrimo = false;

            while (esPrimo == false) {
                int primo = 0;
                  int aleatorio = (int) (Math.random()*1000);

                  for (int j = 2; j < aleatorio; j++) {
                    if (aleatorio % j  == 0) {
                        primo = -1;
                    }
                  }
                  
                  if (primo != -1) {
                    arreglo[i] = aleatorio;
                   esPrimo = true;
                  }
            }
            
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i < arreglo.length-1) {
                System.out.print(arreglo[i]+", ");
            }
            if (i == arreglo.length-1) {
                System.out.print(arreglo[i]+"]");
            }
        }
        System.out.println("");
    }
}
