import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

   private JPanel contenedor;
   private GridLayout capa;
   private JLabel etiqueta_usuario;
   private JLabel etiqueta_contraseña;
   private JTextField campo_usuario;
   private JPasswordField campo_contraseña;
   private JButton btn_ingresar;
   private JButton btn_cancelar;

    public Login(){
        initComponents();
    }

    public void initComponents(){
        setVisible(true);
        setTitle("NUEVA");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor = new JPanel();
        capa = new GridLayout(3,2);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10,10,10,10));

        etiqueta_usuario = new JLabel("USUARIO: ");
        etiqueta_contraseña = new JLabel("CONTRASEÑA: ");
        campo_usuario = new JTextField();
        campo_contraseña = new JPasswordField();
        btn_ingresar = new JButton("INGRESAR");
        btn_cancelar = new JButton("CANCELAR");

        contenedor.add(etiqueta_usuario);
        contenedor.add(campo_usuario);
        contenedor.add(etiqueta_contraseña);
        contenedor.add(campo_contraseña);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        add(contenedor);
        pack();

        ActionListener evento_ingresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarDatosSesion();

            }
        };

        btn_ingresar.addActionListener(evento_ingresar);

        ActionListener evento_cancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               cerrarVentana();
            }
        };

        btn_cancelar.addActionListener(evento_cancelar); 
    }

    public void validarDatosSesion (){
                String texto_usuario = campo_usuario.getText();
                char[] contraseña = campo_contraseña.getPassword();
                String texto_contraseña = new String(contraseña);
                System.out.println("-> USUARIO: "+texto_usuario);
                System.out.println("-> CONTRASEÑA: "+texto_contraseña);
    }

    public void cerrarVentana(){
         System.out.println("\n\n---------CERRANDO VENTANA--------");
                dispose();
    }
}
