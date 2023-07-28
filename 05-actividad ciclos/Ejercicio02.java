import java.util.Scanner;
import java.util.Random;
public class Ejercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

               
       /*
        Realizar una aplicación en JAVA que muestre en pantalla una fecha de manera aleatoria, es decir que cada vez que se
        ejecute la aplicación la fecha debe ser diferente. Para la construccion de la fecha se debe usar una variable entera donde
        los 2 primeros digitos de izquierda a derecha significa el dia del mes, el siguiente grupo de 2 digitos significa el numero del
        mes y el ultimo grupo de 4 digitos significa el numero del año.

        */

        int anho = (int) (1000+Math.random()*9999);
        int mes = (int) (1+Math.random()*12);
        int dia = (int) (1+Math.random()*31);

        // Año bisiesto o no
        if (anho % 4 == 0) {
            if (mes == 2) {
                 dia = (int) (1+Math.random()*29);
            }
        }else {
            if (mes == 2){
                 dia = (int) (1+Math.random()*28);
            }
        }

        // Mes 30 o no
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
             dia = (int) (1+Math.random()*30);
        }

        // acompañamiento 0 o no
        if (dia < 10) {
            System.out.print("0"+dia);
        }else{
             System.out.print(dia);
        }

         if (mes < 10) {
            System.out.print(" / "+"0"+mes);
        }else{
             System.out.print(" / "+mes);
        }

         System.out.print(" / "+anho);
    } 
     
}
