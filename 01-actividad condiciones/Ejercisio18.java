import java.util.Scanner;

public class Ejercisio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("introduce tu peso en kilogramos: ");
        double peso = entrada.nextDouble();

        System.out.print("introduce tu altura en metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("tu imc es " + imc);

        String imcCategoria = "";
        if (imc < 18.5) {
            imcCategoria = "bajo de peso";
        } else if (imc < 25) {
            imcCategoria = "peso normal";
        } else if (imc < 30) {
            imcCategoria = "sobrepeso";
        } else {
            imcCategoria = "Obeso";
        }

        System.out.println("su categoria en imc es " + imcCategoria);
    }
}