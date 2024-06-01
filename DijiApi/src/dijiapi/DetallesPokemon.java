/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dijiapi;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

/**
 *
 * @author felip
 */
public class DetallesPokemon extends javax.swing.JFrame {

    /**
     * Creates new form DetallesPokemon
     */
    JsonObject pokemon;
    public DetallesPokemon(JsonObject datos) {
        this.pokemon = datos;
        initComponents();
        initAltherComponents();
        cargarDetalles();
    }
    
    public void initAltherComponents(){
         setTitle("Detalles");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocation(843, 5);
        setVisible(true);
        setResizable(false);
         tabla_pokemon.setIntercellSpacing(new Dimension(10, 0));
       
        
         
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digimon.png")));
    
    }
    
    public void cargarDetalles(){
         etq_nombre.setText( this.pokemon.get("name").getAsString() );
          JsonArray results = this.pokemon.getAsJsonArray("images");
          
          JsonArray niveles = this.pokemon.getAsJsonArray("levels");
          JsonArray tipos = this.pokemon.getAsJsonArray("types");
          JsonArray atributos = this.pokemon.getAsJsonArray("attributes");
          
           DefaultTableModel modelo = (DefaultTableModel) tabla_pokemon.getModel();
        
        for (int i=0; i<niveles.size(); i++) {
            JsonObject temp = niveles.get(i).getAsJsonObject();
            Object[] fila = new Object[]{temp.get("level").getAsString()};
            modelo.addRow(fila);
        }
        
         DefaultTableModel modelo2 = (DefaultTableModel) tabla_pokemon1.getModel();
        
        for (int i=0; i<tipos.size(); i++) {
            JsonObject temp = tipos.get(i).getAsJsonObject();
            Object[] fila = new Object[]{temp.get("type").getAsString()};
            modelo2.addRow(fila);
        }
        
         DefaultTableModel modelo3 = (DefaultTableModel) tabla_pokemon2.getModel();
        
        for (int i=0; i<atributos.size(); i++) {
            JsonObject temp = atributos.get(i).getAsJsonObject();
            Object[] fila = new Object[]{temp.get("attribute").getAsString()};
            modelo3.addRow(fila);
        }
        
          int anchoDeseado = 60; // ajusta este valor según tus necesidades
          int altoDeseado = 90;
        JsonArray campos_batalla = this.pokemon.getAsJsonArray("fields");
        for (int i=0; i<campos_batalla.size(); i++) {
           
            JsonObject temp = campos_batalla.get(i).getAsJsonObject();
            JLabel imgen = new JLabel(temp.get("field").getAsString());
           
            String url = temp.get("image").getAsString();
          
                try {



                URL imgUrl = new URL(url);
                Image imagen = getToolkit().createImage(imgUrl);
                imagen = imagen.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
                imgen.setIcon(new ImageIcon(imagen));
                contenedor_campos.add(imgen);
            } catch (MalformedURLException ex) {
                Logger.getLogger(CardPokemon.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
        }
          
          
          for (int i=0; i<results.size(); i++) {
             JsonObject temp = results.get(i).getAsJsonObject();
             String url = temp.get("href").getAsString();
              cargarImagenPokemon(url);
              
        }
          
    }
    public void cargarImagenPokemon(String url){
        try {
            
           
          
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(230, 211, Image.SCALE_SMOOTH);
            imagen_pokemon.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(CardPokemon.class.getName()).log(Level.SEVERE, null, ex);
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

        contenedorPrincipal = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        imagen_pokemon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pokemon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contenedor_campos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_pokemon1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_pokemon2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("NOMBRE");

        imagen_pokemon.setText("jLabel1");

        tabla_pokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIVEL"
            }
        ));
        jScrollPane1.setViewportView(tabla_pokemon);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("CAMPOS DE BATALLA");

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        contenedor_campos.setLayout(new java.awt.GridLayout());
        jScrollPane3.setViewportView(contenedor_campos);

        tabla_pokemon1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ATRIBUTOS"
            }
        ));
        jScrollPane2.setViewportView(tabla_pokemon1);

        tabla_pokemon2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPOS"
            }
        ));
        jScrollPane4.setViewportView(tabla_pokemon2);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(imagen_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedor_campos;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel imagen_pokemon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_pokemon;
    private javax.swing.JTable tabla_pokemon1;
    private javax.swing.JTable tabla_pokemon2;
    // End of variables declaration//GEN-END:variables
}
