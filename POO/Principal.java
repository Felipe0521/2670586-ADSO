
public class Principal {
    public static void main(String[] args) {

   Persona usuario = new Persona(108800, "Felipe", "Cardona", 17, 170, 60);
   Persona usuario02 = new Persona(1112149370, "Pedro", "Sanchez", 35, 175, 64);
        usuario.imprimirEstado();
        usuario02.imprimirEstado();

        usuario.actividadFisica(80);
         usuario02.actividadFisica(30);

         usuario.imprimirEstado();
        usuario02.imprimirEstado();

    }
}
    