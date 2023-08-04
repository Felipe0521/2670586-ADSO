import java.util.Scanner;
public class Ejercisio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       // Convertir segundos a horas, minutos y segundos: Escribe un programa que tome un número de segundos
        //como entrada y lo convierta a un formato de horas, minutos y segundos.
        int segundos;
        int horas;
        int minutos;

        System.out.println("ingrese el numero de segundos a convertir");
        segundos = entrada.nextInt();

        horas = segundos/3600;
        minutos = segundos/60;
        
        System.out.println("la corversion en horas es: "+horas);
        System.out.println("la conversion en minutos es: "+minutos);
    }

}
