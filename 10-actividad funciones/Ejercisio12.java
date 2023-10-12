public class Ejercisio12 {
    public static void main(String[] args) {
       boolean numero1 = ComprobarPrimo(12);
       boolean numero2 = ComprobarPrimo(23);

       
       System.out.print(numero2);
       
    }
    public static boolean ComprobarPrimo(int numero){
        boolean primo = true;
       

              for (int j = numero-1; j > 2; j--) {
                if (numero % j == 0) {
                    primo = false;
                }
              }
            

            return primo;
        
    }
}
