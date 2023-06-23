import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

               

    for (int i = 0; i < 3; i++) {
               
                int anho = (int) ( 1 + Math.random() * 9999 );
               
        if (anho % 4 == 0) {
            int mes = (int) ( 1 + Math.random() * 12 );
            if (mes < 10){
                System.out.println("0"+mes);
            }
        }
         System.out.println("Fecha generada: " + dia + " " + mes + " " + anho + " ");
    }

        
    } 
     int dia = (int) ( 1 + Math.random() * 30 );
}
