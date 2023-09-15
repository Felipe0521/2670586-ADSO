public class Ejercisio04 {
    public static void main(String[] args) {
        System.out.println("Division => "+Division(120,13));
        System.out.println("Division => "+Division(-12,13));
        System.out.println("Division => "+Division(-111,13));
         System.out.println("Division => "+Division(12111,1130));
          System.out.println("Division => "+Division(101,13));

   }


    public static int Division(int a, int b){
       int resultado = (a/b);

       return resultado;
   }
      
}
