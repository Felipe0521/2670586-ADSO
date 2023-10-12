public class Ejercisio19 {
    public static void main(String[] args) {
        /*19. Calcular el área de un círculo: Crea una función
         que tome el radio de un círculo como entrada y devuelva
        su área. */

        definirArea(45);
        definirArea(23);
    }
    public static void definirArea(int radio){
        double area = 3.1415 * (radio*radio);

        System.out.println("El area de un circulo con radio "+radio+" es: "+area);
    }
    
}
