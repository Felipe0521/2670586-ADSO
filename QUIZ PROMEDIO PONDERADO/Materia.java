
public class Materia {
    private String nombre;
    private int creditos;
    private double nota;

    public Materia(String nombre, int creditos, double nota) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }

    public double getNotaPonderada() {
        return creditos * nota;
    }

    public String toString() {
        return nombre +" -> "+"Creditos "+ creditos+" -> "+ "Nota "+ nota;
    }

    
    public String getNombre (){
        return nombre;
    }
    public int getCreditos (){
        return creditos;
    }
    public double getNota (){
        return nota;
    }

    // setters //
    public void setCredito (int dato){
        creditos = dato;
    }
    public void setNombre (String dato){
        nombre = dato;
    }
    public void setNota (double dato){
        nota = dato;
    }
}
