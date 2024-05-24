/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import utils.ConsumoAPI;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author instructor
 */
public class Pokemons extends javax.swing.JFrame {

    /**
     * Creates new form Pokemons
     */
    DefaultTableModel modelo;
    ConsumoAPI consumo;
    public Pokemons() {
          initComponents();
         initAlternComponents();
         modelo = (DefaultTableModel)tablaDatos5.getModel();
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
        
       
         etq_atras5.setBackground(Color.WHITE);
        Image icono_listar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        icono_listar = icono_listar.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        etq_atras5.setIcon(new ImageIcon(icono_listar));
        
        etq_siguiente5.setBackground(Color.WHITE);
        Image icono_listar1 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        icono_listar1 = icono_listar1.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        etq_siguiente5.setIcon(new ImageIcon(icono_listar1));
        
       
        revalidate();
    }
    
    public void imprimirPokemones(String respuesta){
       
            
         
        JsonObject registros = JsonParser.parseString(respuesta).getAsJsonObject();
        
        JsonArray resultados = registros.getAsJsonArray("results");
        System.out.println(resultados);
        
        for (int i = 0; i < resultados.size(); i++) {
            JsonObject temp = resultados.get(i).getAsJsonObject();
            JButton boton = new JButton();
             boton.setFont(new Font("Arial", Font.BOLD, 18));
        boton.setForeground(Color.WHITE);
        boton.setBackground(Color.LIGHT_GRAY);
        boton.setFocusPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(false);
        boton.setPreferredSize(new Dimension(150, 50));
        boton.setBounds(100, 50, 200, 60);
            boton.setText(temp.get("name").getAsString());
            
          boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = temp.get("url").getAsString();
                    String nombre = temp.get("name").getAsString();
                    
                    //System.out.println(sourceButton.getText() + " fue presionado.");
                    mostrarDetalles(nombre, url);
                }
            });
            
          
            botones_pokemon.add(boton);
        }
        
       revalidate();
      
    }
    
     public void mostrarDetalles(String nombre, String url) {
        etq_nombre5.setText(nombre);
        String respuesta2 = consumo.consumoGET(url);
        
        JsonObject registros = JsonParser.parseString(respuesta2).getAsJsonObject();
        JsonObject temp = registros.get("sprites").getAsJsonObject();
        JsonObject temp1 = temp.get("other").getAsJsonObject();
        JsonObject temp2 = temp1.get("home").getAsJsonObject();
        String patapa = temp2.get("front_default").getAsString();
        
        JsonArray habilidades = registros.get("abilities").getAsJsonArray();
          modelo.setRowCount(0);
          
           
      
        
        for (int i = 0; i < habilidades.size(); i++) {
            JsonObject tempo = habilidades.get(i).getAsJsonObject();
            JsonObject tempo1 = tempo.get("ability").getAsJsonObject();
             String habilidad = tempo1.get("name").getAsString();
            String hurl = tempo1.get("url").getAsString();
            
      
 
             Object[] data = {i+1,habilidad,hurl};
              modelo.addRow(data);
        }
        cargarImagenDesdeURL(patapa);
    }

    private void cargarImagenDesdeURL(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (InputStream inputStream = connection.getInputStream()) {
                    BufferedImage image = ImageIO.read(inputStream);

                    // Asignar la imagen al JLabel
                     Image scaledImage = image.getScaledInstance(etq_imagen2.getWidth(), etq_imagen2.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon imageIcon = new ImageIcon(scaledImage);
                    etq_imagen2.setIcon(imageIcon);
                }
            } else {
                System.out.println("Error: No se pudo obtener la imagen. Código de respuesta: " + connection.getResponseCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        botones = new javax.swing.JScrollPane();
        botones_pokemon = new javax.swing.JPanel();
        detalles_pokemon5 = new javax.swing.JPanel();
        etq_nombre5 = new javax.swing.JLabel();
        etq_imagen2 = new javax.swing.JLabel();
        etq_atras5 = new javax.swing.JLabel();
        etq_siguiente5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaDatos5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        jLabel1.setText("Pokemones");

        botones.setMaximumSize(new java.awt.Dimension(432, 218));

        botones_pokemon.setBackground(new java.awt.Color(153, 153, 255));
        botones_pokemon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botones_pokemon.setMaximumSize(new java.awt.Dimension(423, 218));
        botones_pokemon.setLayout(new java.awt.GridLayout(0, 1));
        botones.setViewportView(botones_pokemon);

        detalles_pokemon5.setBackground(new java.awt.Color(255, 255, 255));
        detalles_pokemon5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etq_nombre5.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        etq_nombre5.setText("Nombre");

        etq_imagen2.setBackground(new java.awt.Color(255, 255, 153));
        etq_imagen2.setText("etq_imagen");

        tablaDatos5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "url"
            }
        ));
        jScrollPane6.setViewportView(tablaDatos5);

        javax.swing.GroupLayout detalles_pokemon5Layout = new javax.swing.GroupLayout(detalles_pokemon5);
        detalles_pokemon5.setLayout(detalles_pokemon5Layout);
        detalles_pokemon5Layout.setHorizontalGroup(
            detalles_pokemon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_pokemon5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detalles_pokemon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalles_pokemon5Layout.createSequentialGroup()
                        .addComponent(etq_atras5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etq_siguiente5, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(detalles_pokemon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                                .addComponent(etq_nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))))))
        );
        detalles_pokemon5Layout.setVerticalGroup(
            detalles_pokemon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_pokemon5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(etq_nombre5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detalles_pokemon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                        .addComponent(etq_atras5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                        .addComponent(etq_siguiente5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detalles_pokemon5Layout.createSequentialGroup()
                        .addComponent(etq_imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(detalles_pokemon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(detalles_pokemon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
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
    private javax.swing.JPanel detalles_pokemon1;
    private javax.swing.JPanel detalles_pokemon2;
    private javax.swing.JPanel detalles_pokemon3;
    private javax.swing.JPanel detalles_pokemon4;
    private javax.swing.JPanel detalles_pokemon5;
    private javax.swing.JLabel etq_atras;
    private javax.swing.JLabel etq_atras1;
    private javax.swing.JLabel etq_atras2;
    private javax.swing.JLabel etq_atras3;
    private javax.swing.JLabel etq_atras4;
    private javax.swing.JLabel etq_atras5;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_imagen1;
    private javax.swing.JLabel etq_imagen2;
    private javax.swing.JLabel etq_imagen3;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_nombre1;
    private javax.swing.JLabel etq_nombre2;
    private javax.swing.JLabel etq_nombre3;
    private javax.swing.JLabel etq_nombre4;
    private javax.swing.JLabel etq_nombre5;
    private javax.swing.JLabel etq_siguiente;
    private javax.swing.JLabel etq_siguiente1;
    private javax.swing.JLabel etq_siguiente2;
    private javax.swing.JLabel etq_siguiente3;
    private javax.swing.JLabel etq_siguiente4;
    private javax.swing.JLabel etq_siguiente5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tablaDatos1;
    private javax.swing.JTable tablaDatos2;
    private javax.swing.JTable tablaDatos3;
    private javax.swing.JTable tablaDatos4;
    private javax.swing.JTable tablaDatos5;
    // End of variables declaration//GEN-END:variables
}
