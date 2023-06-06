import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("---CUANTOS AÑOS TIENES----");
        System.out.print("Ingrese dia de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int anho = entrada.nextInt();

         int anhoact = 2023;
        int mesact = 6;
        int diact = 6;
        if (anho > 1900 & anho < 2023) {
            if (anhoact - anho == 18) {
                
                if (mes >= mesact) {
                    if (dia >= diact) {
                        System.out.print("Usted es mayor de edad ");
                    }
                }
            }
        }
        if (anho > 1900 & anho < 2023) {
            if (anhoact - anho >= 19) {
                
                System.out.print("Usted es mayor de edad ");
            }
        }
        if (anho > 1900 & anho < 2023) {
            if (anhoact - anho < 18) {
                
                System.out.print("Usted es menor de edad ");
            }
        }else{
            System.out.print("Ingrese datos validos ");
        }

    }
}
