import java.util.Scanner;
public class Ejercisio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int resultado;
        System.out.println("ingresa un numero de 6 digitos");
        int numeros = entrada.nextInt();

        System.out.println("// ------------------------------------------------------------------- //");
        System.out.println("//   Menu:                                                             //");
        System.out.println("//    1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito.           //"); 
        System.out.println("//    4. Cuarto Digito. 5. Quinto Digito.  6. Sexto Digito.            //");                                                          //");
        System.out.println("// ------------------------------------------------------------------- //");
        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();

        if (opcion > 5 & opcion < 7){
          resultado = numeros % 10;
          System.out.println("El sexto digito es: " +resultado);
        }if (opcion >4 & opcion < 6){
          numeros = numeros / 10;
          resultado = numeros % 10;
          System.out.println("El quinto digito es: " +resultado);
        }if (opcion >3 & opcion < 5) {
            numeros = numeros / 100;
            resultado = numeros % 10;
            System.out.println("El cuarto digito es: " +resultado);
        }if (opcion >2 & opcion < 4) {
            numeros = numeros / 1000;
            resultado = numeros % 10;
            System.out.println("El tercer digito es: " +resultado);
        }if (opcion >1 & opcion < 3) {
            numeros = numeros / 1000;
            resultado = numeros % 10;
            System.out.println("El segundo digito es: " +resultado);
        }if (opcion >0 & opcion < 2) {
            numeros = numeros / 10000;
            resultado = numeros % 10;
            System.out.println("El primer digito es: " +resultado);
        }

    }
}
