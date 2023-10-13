import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Perro listaPerro [] = new Perro[50]; 
        listaPerro[0] = new Perro("Max", "valeria", 6, "Chihuaha", 30.5, 80,"SANO");

        listaPerro[1] = new Perro("Mailo", "felipe", 18, "pug", 7, 20,"SANO");

        for (int i = 0; i < listaPerro.length; i++) {
            if (listaPerro[i] != null) {
                listaPerro[i].imprimirDetalle();
            }
        }

        Perro mas_pesado = listaPerro[0];
 
        for (int i = 0; i < listaPerro.length; i++) {
             if (listaPerro[i] != null) {
                if (mas_pesado.getpeso() < listaPerro[i].getpeso()) {
                mas_pesado = listaPerro[i];
            }      
             }
                 
        }
        System.out.println("Perro mas pesado: "+mas_pesado.getNombre());
    }
}
