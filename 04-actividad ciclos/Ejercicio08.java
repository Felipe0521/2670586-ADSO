import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("INGRESE NUMERO DE MAXIMO SEIS DIGITOS: ");
        int numero = entrada.nextInt();

        int digito06 = numero % 10;
         int digito05 = (numero % 100)/10;
          int digito04 = (numero % 1000)/100;
           int digito03 = (numero % 10000)/1000;
            int digito02 = (numero % 100000)/10000;
            int digito01 = numero / 100000;


             

             int contador =1;

            while (contador == 1) {
                if (numero >= 100000) {

             System.out.println("-> El digito 01 es: "+digito01);
             System.out.println("-> El digito 02 es: "+digito02);
             System.out.println("-> El digito 03 es: "+digito03);
             System.out.println("-> El digito 04 es: "+digito04);
             System.out.println("-> El digito 05 es: "+digito05);
             System.out.println("-> El digito 06 es: "+digito06);

             contador++;

               
            }
           
    }
}
}
