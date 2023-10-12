public class Ejercisio16 {
    public static void main(String[] args) {
        /*. Contar dígitos: Escribe una función que tome un númer
        o entero como entrada y devuelva la cantidad de dígitos que tiene. */
        cantidadDigitos(1);
        cantidadDigitos(13);
        cantidadDigitos(647);
        cantidadDigitos(8239);
        cantidadDigitos(19000);
        
    }
    public static void cantidadDigitos(int numero){
        int resultado = 1;
        int divisor = 1;
        int digitos = 0;
        while (resultado > 0) {
        resultado = numero / divisor;
         digitos += 1;   
        divisor = divisor*10;
        }

        System.out.println("El numero tiene "+(digitos-1)+" digitos");
    }
}
