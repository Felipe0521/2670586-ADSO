
public class Curso {
    // atributos//
    int codigo;
    String nombre;
    String area;
    int horas;
    String temas[];

    // constructor //
    public Curso(int codigo, String nombre, String area, int horas, String temas[]){
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.horas = horas;
        this.temas = temas; 
    }
    
    // getters//
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getArea(){
        return area;
    }
    public int getHoras(){
        return horas;
    }
    public String[] getTemas(){
        return temas;
    }
    // setters //
    public void setCodigo(int dato){
        codigo = dato;
    }
    public void setNombre(String dato){
        nombre = dato;
    }
    public void setArea(String dato){
        area = dato;
    }
    public void setHoras(int dato){
        horas = dato;
    }
    public void setTemas(String[] datos){
        temas = datos;
    }

    // clase imprimir detalle //
    public void imprimirDetalleCurso(){
        
    }

    // clase editar informacion curso //
    public void editarInformacionCurso(){

    }

    // clase agregar un tema //
    public String agregarTema(String tema){

        return tema;
    }

}
