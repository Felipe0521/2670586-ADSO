public class Ejercisio06 {
    public static void main(String[] args) {
        System.out.println("MAXIMO DE TRES NUMEROS => "+potencia(2,5, 50));
        System.out.println("MAXIMO DE TRES NUMEROS => "+potencia(2,3, -5));
        System.out.println("MAXIMO DE TRES NUMEROS => "+potencia(111,13, 5));
         System.out.println("MAXIMO DE TRES NUMEROS => "+potencia(12,-130, 5));
          System.out.println("MAXIMO DE TRES NUMEROS => "+potencia(12,13, 5));

   }


    public static int potencia(int a, int b,int c){
        int maximo = 0;
       if (a > b && a>c) {
            maximo = a;
       }if (b>a && b>c) {
         maximo = b;
       } if (c>a && c>b) {
            maximo = c;
       }
        return maximo;
   }
}
