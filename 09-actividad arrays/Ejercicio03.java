import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero_registros = 100;
        String clientes[] = new String[100];
        int posicion = 0;
        
        do {
            
             System.out.println("                                 Memoria disponible:"+numero_registros);
            System.out.println("1: Registrar Cliente.");
            System.out.println("2: Ver Lista de Clientes.");
            System.out.println("3: Editar Cliente.");
            System.out.println("4: Eliminar Cliente.");
            System.out.println("5: Salir");
            System.out.println("--------------------------");

            System.out.println("Ingrese Opcion a realizar: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                 numero_registros = numero_registros-1;
                 System.out.println("Ingrese nombre del cliente: ");
                 String nombre_cliente = entrada.nextLine();
                
                for (int i = posicion; i < clientes.length-numero_registros; i++) {
                    if (nombre_cliente.equalsIgnoreCase(clientes[i])){
                        System.out.println("Ingrese un nombre sin repetir porque "+nombre_cliente+" es igual a la posicion "+i+" = "+clientes[i]);
                    }else{
                        clientes[i] = nombre_cliente; 
                    }
                    
                }
                posicion = posicion+1;
                 System.out.println("");
                  System.out.println("");
            }
            if (opcion == 2) {
                if (numero_registros<100) {
                    System.out.print("[");
                    for (int i = 0; i < clientes.length-numero_registros; i++) {
                        System.out.print(clientes[i]+", ");
                    }
                    System.out.print("]");
                    if (numero_registros == 100) {
                        System.out.println("Primero ingresa Clientes para verlos");
                    }
                }
                 System.out.println("");
                  System.out.println("");
            }
            if (opcion == 3) {
                System.out.println("Ingrese nombre del cliente a modificar: ");
                 String nombre_cliente = entrada.nextLine();

                 for (int i = 0; i < clientes.length; i++) {
                        if (i < clientes.length-1){
                            if (nombre_cliente.equalsIgnoreCase(clientes[i])) {
                            System.out.println("Ingrese nuevo nombre del cliente: ");
                            nombre_cliente = entrada.nextLine();

                            for (int j = 0; j < clientes.length;j++){
                                if (nombre_cliente.equalsIgnoreCase(clientes[j])) {
                                  System.out.println("Ingrese un nombre sin repetir porque "+nombre_cliente+" es igual a la posicion "+j+" = "+clientes[j]);
                                }else{
                                    clientes[i] = nombre_cliente;
                                }

                            }
                            

                                }
                        } if (i == clientes.length-1) {
                            if (nombre_cliente.equalsIgnoreCase(clientes[i])) {
                            System.out.println("Ingrese nuevo nombre del cliente: ");
                            nombre_cliente = entrada.nextLine();
                            clientes[i] = nombre_cliente;
                            
                        }else{
                            System.out.println( "NO existe Usuario con ese nombre." );
                        }
                        }
                   
        
                    }
                     System.out.println("");
                      System.out.println("");
                }

           else if (opcion == 4) {
                System.out.println("Ingrese nombre del cliente a eliminar: ");
                String nombre_cliente = entrada.nextLine();

                
                int index = -1;
                for (int i = 0; i < posicion; i++) {
                    if (clientes[i].equalsIgnoreCase(nombre_cliente)) {
                        index = i;
                        break;
                    }
                }

                
                if (index != -1) {
                    for (int i = index; i < posicion - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    clientes[posicion - 1] = null; 
                    posicion--;
                    numero_registros++;
                    System.out.println("Cliente eliminado.");
                } else {
                    System.out.println("No se encontró el cliente en el arreglo.");
                }
                
                     System.out.println("");
                      System.out.println("");
                }
             if (opcion == 5) {
                numero_registros = 0;
            }
        
        }  while (numero_registros > 0);
    }
}

