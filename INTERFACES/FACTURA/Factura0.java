
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame {

    public Factura (){
        initComponents();
    }

    public void initComponents(){
        setTitle("FACTURA");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(545, 690);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.GRAY);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restrincciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS CLIENTE: ");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 20));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 0;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo, restrincciones); 

         JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA:");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 12));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 15;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_cedula, restrincciones); 

          JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(8);
        restrincciones.gridx = 1;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 45;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 0, 0, 5);
         contenedor.add(campo_cedula, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

           JButton btn_buscar = new JButton();
        btn_buscar.setText("BUSCAR");
        btn_buscar.setHorizontalAlignment(JButton.RIGHT);
        restrincciones.gridx = 2;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 40;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(5, 0, 5, 0);
         contenedor.add(btn_buscar, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_nombres = new JLabel();
        etq_nombres.setText("NOMBRES:");
        etq_nombres.setFont(new Font("Arial", Font.BOLD, 12));
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 2;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 10;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_nombres, restrincciones);

          JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION:");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 12));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 3;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 10;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_direccion, restrincciones);

         JLabel etq_vendedor = new JLabel();
        etq_vendedor.setText("DATOS VENDEDOR: ");
        etq_vendedor.setFont(new Font("Arial", Font.BOLD, 20));
        etq_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 4;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vendedor, restrincciones); 

         JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA:");
        etq_cedula_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 5;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 10;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_cedula_vendedor, restrincciones); 
         
         JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(10);
        restrincciones.gridx = 1;
        restrincciones.gridy = 5;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 65;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 2, 0, 0);
         contenedor.add(campo_cedula_vendedor, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

           JButton btn_buscar_vendedor = new JButton();
        btn_buscar_vendedor.setText("BUSCAR");
        restrincciones.gridx = 2;
        restrincciones.gridy = 5;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 25;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(5, 2, 5, 0);
         contenedor.add(btn_buscar_vendedor, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("NOMBRES:");
        etq_nombres_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 6;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 10;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_nombres_vendedor, restrincciones);

         JLabel etq_titulo_facturado = new JLabel();
         etq_titulo_facturado.setText("LISTA PRODUCTOS FACTURADOS:");
         etq_titulo_facturado.setFont(new Font("Arial", Font.BOLD, 20));
         restrincciones.gridx = 0;
         restrincciones.gridy = 7;
         restrincciones.gridwidth = 2;
         restrincciones.gridheight = 1;
         restrincciones.weightx = 100;
         restrincciones.weighty = 1;
         restrincciones.fill = GridBagConstraints.BOTH;
         restrincciones.insets = new Insets(5, 0, 0, 0);
          contenedor.add(etq_titulo_facturado, restrincciones);
           restrincciones.insets = new Insets(0, 0, 0, 0);

            JLabel etq_id = new JLabel();
        etq_id.setText("ID");
        etq_id.setFont(new Font("Arial", Font.BOLD, 12));
        etq_id.setHorizontalAlignment(JLabel.CENTER);
        restrincciones.gridx = 0;
        restrincciones.gridy = 8;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 20;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_id, restrincciones);

          JLabel etq_nombre = new JLabel();
        etq_nombre.setText("NOMBRE");
        etq_nombre.setFont(new Font("Arial", Font.BOLD, 12));
        etq_nombre.setHorizontalAlignment(JLabel.CENTER);
        restrincciones.gridx = 1;
        restrincciones.gridy = 8;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 50;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_nombre, restrincciones);

          JLabel etq_cantidad = new JLabel();
        etq_cantidad.setText("CANT.");
        etq_cantidad.setFont(new Font("Arial", Font.BOLD, 12));
        etq_cantidad.setHorizontalAlignment(JLabel.RIGHT);
        restrincciones.gridx = 2;
        restrincciones.gridy = 8;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 30;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_cantidad, restrincciones);



          JTextField campo_id = new JTextField();
        campo_id.setColumns(2);
        restrincciones.gridx = 0;
        restrincciones.gridy = 9;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 15;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 0, 0, 0);
         contenedor.add(campo_id, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

          JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(6);
        campo_nombre.setEditable(false);
        campo_nombre.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        restrincciones.gridx = 1;
        restrincciones.gridy = 9;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 40;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 0, 0, 0);
         contenedor.add(campo_nombre, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

           JTextField campo_cant = new JTextField();
        campo_cant.setColumns(2);
        restrincciones.gridx = 2;
        restrincciones.gridy = 9;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 10;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 0, 0, 0);
         contenedor.add(campo_cant, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);
         

         JButton btn_calcular = new JButton();
         btn_calcular.setText("CALCULAR");
         restrincciones.gridx = 2;
         restrincciones.gridy = 9;
         restrincciones.gridwidth = 1;
         restrincciones.gridheight = 1;
         restrincciones.weightx = 30;
         restrincciones.weighty = 1;
         restrincciones.fill = GridBagConstraints.BOTH;
         restrincciones.insets = new Insets(5, 0, 0, 0);
          contenedor.add(btn_calcular, restrincciones);
          restrincciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_plan_pagos = new JLabel();
          etq_plan_pagos.setText("---");
          etq_plan_pagos.setFont(new Font("Arial", Font.BOLD, 18));
          etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
         JScrollPane scroll = new JScrollPane(etq_plan_pagos);
         restrincciones.gridx = 0;
         restrincciones.gridy = 10;
         restrincciones.gridwidth = 3;
         restrincciones.gridheight = 1;
         restrincciones.weightx = 100;
         restrincciones.weighty = 30;
         restrincciones.fill = GridBagConstraints.BOTH;
          contenedor.add(scroll, restrincciones);
        add(contenedor);
        setVisible(true);
        revalidate();


    }
}
*\