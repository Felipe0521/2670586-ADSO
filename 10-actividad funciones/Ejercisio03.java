public class Ejercisio03 {
    public static void main(String[] args) {
        System.out.println("Multiplicacion => "+Multiplicacion(12,13));
        System.out.println("Multiplicacion => "+Multiplicacion(-12,13));
        System.out.println("Multiplicacion => "+Multiplicacion(-111,13));
         System.out.println("Multiplicacion => "+Multiplicacion(12,-130));
          System.out.println("Multiplicacion => "+Multiplicacion(-12,-13));

   }


    public static int Multiplicacion(int a, int b){
       int resultado = (a*b);

       return resultado;
   }
}    

