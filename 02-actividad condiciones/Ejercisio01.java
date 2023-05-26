import java.util.Scanner;
     public class Ejercisio01 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            
           // Realizar una pequeña aplicación en JAVA, donde salude al usuario y pregunte su edad.
            //- Si el usuario es menor de edad, se debe mostrar en pantalla que recibe un auxilio de $ 800.000
            //- Si el usuario es mayor de edad, se debe mostrar en pantalla que paga un impuesto de $ 200.000
            int edad;
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();

            if (edad >= 18) {
                System.out.print("usted paga un impuesto de 200.000");
            }else{
                System.out.print("usted recibe un auxilio de 800.000");
            }

        }
     }