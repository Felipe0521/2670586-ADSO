package INTRODUCCION;
import javax.swing.*;
import java.awt.*;

public class Principal {
        public static void main(String[] args) {



            //programatica cunado se quema todo en codigo la pagina

            Dimension tamanio = new Dimension(600, 500); // otra manera mas practica
            JFrame ventana01 = new JFrame();
            ventana01.setTitle("Primer ventana");
          
            ventana01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE solo cierra esa ventana
            ventana01.setSize(500, 100); // tamaño ventana, primero ancho y despues alto
            ventana01.setSize(tamanio); // o con new dimension
            ventana01.setResizable(true);// para no expandir kla pagina
            ventana01.setLocation(500,100);// 500 px movidos en X/ empieza desde la esquina de la pantalla), 100 en Y ( DESDE ARRIBA DE LA PANTALLA)
            ventana01.setLocationRelativeTo(null); // sobreescribe la posicion de la ventana
            ventana01.setVisible(true); // para que se vea la ventana







            JPanel contenedor = new JPanel();
            contenedor.setBackground(Color.pink); // O CON new Color(0,0,0)
            contenedor.setVisible(true);

            JLabel etiqueta_titulo = new JLabel();
            etiqueta_titulo.setText("TITULO");
            etiqueta_titulo.setFont(new Font("Snap ITC", Font.BOLD, 40));
            etiqueta_titulo.setForeground(Color.red);
            etiqueta_titulo.setBackground(Color.green);
            etiqueta_titulo.setOpaque(true);


            
            JLabel etiqueta_cedula = new JLabel();
            etiqueta_cedula.setText("CEDULA");
            etiqueta_cedula.setFont(new Font("Arial", Font.PLAIN, 30));
           
            JTextField campo_cedula = new JTextField();
            campo_cedula.setColumns(10);


            JLabel etiqueta_nombre = new JLabel();
            etiqueta_nombre.setText("NOMBRE");
            etiqueta_nombre.setFont(new Font("Arial", Font.PLAIN, 30));

            JTextField campo_nombre = new JTextField();
            campo_nombre.setColumns(10);


              JLabel etiqueta_apellido = new JLabel();
            etiqueta_apellido.setText("APELLIDO");
            etiqueta_apellido.setFont(new Font("Arial", Font.PLAIN, 30));
           
            JTextField campo_apellido = new JTextField();
            campo_apellido.setColumns(10);


            JButton boton = new JButton();
            boton.setText("finalizar");
           
            
         


            contenedor.add(etiqueta_titulo);
            contenedor.add(etiqueta_cedula);
            contenedor.add(campo_cedula);
            contenedor.add(etiqueta_nombre);
            contenedor.add(campo_nombre);
            contenedor.add(etiqueta_apellido);
            contenedor.add(campo_apellido);
            contenedor.add(boton);
            
            ventana01.add(contenedor);
            ventana01.revalidate();

            // ventana01.repaint(); // renderizar
            // ventana01.revalidate(); // renderizar
            // ventana01.pack();//se ajusta al tamaño de los componentes internos
               


            //abajo ventana de iniciar sesion//

          /*  Toolkit info_sistema = Toolkit.getDefaultToolkit();
        Dimension pantalla = info_sistema.getScreenSize();

        int ancho = pantalla.width;
        int alto = pantalla.height;

        JFrame ventana = new JFrame();
        ventana.setVisible(true);

        int ancho_app = (int) (ancho*0.5);
        int alto_app = (int) (alto*0.5);   
        // tamaño de la ventana -> ventana.setSize(ancho_app, alto_app);
        ventana.setTitle("INGRESO");
        ventana.setResizable(false);
        ventana.setLocation((int) (ancho*0.25), (int) (alto*0.25));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3,2);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10, 10, 10, 10));

        // etiquetas //
        JLabel etiqueta_username = new JLabel("USERNAME: ");
        JLabel etiqueta_password = new JLabel("PASSWORD: ");

        // campo de texto //
        JTextField campo_username = new JTextField();
        JPasswordField campo_password = new JPasswordField();

        //botones//

        JButton btn_ingresar = new JButton("INGRESAR");
        JButton btn_cancelar = new JButton("CANCELAR");

        contenedor.add(etiqueta_username);
        contenedor.add(campo_username);
        contenedor.add(etiqueta_password);
        contenedor.add(campo_password);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        ventana.add(contenedor);
        // refresca la ventana -> ventana.revalidate();
        ventana.pack();

        // eventos //

        ActionListener evento_ingresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n\nHa dado click en ingresar");

                String texto_usuario = campo_username.getText();
                String texto_pass = campo_password.getText();
                System.out.println("-> USUARIO: "+texto_usuario);
                System.out.println("-> CONTRASEÑA: "+texto_pass);


            }
        };

        ActionListener evento_cancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ha dado click en cancelar");
                ventana.dispose();
            }
        };

        btn_ingresar.addActionListener(evento_ingresar);
        btn_cancelar.addActionListener(evento_cancelar); */



            //metodo para liberar la consola ( true para verla)
             // ventana01.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // tambien se puede 0
            // ventana01.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // ESCONDER LA VENTANA
            //  ventana01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // LIBERA LA TERMINAL ALGO LENTA
             // ventana01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// LIBERA LA TERMINAL MAS RAPIDA, y cierra todas las ventanas
        }
}