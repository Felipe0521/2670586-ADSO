

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Presentacion extends JFrame {

      public Presentacion(){
            initComponents();

      }

      public void initComponents(){
            setTitle("presentacion");
            setSize(500, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            

            JPanel contenedor = new JPanel();
            contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));

            JLabel titulo = new JLabel();
            titulo.setText("FORMULARIO");
            titulo.setFont(new Font("Arial", Font.BOLD, 20) );
            titulo.setHorizontalAlignment(JLabel.CENTER);
            titulo.setOpaque(true);
            contenedor.add(titulo);
            JTextField campo_nombre = new JTextField();
            contenedor.add(campo_nombre);

            JButton btn_iniciar = new JButton();
            btn_iniciar.setText("INICIAR");
            contenedor.add(btn_iniciar);

            JLabel respuesta = new JLabel();
            contenedor.add(respuesta); 

            

            add(contenedor);
            setVisible(true);
            revalidate();

            btn_iniciar.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e){
                        String texto = campo_nombre.getText();
                        respuesta.setText(texto);
                        campo_nombre.setText("");
                  }
            });
      }
}
