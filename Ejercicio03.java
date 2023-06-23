import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
          
           int generado = (int)(Math.random()*100);
        
             
            if (generado % 2 == 0){
                 
                do{
                  generado = (int)(Math.random()*100);
               
                }while(generado % 2 != 0);
                     System.out.println("Primo "+i+" Generado -> "+generado);
                 }
               
            if (generado % 2 != 0) {
                 System.out.println("Primo "+i+" Generado -> "+generado);
            }
             generado = 0;
        }
    }
}
