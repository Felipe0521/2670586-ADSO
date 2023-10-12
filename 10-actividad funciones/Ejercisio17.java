public class Ejercisio17 {
    public static void main(String[] args) {
        /*Suma de dígitos: Crea una función que tome un número
         entero como entrada y devuelva la suma de sus dígitos */

         sumarDigitos(123);
        sumarDigitos(7689);
        sumarDigitos(33309);
    }

    public static void sumarDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
         
        int digito = numero % 10;
            suma += digito;

            numero /= 10;
        }

  
        System.out.println("La suma de los dígitos es " + suma);
    }
}

