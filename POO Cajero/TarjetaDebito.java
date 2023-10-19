import java.util.Date;

public class TarjetaDebito {
   private String nombre_Propietario;
   private String numero_Tarjeta;
   private String nombre_Banco;
   private int dineroEnTarjeta;
   private int limite_Permitido;
   private String ultimasTransacciones[];
   private String clave;
   private String estado;

    public TarjetaDebito(String nombre_Propietario, String numero_Tarjeta, String nombre_Banco, int dineroEnTarjeta, int limite_Permitido, String clave, String estado){
        this.nombre_Propietario = nombre_Propietario;
        this.numero_Tarjeta = numero_Tarjeta;
        this.nombre_Banco = nombre_Banco;
        this.dineroEnTarjeta = dineroEnTarjeta;
        this.limite_Permitido = limite_Permitido;
        this.clave = clave;
        this.estado = estado;
        this.ultimasTransacciones = new String[10];

    }


    public void registrarTransaccion(String tipo, int monto, String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+" - "+tipo+" - "+monto+" - "+estado;

        int indice = -1;
        for (int i = 0; i < ultimasTransacciones.length; i++) {
            if (ultimasTransacciones[i] == null) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            ultimasTransacciones[indice] = texto;
        }else{
            for (int i = 0; i < ultimasTransacciones.length-1; i++) {
                ultimasTransacciones[i] = ultimasTransacciones[i+1];
            }
            ultimasTransacciones[ultimasTransacciones.length-1] = texto;
        }
    }

    public void verHistorial(String pass){
        if ( pass.equals(clave) ) {

            registrarTransaccion("HISTORIAL", 0,  "OK");
            
            System.out.println("\n\n");
            System.out.println("+-------------------------------------+");
			System.out.println("+          HISTORIAL TARJETA           +");
			System.out.println("+-------------------------------------+");
        for (int i = 0; i < ultimasTransacciones.length; i++) {
            if (ultimasTransacciones[i] != null) {
                 System.out.println((i+1)+" => "+ultimasTransacciones[i]);
            }
           
        }
            
        }else{
            System.out.println("\n\n");
            System.out.println("+--------------------------------+");
            System.out.println("|ACCESO DENEGADO DESDE LA TARJETA|");
            System.out.println("+--------------------------------+");
             registrarTransaccion("HISTORIAL", 0 , "ERROR");
        }
          
    }

   

    public void imprimirDetalle(){
        System.out.println("\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("  Capacidad Total: "+limite_Permitido);
        System.out.println("  Dinero Disponible: "+dineroEnTarjeta);
        System.out.println("  NombreBanco: "+nombre_Banco);
        System.out.println("  Numero Tarjeta: "+numero_Tarjeta);
        System.out.println("  Nombre Propietario: "+nombre_Propietario); 
        System.out.println("  Historial Transacciones: ");
        for (int index = 0; index < ultimasTransacciones.length; index++) {
            if (ultimasTransacciones[index] != null) {
                System.out.println("     => "+ultimasTransacciones[index]);
            }
        }
        System.out.println("-----------------------------------------");

    }


    public boolean disminuirSaldo(int monto, String pass ){

        if ( pass.equals(clave) ){
            if (monto > 0 && monto <= limite_Permitido) {
                if (monto <= dineroEnTarjeta) {
                    dineroEnTarjeta -= monto;
                System.out.println("+--------------------------------+");
                System.out.println("|TRANSACCION EXITOSA EN TARJETA   |");
                System.out.println("+--------------------------------+");
                return true;
                }else{
                    System.out.println("\n\n");
                    System.out.println("+-------------------------------------------------------------+");
                    System.out.println("|    ERROR EN MONTO INGRESADO - SUPERA CANTIDAD DISPONIBLE    |");
                    System.out.println("+-------------------------------------------------------------+");
                    registrarTransaccion("AUMENTARSALDO", monto , "ERROR");
                    return false;
                }
                
            }else{
                 System.out.println("\n\n");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|    ERROR EN MONTO INGRESADO - FUERA DE RANGO    |");
            System.out.println("+-------------------------------------------------+");
             registrarTransaccion("AUMENTARSALDO", monto , "ERROR");
             return false;
            }

         }else{
            System.out.println("\n\n");
            System.out.println("+--------------------------------+");
            System.out.println("|ACCESO DENEGADO DESDE LA TARJETA|");
            System.out.println("+--------------------------------+");
             registrarTransaccion("AUMENTARSALDO", monto , "ERROR");
             return false;
        }
    }

     public boolean aumentarSaldo(int monto, String pass){
         if ( pass.equals(clave) ){
            if (monto > 0) {
                dineroEnTarjeta += monto;
                System.out.println("+--------------------------------+");
                System.out.println("|TRANSACCION EXITOSA EN TARJETA   |");
                System.out.println("+--------------------------------+");
                return true;
            }else{
                 System.out.println("\n\n");
            System.out.println("+--------------------------------+");
            System.out.println("|    ERROR EN MONTO INGRESADO    |");
            System.out.println("+--------------------------------+");
             registrarTransaccion("AUMENTARSALDO", monto , "ERROR");
             return false;
            }

         }else{
            System.out.println("\n\n");
            System.out.println("+--------------------------------+");
            System.out.println("|ACCESO DENEGADO DESDE LA TARJETA|");
            System.out.println("+--------------------------------+");
             registrarTransaccion("AUMENTARSALDO", monto , "ERROR");
             return false;
        }
        
        
        
    }

    public int getSaldo(String pass){
        
        if ( pass.equals(clave)){
             registrarTransaccion("CONSULTARSALDO", 0 , "OK");
            return dineroEnTarjeta;
        }else{
            registrarTransaccion("CONSULTARSALDO", 0 , "ERROR");
            return -1;
        }
        
       }


    public boolean validarClave(String pass){
        if (pass.equals(clave)) {
            registrarTransaccion("VALIDARCLAVEINTERNA" ,0, "OK");
            return true;
            
        }else{
            registrarTransaccion("VALIDARCLAVEINTERNA",0, "ERROR");
            return false;
        }
    }

    public boolean validarEstadoActiva(){
        if (estado.equals("ACTIVA")) {
            registrarTransaccion("VALIDARCLAVEINTERNA" ,0, "OK");
            return true;
            
        }else{
            registrarTransaccion("VALIDARCLAVEINTERNA",0, "ERROR");
            return false;
        }
    }



        // - getters
    public String getNumero_Tarjeta(){
        return numero_Tarjeta;
    }
    public String getNombre(){
        return nombre_Propietario;
    }
    public int getDineroEnTarjeta(){
        return dineroEnTarjeta;
    }
    public int getLimite_Permitido(){
        return limite_Permitido;
    }
    public String getClave(){
        return clave;
    }
    public String getEstado(){
        return estado;
    }
     

    //- setters//
    public void setNumero_Tarjet(String dato){
        numero_Tarjeta = dato;
    }
    public void setNombre(String dato){
        nombre_Propietario = dato;
    }
    public void setDineroEnTarjeta(int dato){
        dineroEnTarjeta = dato;
    }
    public void setLimite_Permitido(int dato){
        limite_Permitido = dato;
    }
    public void setClave(String dato){
        clave = dato;
    }
    public void setEstado(String dato){
        estado = dato;
    }
   
}




    


