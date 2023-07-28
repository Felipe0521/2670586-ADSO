import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        /*Realizar una aplicacio en JAVA que solicite al usuario un numero entero N, en pantalla se deben mostrar N numeros primos
            generados de forma aleatoria, los numeros generados no puden ser repetidos.  */

        System.out.print("Ingrese numero N: ");
        int numero = entrada.nextInt();
        int primo = 0;
        
        for (int i = 1; i <= numero; i++) {
            primo = (int) (2+Math.random()*1000);
            
           
             for (int j = 2; j < primo; j++){
                if (primo % j == 0){
                    do {
                          primo = (int) (2+Math.random()*1000);
                        
                    } while (primo % j == 0 );
                    
                    j = 2; 
                }
             }


            System.out.println("El numero "+i+" es: "+primo);
           
        }
    

    }
}    