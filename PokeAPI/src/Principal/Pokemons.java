/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;
/**
 *
 * @author instructor
 */
public class Pokemons extends javax.swing.JFrame {

    /**
     * Creates new form Pokemons
     */
    ConsumoAPI consumo;
    public Pokemons() {
          initComponents();
         initAlternComponents();
       
        consumo = new ConsumoAPI();
          String respuesta1 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        imprimirPokemones(respuesta1);
       
       
    }
    
    public void initAlternComponents(){
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")));
        
       
         etq_atras.setBackground(Color.WHITE);
        Image icono_listar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        icono_listar = icono_listar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        etq_atras.setIcon(new ImageIcon(icono_listar));
        
        etq_siguiente.setBackground(Color.WHITE);
        Image icono_listar1 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        icono_listar1 = icono_listar1.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        etq_siguiente.setIcon(new ImageIcon(icono_listar1));
        
       
        revalidate();
    }
    
    public void imprimirPokemones(String respuesta){
       
            System.out.println("Respuesta obtener:"+respuesta);
         
        JsonObject registros = JsonParser.parseString(respuesta).getAsJsonObject();
        
        JsonArray resultados = registros.getAsJsonArray("results");
        System.out.println(resultados);
        
        for (int i = 0; i < resultados.size(); i++) {
            JsonObject temp = resultados.get(i).getAsJsonObject();
            JButton boton = new JButton();
            boton.setBackground(Color.yellow);
            boton.setForeground(Color.BLACK);
            boton.setText(temp.get("name").getAsString());
            
          boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = temp.get("url").getAsString();
                    String nombre = temp.get("name").getAsString();
                    JButton sourceButton = (JButton) e.getSource();
                    //System.out.println(sourceButton.getText() + " fue presionado.");
                    mostrarDetalles(nombre, url);
                }
            });
            
            System.out.println("Respuesta obtener:"+temp.get("name").getAsString());
            botones_pokemon.add(boton);
        }
        
       revalidate();
      
    }
    
    public void mostrarDetalles(String nombre, String url){
        etq_nombre.setText(nombre);
        String respuesta2 = consumo.consumoGET(url);
        
         JsonObject registros = JsonParser.parseString(respuesta2).getAsJsonObject();
         JsonObject temp = registros.get("sprites").getAsJsonObject();
          JsonObject temp1 = temp.get("other").getAsJsonObject();
          JsonObject temp2 = temp1.get("dream_world").getAsJsonObject();
         String patapa = temp2.get("front_default").getAsString();
         System.out.println(patapa);
          Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource(patapa));
        icono_registro = icono_registro.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(icono_registro));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botones = new javax.swing.JScrollPane();
        botones_pokemon = new javax.swing.JPanel();
        detalles_pokemon = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        etq_atras = new javax.swing.JLabel();
        etq_siguiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        jLabel1.setText("Pokemones");

        botones_pokemon.setLayout(new java.awt.GridLayout(0, 1));
        botones.setViewportView(botones_pokemon);

        detalles_pokemon.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        etq_nombre.setText("Nombre");

        etq_imagen.setText("etq_imagen");

        javax.swing.GroupLayout detalles_pokemonLayout = new javax.swing.GroupLayout(detalles_pokemon);
        detalles_pokemon.setLayout(detalles_pokemonLayout);
        detalles_pokemonLayout.setHorizontalGroup(
            detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(etq_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        detalles_pokemonLayout.setVerticalGroup(
            detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_pokemonLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(etq_nombre)
                .addGroup(detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalles_pokemonLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detalles_pokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detalles_pokemonLayout.createSequentialGroup()
                                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemonLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(etq_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151))))
                    .addGroup(detalles_pokemonLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(etq_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(detalles_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detalles_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokemons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane botones;
    private javax.swing.JPanel botones_pokemon;
    private javax.swing.JPanel detalles_pokemon;
    private javax.swing.JLabel etq_atras;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_siguiente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
