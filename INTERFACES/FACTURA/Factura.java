import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Factura
 */

public class Factura extends JFrame{

    public Factura(){
        initComponentes();

    }

    public void initComponentes(){
        setTitle("FACTURA");// titulo
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(545, 690); //tamaño
        setLocationRelativeTo(null); // localizacion
        setDefaultCloseOperation(EXIT_ON_CLOSE); // cierre en consola
        JPanel contenedor= new JPanel(); // crea el panel
        contenedor.setBackground(Color.WHITE); // color del contenedor
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restricciones = new GridBagConstraints();
        setResizable(false); // tamaño fijo


     JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS CLIENTE: ");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 20));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo, restricciones); 

         JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA:");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 12));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
         restricciones.insets = new Insets(0, 0, 0, 0);
         contenedor.add(etq_cedula, restricciones); 
          restricciones.insets = new Insets(0, 0, 0, 0);

          JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(12);
        
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 65;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 5);
         contenedor.add(campo_cedula, restricciones);
         restricciones.insets = new Insets(0, 0, 0, 0);

           JButton btn_buscar = new JButton();
        btn_buscar.setText("BUSCAR");
        btn_buscar.setHorizontalAlignment(JButton.RIGHT);
        restricciones.gridx = 2;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 5, 0);
         contenedor.add(btn_buscar, restricciones);
         restricciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_nombres = new JLabel();
        etq_nombres.setText("NOMBRES:");
        etq_nombres.setFont(new Font("Arial", Font.BOLD, 12));
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
         restricciones.insets = new Insets(3, 0, 3, 0);
         contenedor.add(etq_nombres, restricciones);

          JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION:");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 12));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
         restricciones.insets = new Insets(3, 0, 5, 0);
         contenedor.add(etq_direccion, restricciones);
          restricciones.insets = new Insets(0, 0, 0, 0);

         JLabel etq_vendedor = new JLabel();
        etq_vendedor.setText("DATOS VENDEDOR: ");
        etq_vendedor.setFont(new Font("Arial", Font.BOLD, 20));
        etq_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vendedor, restricciones); 

         JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA:");
        etq_cedula_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_cedula_vendedor, restricciones); 
         
         JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(20);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 65;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 2, 3, 0);
         contenedor.add(campo_cedula_vendedor, restricciones);
         restricciones.insets = new Insets(0, 0, 0, 0);

           JButton btn_buscar_vendedor = new JButton();
        btn_buscar_vendedor.setText("BUSCAR");
        restricciones.gridx = 2;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 2, 5, 0);
         contenedor.add(btn_buscar_vendedor, restricciones);
         restricciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("NOMBRES:");
        etq_nombres_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_nombres_vendedor, restricciones);

         JLabel etq_titulo_facturado = new JLabel();
         etq_titulo_facturado.setText("LISTA PRODUCTOS FACTURADOS:");
         etq_titulo_facturado.setFont(new Font("Arial", Font.BOLD, 20));
         restricciones.gridx = 0;
         restricciones.gridy = 7;
         restricciones.gridwidth = 2;
         restricciones.gridheight = 1;
         restricciones.weightx = 100;
         restricciones.weighty = 1;
         restricciones.fill = GridBagConstraints.BOTH;
         restricciones.insets = new Insets(5, 0, 0, 0);
          contenedor.add(etq_titulo_facturado, restricciones);
           restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_id_producto=new JLabel();
        etq_id_producto.setText("ID:");
        etq_id_producto.setFont(new Font("Arial", Font.BOLD, 10));
        etq_id_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx= 0;
        restricciones.gridy= 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 5, 0, 0);
        contenedor.add(etq_id_producto,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_nombre_producto=new JLabel();
        etq_nombre_producto.setText("NOMBRE:");
        etq_nombre_producto.setFont(new Font("Arial", Font.BOLD, 10));
        etq_nombre_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx= 1;
        restricciones.gridy= 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 55;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 5, 0, 0);
        contenedor.add(etq_nombre_producto,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_cantidad_producto=new JLabel();
        etq_cantidad_producto.setText("CANT:");
        etq_cantidad_producto.setFont(new Font("Arial", Font.BOLD, 10));
        etq_cantidad_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx= 2;
        restricciones.gridy= 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 5, 0, 0);
        contenedor.add(etq_cantidad_producto,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);







        JTextField campo_id=new JTextField();
        campo_id.setColumns(10);
        restricciones.gridx= 0;
        restricciones.gridy= 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_id,restricciones);



        JTextField campo_nombre_producto=new JTextField();
        campo_nombre_producto.setColumns(10);
        restricciones.gridx= 1;
        restricciones.gridy= 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 55;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_nombre_producto,restricciones);



        JTextField campo_cantidad_producto=new JTextField();
        campo_cantidad_producto.setColumns(10);
        restricciones.gridx= 2;
        restricciones.gridy= 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cantidad_producto,restricciones);










        JButton btn_agregar = new JButton();
        btn_agregar.setText("ADD");
        // COLOR DE BOTON:  btn_buscar.setBackground(new Color(50,50,255));
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(btn_agregar,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);







        JLabel etq_productos_facturados = new JLabel();
        etq_productos_facturados.setFont(new Font("Arial", Font.BOLD, 20));
        etq_productos_facturados.setText("----");
        JScrollPane scroll = new JScrollPane(etq_productos_facturados);
        etq_productos_facturados.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 80;
        restricciones.fill = GridBagConstraints.BOTH;
         restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(scroll, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_total=new JLabel();
        etq_total.setText("TOTAL: $");
        etq_total.setFont(new Font("Arial", Font.BOLD, 20));
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx= 0;
        restricciones.gridy= 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 5, 0, 0);
        contenedor.add(etq_total,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);








        add(contenedor);
        setVisible(true); // visibilidad de la ventana
        revalidate(); // verifica graficos 




    }




}