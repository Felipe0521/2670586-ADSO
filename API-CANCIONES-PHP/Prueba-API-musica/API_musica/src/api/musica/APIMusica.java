/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.musica;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;

/**
 *
 * @author felip
 */
public class APIMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
          
        
      ConsumoAPI consumo = new ConsumoAPI();
      
       //endpoint obtener
        String respuesta1 = consumo.consumoGET("http://localhost/02-APImusica/API/Obtener_cancion.php");
        System.out.println("Respuesta obtener:"+respuesta1);
        
         String respuesta2 = consumo.consumoGET("http://localhost/02-APImusica/API/Obtener_categoria.php");
         System.out.println("Respuesta obtener:"+respuesta2);
        /*
        // Endpoint insertar cancion
        /*
        Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("codigo_cancion", "991212");
        datosInsertar.put("nombre", "Es por ti");
        datosInsertar.put("compositor", "juanes");
        datosInsertar.put("estreno", "991212");
        datosInsertar.put("genero", "01");
      
        String respuesta3 = consumo.consumoPOST("http://localhost/02-APImusica/API/Insertar_cancion.php",datosInsertar);
        System.out.println("Respuesta Insertar:"+respuesta3);
        
        
         Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("codigo_genero", "04");
        datosInsertar.put("nombre_genero", "Baladas romanticas");
        String respuesta3 = consumo.consumoPOST("http://localhost/02-APImusica/API/Insertar_categoria.php",datosInsertar);
        System.out.println("Respuesta Insertar:"+respuesta3);
        
        //endpoint actualizar
        /*
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("codigo_cancion", "991212");
        datosActualizar.put("nombre", "Ride");
        datosActualizar.put("compositor", "Twenty one pilots");
        datosActualizar.put("estreno", "991212");
        datosActualizar.put("genero", "02");
         String respuesta4 = consumo.consumoPOST("http://localhost/02-APImusica/API/Actualizar_cancion.php", datosActualizar);
         System.out.println("Respuesta Actualizar:"+respuesta4);
    
          Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("codigo_genero", "03");
        datosActualizar.put("nombre_genero", "Punk");
       
         String respuesta4 = consumo.consumoPOST("http://localhost/02-APImusica/API/Actualizar_categoria.php", datosActualizar);
         System.out.println("Respuesta Actualizar:"+respuesta4);
         
         Map<String, String> datosEliminar = new HashMap<>();
         datosEliminar.put("codigo_cancion", "991212");
         String respuesta5 = consumo.consumoPOST("http://localhost/02-APImusica/API/Eliminar_cancion.php", datosEliminar);
         System.out.println("Respuesta Eliminar:"+respuesta5);
       
          
         Map<String, String> datosEliminar = new HashMap<>();
         datosEliminar.put("codigo_genero", "04");
         String respuesta5 = consumo.consumoPOST("http://localhost/02-APImusica/API/Eliminar_categoria.php", datosEliminar);
         System.out.println("Respuesta Eliminar:"+respuesta5);
       */
    }
    
}
