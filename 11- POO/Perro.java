public class Perro {

    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;

    public Perro( String nombre,String propietario, int edad,String raza,double peso,int energia){
      this.nombre = nombre;
      this.propietario = propietario;
       this.edad = edad;
       this.raza = raza;
       this.peso = peso;
       this.energia = energia;  
    }

    public void imprimirDetalle(){
        System.out.println("+-----------------------------------+");
         System.out.println("| nombre: "+nombre);
         System.out.println("| propietario: "+propietario);
         System.out.println("| Edad: "+edad);
         System.out.println("| raza: "+raza);
         System.out.println("| peso: "+peso);
         System.out.println("| energia: "+energia);
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

    public void comer(int gramos){
        peso = peso + ((double)gramos/1000);

        energia = energia + (gramos/100);
    }
}
