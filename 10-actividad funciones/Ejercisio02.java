public class Ejercisio02 {
    public static void main(String[] args) {
        System.out.println("Resta => "+Resta(102,13));
        System.out.println("Resta => "+Resta(-16,13));
        System.out.println("Resta => "+Resta(-111,13));
         System.out.println("Resta => "+Resta(112,-130));
          System.out.println("Resta => "+Resta(-12,-13));

   }


    public static int Resta(int a, int b){
       int resultado = (a-b);

       return resultado;
   }
}

