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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.ConsumoAPI;

/**
 *
 * @author felip
 */
public final class Pokemon extends javax.swing.JFrame {

    /**
     * Creates new form Pokemon
     */
    ConsumoAPI consumo;
    int pagina;
     int[] listaNumeros = {1,2,3,4,5,6,7};
    public Pokemon() {
        this.pagina = 2;
         this.consumo = new ConsumoAPI();
       initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();
        
    }
    
     public void initAlternComponents(){
         setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
          Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digimon.png"));
        icono_registro = icono_registro.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(icono_registro));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digimon.png")));
    }
    
    public void cargarPokemones(){
        int offset = (pagina*20)-20;
       
          int anchoDeseado = 216; // ajusta este valor según tus necesidades
          int altoDeseado = 186;  // ajusta este valor según tus necesidades
          // ajusta este valor según tus necesidades
        
       String endpoint = "https://digi-api.com/api/v1/digimon?page="+offset;
       String data = this.consumo.consumoGET(endpoint);
        System.out.println("dijiapi.Pokemon.cargarPokemones()"+data);
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("content");
        int tamaño = results.size();
        System.out.println(tamaño);
        contenedor_pokemones.removeAll();
       for (int i=0; i<results.size(); i++) {
             JsonObject temp = results.get(i).getAsJsonObject();
             CardPokemon carta = new CardPokemon(temp);
             carta.setPreferredSize(new Dimension(anchoDeseado, altoDeseado));
            
             
             contenedor_pokemones.add(carta);
             revalidate();
             repaint();
        }
        
    }
    
     public void cargarPaginador(){
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        //imprimir primer pagina
         JButton primerpagina = new JButton( "<<" );
         primerpagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = 1;
                   cargarPokemones();
                }
            });
        panelPaginador.add(primerpagina);
        //anteriorpagina
         JButton anteriorpagina = new JButton( "<" );
         anteriorpagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = pagina-1;
                   cargarPokemones();
                }
            });
        panelPaginador.add(anteriorpagina);
        
        //botones de paginas 7
        for (int i = 0; i < listaNumeros.length; i++) {
             JButton paginas = new JButton( Integer.toString(listaNumeros[i]) );
              panelPaginador.add(paginas);
              
               int in = listaNumeros[i];
               paginas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = in;
                  modificarlista();
                   cargarPokemones();
                }
            });
        }
         
        //siguiente pagina
        JButton siguientepagina = new JButton( ">" );
        siguientepagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = pagina+1;
                   cargarPokemones();
                }
            });
        panelPaginador.add(siguientepagina);
        //imprimir ultima pagina
        JButton ultimapagina = new JButton( ">>" );
        ultimapagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   pagina = 65;
                   cargarPokemones();
                }
            });
        panelPaginador.add(ultimapagina);
        
        //cargar los botones 8
        // a cada boton darle un id de pagina 
        // el set text cambiaria 
        
        panelPaginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();
    }
    
    public void modificarlista(){
        int mod = 3;
        for (int i = 0; i < listaNumeros.length; i++) {
            
            listaNumeros[i] = pagina-mod;
            mod--;
        }
        cargarPaginador();
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_imagen = new javax.swing.JLabel();
        contenedor_pokemones = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_imagen.setText("jLabel1");

        contenedor_pokemones.setLayout(new java.awt.GridLayout(2, 3, 2, 1));

        javax.swing.GroupLayout panelPaginadorLayout = new javax.swing.GroupLayout(panelPaginador);
        panelPaginador.setLayout(panelPaginadorLayout);
        panelPaginadorLayout.setHorizontalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelPaginadorLayout.setVerticalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedor_pokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedor_pokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor_pokemones;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
