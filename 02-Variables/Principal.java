import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        byte turno;
        short loteria_risaralda;
        int saldo_bancario;
        long tarjeta_identidad;
        float nota;
        double pi;
        boolean bandera;
       

        System.out.println("turno: ");
        turno = teclado.nextByte();
        System.out.println("loteria_risaralda: ");
        loteria_risaralda = teclado.nextShort();
        System.out.println("saldo_bancario: ");
        saldo_bancario = teclado.nextInt();
        System.out.println("tarjeta_identidad: ");
        tarjeta_identidad = teclado.nextLong();
        System.out.println("nota:");
        nota = teclado.nextFloat();
        System.out.println("pi");
        pi = teclado.nextDouble();
        System.out.println("bandera: ");
        bandera = teclado.nextBoolean();
        
        System.out.println("turno: "+turno);
    }
}