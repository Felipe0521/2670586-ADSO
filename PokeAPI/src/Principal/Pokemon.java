/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.JButton;

import utils.ConsumoAPI;

/**
 *
 * @author instructor
 */
public class Pokemon extends javax.swing.JPanel {

    /**
     * Creates new form Pokemon
     */
     ConsumoAPI consumo;
    public Pokemon() {
       
        consumo = new ConsumoAPI();
        initComponents();
       
          String respuesta1 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        imprimirPokemones(respuesta1);
        
       
        
    }
   
    
    
   
    public void imprimirPokemones(String respuesta){
       
            System.out.println("Respuesta obtener:"+respuesta);
         
        JsonObject registros = JsonParser.parseString(respuesta).getAsJsonObject();
        
        JsonArray resultados = registros.getAsJsonArray("results");
        System.out.println(resultados);
        
        for (int i = 0; i < resultados.size(); i++) {
             JsonObject temp = resultados.get(i).getAsJsonObject();
            JButton boton = new JButton();
            boton.setText(temp.get("name").getAsString());
            botones_pokemon.add(boton);
        }
        
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalles_pokemon = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botones_pokemon = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(235, 235, 235));

        etq_nombre.setText("Nombre");

        etq_imagen.setText("etq_imagen");

        javax.swing.GroupLayout detalles_pokemonLayout = new javax.swing.GroupLayout(detalles_pokemon);
        detalles_pokemon.setLayout(detalles_pokemonLayout);
        detalles_pokemonLayout.setHorizontalGroup(
            detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_pokemonLayout.createSequentialGroup()
                .addGroup(detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalles_pokemonLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detalles_pokemonLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        detalles_pokemonLayout.setVerticalGroup(
            detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_pokemonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etq_nombre)
                .addGap(18, 18, 18)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 24)); // NOI18N
        jLabel1.setText("Pokemones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botones_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detalles_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botones_pokemon)
                    .addComponent(detalles_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane botones_pokemon;
    private javax.swing.JPanel detalles_pokemon;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
