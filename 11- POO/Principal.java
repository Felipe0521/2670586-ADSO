/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        
    /* Clases: definen nuevos tipos de datos,
     una clase es una plantilla que se usa
      para crear Objetos/Variables.
       
      Atributos: los atributos son variables y son propios
      de la clase obtenida, ai coomo una caracteristica, y 
      son variables globales.

      Metodos: Acciones que pueden realizar un objeto 
      perteneciante a la clase, Son funciones.
      */

      Perro perro_01 = new Perro("Max", "valeria", 6, "Chihuaha", 30.5, 80);

       Perro perro_02 = new Perro("Mailo", "felipe", 18, "pug", 7, 20);

      
       perro_01.comer(800);
      perro_01.imprimirDetalle();
        

        //Podemos cogerle el bolso y hacerle la empanada//
        //distraerlo y esconderle la botella //
        // la tira del bolso amarrarla a la silla//
        ///
    }
}