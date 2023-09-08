public class TarjetaDebito {
    String nombre_Propietario;
    String numero_Tarjeta;
    String nombre_Banco;
    int dineroEnTarjeta;
    int limite_Permitido;
    String listaTransacciones[];
    String clave;
    String estado;

    public TarjetaDebito(String nombre_Propietario, String numero_Tarjeta, String nombre_Banco, int dineroEnTarjeta, int limite_Permitido, String clave, String estado,  String listaTransacciones[]){
        this.nombre_Propietario = nombre_Propietario;
        this.numero_Tarjeta = numero_Tarjeta;
        this.nombre_Banco = nombre_Banco;
        this.dineroEnTarjeta = dineroEnTarjeta;
        this.limite_Permitido = limite_Permitido;
        this.clave = clave;
        this.estado = estado;
        this.listaTransacciones = new String[8];
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
   

    public void imprimirDetalle(){
        System.out.println("\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("  Capacidad Total: "+limite_Permitido);
        System.out.println("  Dinero Disponible: "+dineroEnTarjeta);
        System.out.println("  NombreBanco: "+nombre_Banco);
        System.out.println("  Numero Tarjeta: "+numero_Tarjeta);
        System.out.println("  Nombre Propietario: "+nombre_Propietario); 
        System.out.println("  Historial Transacciones: ");
        for (int index = 0; index < listaTransacciones.length; index++) {
            if (listaTransacciones[index] != null) {
                System.out.println("     => "+listaTransacciones[index]);
            }
        }
        System.out.println("-----------------------------------------");

    }


    public void disminuirSaldo(String nombre_Propietario, String numero_Tarjeta, String nombre_Banco, int dineroEnTarjeta, int limite_Permitido, String listaTransacciones[] ){

        
    }

     public void aumentarSaldo(String nombre_Propietario, String numero_Tarjeta, String nombre_Banco, int dineroEnTarjeta, int limite_Permitido, String listaTransacciones[] ){

        
    }

    public String getInfoSaldo(){
        String texto = "COP "+ dineroEnTarjeta;
        return texto; 
       }

}

    


