/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;

/**
 *
 * @author felip
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu ventana = new Menu();
        //instancia para consumos
        /*
      ConsumoAPI consumo = new ConsumoAPI();
      
       //endpoint obtener
       String respuesta1 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta obtener:"+respuesta1);
        
        // Endpoint insertar
        Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula", "991212");
        datosInsertar.put("nombres", "991212");
        datosInsertar.put("apellidos", "991212");
        datosInsertar.put("telefono", "991212");
        datosInsertar.put("direccion", "991212");
        datosInsertar.put("email", "991212");
        String respuesta2 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php",datosInsertar);
        System.out.println("Respuesta Insertar:"+respuesta2);
        
        //endpoint actualizar
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", "991212");
        datosActualizar.put("nombres", "Khabib");
        datosActualizar.put("apellidos", "kumalala");
        datosActualizar.put("telefono", "912");
        datosActualizar.put("direccion", "cll5");
        datosActualizar.put("email", "99@2");
         String respuesta3 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
         System.out.println("Respuesta Actualizar:"+respuesta3);
    
        // Map<String, String> datosEliminar = new HashMap<>();
        // datosEliminar.put("cedula", "991212");
       // String respuesta4 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
       // System.out.println("Respuesta Eliminar:"+respuesta4);
       */
    }
    
}
