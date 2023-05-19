import java.util.Scanner; //importar la variable Scanner//

public class Entrada{
    public static void main(String[] args) {
        //variable para leer el teclado//
        Scanner teclado = new Scanner(System.in);

        int cedula;  contador;
        
        cedula = 0;
        contador = 0;
        System.out.println("Ingrese su cedula: ");
        cedula = teclado.nextInt();
        System.out.println("Ingrese contador: ");
        contador = teclado.nextInt();

    }
}