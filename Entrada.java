import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_registros = 100;
        String clientes[] = new String[100];
        int posicion = 0;

        do {
            System.out.println("Memoria disponible: " + numero_registros);
            System.out.println("1: Registrar Cliente.");
            System.out.println("2: Ver Lista de Clientes.");
            System.out.println("3: Editar Cliente.");
            System.out.println("4: Eliminar Cliente.");
            System.out.println("5: Salir");
            System.out.println("--------------------------");

            System.out.println("Ingrese Opcion a realizar: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Consume el carácter de nueva línea después de leer el número

            if (opcion == 1) {
                // Resto del código para registrar un cliente
            } else if (opcion == 2) {
                // Resto del código para ver la lista de clientes
            } else if (opcion == 3) {
                // Resto del código para editar un cliente
            } else if (opcion == 4) {
                System.out.println("Ingrese nombre del cliente a eliminar: ");
                String nombre_cliente = entrada.nextLine();

                // Buscar el nombre en el arreglo
                int index = -1;
                for (int i = 0; i < posicion; i++) {
                    if (clientes[i].equalsIgnoreCase(nombre_cliente)) {
                        index = i;
                        break;
                    }
                }

                // Si el nombre existe, eliminarlo del arreglo
                if (index != -1) {
                    for (int i = index; i < posicion - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    clientes[posicion - 1] = null; // O podrías poner una cadena vacía ""
                    posicion--;
                    numero_registros++;
                    System.out.println("Cliente eliminado.");
                } else {
                    System.out.println("No se encontró el cliente en el arreglo.");
                }
            } else if (opcion == 5) {
                numero_registros = 0;
            } else {
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }

        } while (numero_registros > 0);
    }
}
