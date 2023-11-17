

public class Usuario {

       private String cedula;
       private String nombres;
       private String direccion;
       private String rol;

        public Usuario(String cedula, String nombres, String direccion, String rol) {
            this.cedula = cedula;
            this.nombres = nombres;
            this.direccion = direccion;
            this.rol = rol;
        }

        public String getCedula (){
            return cedula;
        }
        public String getNombres (){
        return nombres;
        }
        public String getDireccion (){
        return direccion;
        }
        public String getRol(){
        return rol;
        }

        // setters //

         public void setCedula (String dato){
            cedula = dato;
        }
        public void setNombres (String dato){
            nombres = dato;
        }
        public void setDireccion (String dato){
            direccion = dato;
        }
        public void setRol(String dato){
            rol = dato;
        }
}
