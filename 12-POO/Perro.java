public class Perro {

    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;
    private String estado;

    public Perro( String nombre,String propietario, int edad,String raza,double peso,int energia, String estado){
      this.nombre = nombre;
      this.propietario = propietario;
       this.edad = edad;
       this.raza = raza;
       this.peso = peso;
       this.energia = energia;  
       this.estado = estado;
    }

    public void imprimirDetalle(){
        System.out.println("+-----------------------------------+");
         System.out.println("| Nombre: "+nombre);
         System.out.println("| Propietario: "+propietario);
         System.out.println("| Edad: "+edad);
         System.out.println("| Raza: "+raza);
         System.out.println("| Peso: "+peso);
         System.out.println("| Energia: "+energia);
         System.out.println("| Estado: "+estado);
       System.out.println("+-----------------------------------+");
    }

    public String getNombre(){
        return nombre;
    }
     public String getpropietario(){
        return propietario;
    }

     public int getedad(){
        return edad;
    }

     public String getraza(){
        return raza;
    }
     public double getpeso(){
        return peso;
    }

     public int getenergia(){
        return energia;
    }

      public String getEstado(){
        return estado;
    }
 // setters//
    public void setNombre(String dato){
        nombre= dato;
    }
     public void setPropietario(String dato){
        propietario= dato;
    }
     public void setEdad(int dato){
        edad= dato;
    }

     public void setRaza(String dato){
        raza = dato;
    }

     public void setPeso(double dato){
        peso = dato;
    }
     public void setEnergia(int dato){
        energia= dato;
    }
     public void setEstado(String dato){
        estado = dato;
    }

    // Comer, caminar, ladrar, morder, dormir, hacerpopis, jugar //
    
    /*estado: el perro puede tener varios estados dependiendo del cambio de atributos o acciones
    , sano, enfermo, cansado, hambiento, somnoliento, estresado  */

    
    public void comer(int gramos){
        peso = peso + ((double)gramos/1000);

        energia = energia + (gramos/100);

        if (energia > 100) {
            estado = "SOMNOLIENTO";
        }if (energia > 50 && energia <100){
            estado = "SANO";
        }


    }

    public void caminar(int metros){
        // peso 1 gramo por
        
        peso = peso -((double)metros/1000);

        energia = energia -(metros/20);

        if (energia < 50) {
            estado = "CANSADO";
        }if (energia < 20) {
            estado = "CANSADO"+" HAMBRIENTO";
        }
    }

    public void ladrar(int segundos ){
        energia = energia-(segundos/50);
        if (segundos > 30) {
            estado = "Estresado"+ ", Furioso";
            
        }
    }

    public void morder(boolean morder, int segundos){
        if (morder == true && segundos > 10) {
            estado = "FURIOSO";
            energia += 30;
        }else{
            estado = "Estresado";
        }
    }

    public void dormir(double horas){
        energia = energia + ((int)horas*10);
        estado = "DURMIENDO";
    }

    public void defecar(int gramos){
        peso = peso - gramos;
    }

    public void jugar(int minutos){
        energia = energia - (minutos /3);

        if (energia < 50) {
            estado = "CANSADO";
        }
    }

    public String getInfoInLine(){
        String texto = nombre+" - "+propietario+" - "+raza+" - "+edad+" anhos - "+peso+" kg - "+energia+" de energia - "+"Estado: "+estado;
        return texto; 
       }
}
