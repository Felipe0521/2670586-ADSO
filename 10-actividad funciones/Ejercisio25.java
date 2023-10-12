public class Ejercisio25 {
    public static void main(String[] args) {
        /*Generar un número aleatorio dentro de un rango: Implementa una función
         que tome dos números enteros como entrada (límite inferior y superior) y
          devuelva un número aleatorio dentro de ese rango. */

          numeroRango(12,45);
          numeroRango(1, 5);
    }
    public static void numeroRango(int minimo, int limite){
        int aleatorio = (int) (minimo+Math.random()*limite);

        System.out.println("numero entre "+minimo+" y "+limite+" es: "+aleatorio);
    }

}
