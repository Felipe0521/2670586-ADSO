public class Ejercisio01 {
    public static void main(String[] args) {
        System.out.println("SUMA => "+suma(12,13));
         System.out.println("SUMA => "+suma(-12,13));
         System.out.println("SUMA => "+suma(-111,13));
          System.out.println("SUMA => "+suma(12,-130));
           System.out.println("SUMA => "+suma(-12,-13));

    }


     public static int suma(int a, int b){
        int resultado = (a+b);

        return resultado;
    }
}

   