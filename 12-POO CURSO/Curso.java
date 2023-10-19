
public class Curso {
    // atributos//
    int codigo;
    String nombre;
    String area;
    int horas;
    String temas[];

    // constructor //
    public Curso(int codigo, String nombre, String area, int horas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.horas = horas;
        this.temas = new String [15]; 
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
        
        System.out.println("\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("  Codigo : "+codigo);
        System.out.println("  Nombre: "+nombre);
        System.out.println("  Area: "+area);
        System.out.println("  Horas: "+horas); 
        System.out.println("  TEMAS: ");
        for (int index = 0; index < temas.length; index++) {
            if (temas[index] != null) {
                System.out.println("     => "+temas[index]);
            }
        }
        System.out.println("-----------------------------------------");

    }

    // clase editar informacion curso //
    public void editarInformacionCurso(String new_nombre, String new_area, int new_horas){
        nombre = new_nombre;
        area = new_area;
        horas = new_horas;

                     System.out.println("\n\n");
                     System.out.println("+----------------------------+");
                     System.out.println("| CAMBIO REALIZADO CON EXITO |");
                     System.out.println("+----------------------------+");
    }

    // clase agregar un tema //
    public void agregarTema(String nuevo_tema){
        boolean existeTema = false;
        int indice = -1;
        String texto = nuevo_tema;
        for (int i = 0; i < temas.length; i++) {
            if (temas[i] == null) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            temas[indice] = texto;
           
        }else{
                     System.out.println("\n\n");
                     System.out.println("+-------------------------------+");
                     System.out.println("| El TEMA INGRESADO ES REPETIDO |");
                     System.out.println("+-------------------------------+");
        }

    }

}
