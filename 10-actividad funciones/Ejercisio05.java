
public class Ejercisio05 {
    public static void main(String[] args) {
        System.out.println("POTENCIA => "+potencia(2,5));
        System.out.println("POTENCIA => "+potencia(2,3));
        System.out.println("POTENCIA => "+potencia(111,13));
         System.out.println("POTENCIA => "+potencia(12,-130));
          System.out.println("POTENCIA => "+potencia(12,13));

   }


    public static int potencia(int a, int b){
        int resultado = a;
       for (int i = 1; i < b; i++) {
            resultado = resultado*a; 
       }

       return resultado;
   }
    
}
