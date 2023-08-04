import java.util.Scanner;
public class Ejercisio19 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("nombre: ");
        String name = entrada.nextLine();

        
        System.out.print("Edad: ");
        int age = entrada.nextInt();

        
        System.out.print("salario: ");
        int salary = entrada.nextInt();


        System.out.println(" informacion:");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Salario: " + salary);
    }

    
}
