import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        int promedio;

        System.out.println("----PROMEDIO 3 NOTAS---");

        System.out.print("Escriba el primer numero: ");
       int num1 = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
       int num2 = entrada.nextInt();

        System.out.print("Escriba el tercer numero: ");
       int num3 = entrada.nextInt();

       System.out.print("-------------------------- ");

        if (num1 <10 | num2 <10 | num3 <10 ) {

            promedio = (num1 + num2 + num3)/3;

            if (promedio >= 7) {
                System.out.print("Usted aprobo su promedio fue de: "+promedio);
            }else {
                System.out.print("Usted reprobo su promedio fue de: "+promedio);
            }
            
        } else{
            System.out.print("numero no valido");
        }
       
       

    }
}
