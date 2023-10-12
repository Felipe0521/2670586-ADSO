public class Ejercisio21 {
    public static void main(String[] args) {
        /*. Convertir Celsius a Fahrenheit: Implementa una función que tome una temperatura
         en grados Celsius como entrada y la devuelva convertida en grados Fahrenheit. */

         pasarCelsius(12);
         pasarCelsius(32);
         pasarCelsius(0);

    }

    public static void pasarCelsius(int gCelsios){
        double fahrenheit = (gCelsios * 1.8)+32;

        System.out.print(gCelsios+" grados celsius son "+fahrenheit+" grados fahrenheit");
    }
}
