import java.util.Date;

public class CajeroElectronico {
    int limiteTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20; 
    int cant_50;
    int cant_100;
    String nombreBanco;
    String usuarioAdmin;
    String claveAdmin;
     String listaTransacciones [];

    public CajeroElectronico( int limiteTotal,  int dineroDisponible,  int cant_10, int cant_20, int cant_50, int cant_100, String nombreBanco , String usuarioAdmin, String claveAdmin, String listaTransacciones []){

        this.limiteTotal =  limiteTotal;
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco; 
        this.usuarioAdmin = usuarioAdmin ;
        this.claveAdmin = claveAdmin;
        this.listaTransacciones  = new String [100];
    }

    public int getLimiteTotal(){
        return limiteTotal;
    }
    public int getDineroDisponible(){
        return dineroDisponible;
    }
    public String getNombreBanco(){
        return nombreBanco;
    }
   
    public String getClaveAdmin(){
        return claveAdmin;
    }
    public String getUsuarioAdmin(){
        return usuarioAdmin;
    }
     

    //- setters//
   
    public void setLimiteTotal(int dato){
        limiteTotal = dato;
    }
    public void setDineroDisponible(int dato){
        dineroDisponible = dato;
    }
    public void setNombreBanco(String dato){
        nombreBanco = dato;
    }
    public void setClaveAdmin(String dato){
        claveAdmin = dato;
    }
    public void setUsuarioAdmin(String dato){
        usuarioAdmin = dato;
    }
   

    public void imprimirDetalle(){
        System.out.println("\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("  Capacidad Total: "+limiteTotal);
        System.out.println("  Dinero Disponible: "+dineroDisponible);
        System.out.println("  cant_10: "+cant_10);
        System.out.println("  cant_20: "+cant_20);
        System.out.println("  cant_50: "+cant_50);
        System.out.println("  cant_100: "+cant_100);
        System.out.println("  NombreBanco: "+nombreBanco);
        System.out.println("  Usuario Admin: "+usuarioAdmin);
        System.out.println("  Clave Admin: "+claveAdmin); 
        System.out.println("  Historial Transacciones: ");
        for (int index = 0; index < listaTransacciones.length; index++) {
            if (listaTransacciones[index] != null) {
                System.out.println("     => "+listaTransacciones[index]);
            }
        }
        System.out.println("-----------------------------------------");

    }

    public CajeroElectronico(int limiteTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
         this.limiteTotal =  limiteTotal;
        this.nombreBanco = nombreBanco; 
        this.usuarioAdmin = usuarioAdmin ;
        this.claveAdmin = claveAdmin;

         this.dineroDisponible = 0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        this.listaTransacciones  = new String [100];

    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        //calcular total ingresado //
        int total = (cant_10*10000)+(cant_20*20000)+(cant_50*50000)+(cant_100*100000);
        //validar que mo exceda el limite //
        if ( total>0  && total <= limiteTotal) {
            dineroDisponible = total;
            this.cant_10 = cant_10;
              this.cant_20 = cant_20;
                this.cant_50 = cant_50;
                  this.cant_100 = cant_100;

                  System.out.println("\n\n");
                  System.out.println("----- CAJERO ABASTECIDO ------");
                  registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
                  return true;
        }else{
            System.out.println("\n\n");
             System.out.println("----- ERROR EN RECARGA ------");
             registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "NOT");
             return false;
        }
       
       
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

        int indice = -1;
        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] == null) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            listaTransacciones[indice] = texto;
        }else{
            for (int i = 0; i < listaTransacciones.length-1; i++) {
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            listaTransacciones[listaTransacciones.length-1] = texto;
        }
    }

    public void verHistorialCajero(String user,String pass){
        if (user.equals(usuarioAdmin) && pass.equals(claveAdmin) ) {

            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0 , "OK");
            
            System.out.println("\n\n");
            System.out.println("+-------------------------------------+");
			System.out.println("+          HISTORIAL CAJERO           +");
			System.out.println("+-------------------------------------+");
        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] != null) {
                 System.out.println((i+1)+" => "+listaTransacciones[i]);
            }
           
        }
            
        }else{
            System.out.println("\n\n");
            System.out.println("+-------------------------+");
            System.out.println("|CLAVE O USUARIO INCORRECTO|");
            System.out.println("+-------------------------+");
             registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0 , "ERROR PASSWORD");
        }
          
    }

    public void consignarDineroaTarjeta(TarjetaDebito tarjeta, int cant_10, int cant_20, int cant_50, int cant_100, String clave ){
          int monto = (cant_10*10000)+(cant_20*20000)+(cant_50*50000)+(cant_100*100000);
        //validar la clave//
        if (tarjeta.validarClave(clave)) {
             // validar estado de la tarjeta//
            if (tarjeta.validarEstadoActiva()) {
                 // monto mayor a 0//
                    if (monto > 0) {
                        // validar que el dinero ingresado no se supere el limite del cajero//
                        if ((dineroDisponible + monto) <= limiteTotal) {
                            tarjeta.aumentarSaldo(monto, clave);

                            //aumentar saldo de la tarjeta//
                            dineroDisponible += monto;

                            // aumentar saldo del cajero y cant billetes//
                            this.cant_10 = cant_10;
                            this.cant_20 = cant_20;
                            this.cant_50 = cant_50;
                           this.cant_100 = cant_100;

                             System.out.println("+--------------------------------+");
                            System.out.println("|     CONSIGNACION EXITOSA|       ");
                             System.out.println("+--------------------------------+");
                            registrarTransaccion("CONSIGNACION", tarjeta.getNumero_Tarjeta() ,monto, "OK");
                        }else{
                            System.out.println("+--------------------------------+");
                            System.out.println("|ERROR MONTO SUPERIOR-CONSIGNAR DINERO|");
                            System.out.println("+--------------------------------+");
                            registrarTransaccion("CONSIGNACION", tarjeta.getNumero_Tarjeta() ,monto, "ERROR MONTO");
                    }
                        }else{
                            System.out.println("+--------------------------------+");
                             System.out.println("|ERROR MONTO INFERIOR-CONSIGNAR DINERO|");
                            System.out.println("+--------------------------------+");
                             registrarTransaccion("CONSIGNACION", tarjeta.getNumero_Tarjeta() ,monto, "ERROR MONTO");
                        }
                    }else{
                System.out.println("+--------------------------------+");
                System.out.println("|ERROR ESTADO TARJETA-CONSIGNAR DINERO|");
                System.out.println("+--------------------------------+");
                 registrarTransaccion("CONSIGNACION", tarjeta.getNumero_Tarjeta() ,monto, "ERROR ESTADO");
                    }
            }else{
                 System.out.println("+--------------------------------+");
                System.out.println("|ERROR CONTRASEÑA-CONSIGNAR DINERO|");
               System.out.println("+--------------------------------+");
               registrarTransaccion("CONSIGNACION", tarjeta.getNumero_Tarjeta() ,monto, "ERROR PASSWORD");
            }
        }
       
       
        

        
        
       
       
    }

     


    
