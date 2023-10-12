public class Ejercisio20 {
    public static void main(String[] args) {
        /*Calcular el área de un triángulo: Implementa
         una función que tome la base y la altura de un triángulo
        como entrada y devuelva su área. */

        calcularArea(35,23);
        calcularArea(56,12);

    }
    public static void calcularArea(int base, int altura){
        int area = (base*altura)/2;

        System.out.println("El area de un triangulo con base "+base+" y altura "+altura+" es: "+area);
    }
}
