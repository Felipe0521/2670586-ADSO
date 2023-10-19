import java.util.Scanner;
public class borrador {
    public static void main(String[] args) {
        Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

        TarjetaDebito listaTarjetaDebito [] = new TarjetaDebito[6];
        CajeroElectronico listaCajeroElectronico [] = new CajeroElectronico[2];

    listaCajeroElectronico[0] = new CajeroElectronico(100000000, "BANCOLOMBIA", "123", "123S");
    listaCajeroElectronico[1] = new CajeroElectronico(150000000, "Davivienda", "987", "987");
   
    listaCajeroElectronico[0].imprimirDetalle();
    int indiceTarjeta = 5;
		int opcion = 0;
    while (opcion != 3) {
        
        System.out.println("\n\n");
			System.out.println("+--------------------------------------+");
			System.out.println("+           CAJERO ELECTRONICO         +");
			System.out.println("+--------------------------------------+");
			System.out.println("| 1: Iniciar sesion como Administrador.|");
			System.out.println("| 2: Ingresar Tarjeta.                 |");
            System.out.println("| 3: Salir.                            |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 3): ");
			opcion = entrada_numero.nextInt();

            int cajeroActual = -1;
            if (opcion == 1) {
                System.out.println("Ingrese Nombre de Usuario: ");
                String usuario = entrada_texto.nextLine();
                System.out.println("Ingrese Clave: ");
                String clave = entrada_texto.nextLine();

                for (int i = 0; i < listaCajeroElectronico.length; i++) {
                    if (listaCajeroElectronico[i].getUsuarioAdmin().equals(usuario)  && listaCajeroElectronico[i].getClaveAdmin().equals(clave) ) {
                        cajeroActual = i;
                        break;
                    }
                }
                
                if (cajeroActual != -1) {
                    int opcion_cajero = 0;
                    while (opcion_cajero != 5) {
                        System.out.println("+--------------------------------------+");
			            System.out.println("+     OPCIONES CAJERO ELECTRONICO      +");
			            System.out.println("+--------------------------------------+");
			            System.out.println("| 1: Abastecer Cajero.                 |");
			            System.out.println("| 2: Ver Historial.                    |");
                        System.out.println("| 3: Ver Detalles.                    |");
                        System.out.println("| 4: Cambiar Clave.                     |");
                        System.out.println("| 5: Salir.                            |");
			            System.out.println("+-------------------------------------+");
			            System.out.print("=> Ingrese una opcion (1 al 5): ");
                         opcion_cajero = entrada_numero.nextInt();

                         if (opcion_cajero == 1) {
                             System.out.println("Ingrese cantidad de billetes de 10");
                             int cant_10 = entrada_numero.nextInt();

                             System.out.println("Ingrese cantidad de billetes de 20");
                             int cant_20 = entrada_numero.nextInt();

                             System.out.println("Ingrese cantidad de billetes de 50");
                             int cant_50 = entrada_numero.nextInt();

                             System.out.println("Ingrese cantidad de billetes de 100");
                             int cant_100 = entrada_numero.nextInt();

                             listaCajeroElectronico[cajeroActual].abastecerCajero(cant_10, cant_20, cant_50, cant_100);
                         }

                         if (opcion_cajero == 2) {
                            listaCajeroElectronico.verHistorialCajero();
                         }

                         if (opcion_cajero == 3) {
                            listaCajeroElectronico[cajeroActual].imprimirDetalle();

                         }

                         if (opcion_cajero == 4) {
                            System.out.println("\n\n");
				            System.out.println("+-------------------------+");
				            System.out.println("|-------- SALIENDO -------|");
				            System.out.println("+-------------------------+");
                            
                         }
                    }
                    
                }else{
                            System.out.println("\n\n");
				            System.out.println("+-------------------------+");
				            System.out.println("|CLAVE O USUARIO INCORRECTO|");
				            System.out.println("+-------------------------+");
                }
            }

            if (opcion == 2) {
                    int tarjetaActual = -1;

                    System.out.println("Ingrese Numero De Tarjeta");
                    String numero = entrada_texto.nextLine();

                    
                    for (int i = 0; i < listaTarjetaDebito.length; i++) {
                        if (listaTarjetaDebito[i].getNumero_Tarjeta() == numero) {
                            System.out.println("Ingrese Clave");
                            String clave = entrada_texto.nextLine();
                            if (listaTarjetaDebito[i].getClave() == clave) {
                                tarjetaActual = i;
                            }else{
                                System.out.println("Clave Incorrecta");
                            }
                        }
                    }

                    if (tarjetaActual != -1) {
                        int opcion_tarjeta = 0;

                        while (opcion_tarjeta != 4) {
                        System.out.println("+--------------------------------------+");
			            System.out.println("+     OPCIONES TARJETA DEBITO          +");
			            System.out.println("+--------------------------------------+");
			            System.out.println("| Saldo: "+listaTarjetaDebito[tarjetaActual].getInfoSaldo());
			            System.out.println("| 2: Retirar Dinero.                    |");
                        System.out.println("| 3: Ver Historial.                     |");
                        System.out.println("| 4: Cambiar Clave.                     |");
                        System.out.println("| 5: Salir..                            |");
			            System.out.println("+-------------------------------------+");
			            System.out.print("=> Ingrese una opcion (1 al 5): ");
                         opcion_tarjeta = entrada_numero.nextInt();
                        }
                        
                    }
            }
        }
    }

}
