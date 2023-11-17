

public class Producto {
    private String id;
    private String nombre;
    private int precio;



    public Producto (String id,String nombre,int precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;  
    }



    public String getid (){
        return id;
    }
    public String getNombre (){
        return nombre;
    }
    public int getPrecio (){
        return precio;
    }

    // setters //
    public void setid (String dato){
        id = dato;
    }
    public void setNombre (String dato){
        nombre = dato;
    }
    public void setPrecio (int dato){
        precio = dato;
    }
}
