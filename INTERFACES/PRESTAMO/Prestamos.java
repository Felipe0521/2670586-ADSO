
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prestamos extends JFrame {
    


    public Prestamos(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Simulador de Prestamos");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restrincciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("PRESTAMOS");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        restrincciones.gridx = 0;
        restrincciones.gridy = 0;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_titulo, restrincciones); 

        JLabel etq_capital = new JLabel();
        etq_capital.setText("Capital:");
        etq_capital.setFont(new Font("Arial", Font.BOLD, 20));
        etq_capital.setHorizontalAlignment(JLabel.RIGHT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 20;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_capital, restrincciones); 


        JTextField campo_capital = new JTextField();
        campo_capital.setColumns(10);
        restrincciones.gridx = 1;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 80;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(0, 3, 0, 0);
         contenedor.add(campo_capital, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);

          JLabel etq_interes = new JLabel();
        etq_interes.setText("Interes:");
        etq_interes.setFont(new Font("Arial", Font.BOLD, 20));
        etq_interes.setHorizontalAlignment(JLabel.RIGHT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 2;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 20;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_interes, restrincciones); 

        
        JTextField campo_intereses = new JTextField();
        campo_intereses.setColumns(10);
        restrincciones.gridx = 1;
        restrincciones.gridy = 2;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 80;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(4, 3, 0, 0);
         contenedor.add(campo_intereses, restrincciones);
        restrincciones.insets = new Insets(0, 0, 0, 0);

         JLabel etq_cuotas = new JLabel();
        etq_cuotas.setText("Cuotas:");
        etq_cuotas.setFont(new Font("Arial", Font.BOLD, 20));
        etq_cuotas.setHorizontalAlignment(JLabel.RIGHT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 3;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 20;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(etq_cuotas, restrincciones); 


          JTextField campo_cuotas = new JTextField();
        campo_cuotas.setColumns(10);
        restrincciones.gridx = 1;
        restrincciones.gridy = 3;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 80;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(5, 3, 0, 0);
         contenedor.add(campo_cuotas, restrincciones);
        restrincciones.insets = new Insets(0, 0, 0, 0);

          JButton btn_calcular = new JButton();
        btn_calcular.setText("CALCULAR");
        btn_calcular.setBackground(new Color(50,50,255));
        btn_calcular.setForeground(Color.WHITE);
        restrincciones.gridx = 0;
        restrincciones.gridy = 4;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.NONE;
        restrincciones.insets = new Insets(5, 0, 5, 0);
         contenedor.add(btn_calcular, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);


          JLabel etq_titulo_pagos = new JLabel();
        etq_titulo_pagos.setText("Plan de Pagos:");
        etq_titulo_pagos.setFont(new Font("Arial", Font.BOLD, 21));
        restrincciones.gridx = 0;
        restrincciones.gridy = 5;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.BOTH;
        restrincciones.insets = new Insets(5, 0, 0, 0);
         contenedor.add(etq_titulo_pagos, restrincciones);
          restrincciones.insets = new Insets(0, 0, 0, 0);

         JLabel etq_plan_pagos = new JLabel();
         etq_plan_pagos.setText("---");
         etq_plan_pagos.setFont(new Font("Arial", Font.BOLD, 18));
         etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        restrincciones.gridx = 0;
        restrincciones.gridy = 6;
        restrincciones.gridwidth = 3;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 90;
        restrincciones.fill = GridBagConstraints.BOTH;
         contenedor.add(scroll, restrincciones);



         JButton btn_limpiar = new JButton();
        btn_limpiar.setText("Limpiar");
         btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        restrincciones.gridx = 0;
        restrincciones.gridy = 7;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 100;
        restrincciones.weighty = 1;
        restrincciones.fill = GridBagConstraints.NONE;
        restrincciones.insets = new Insets(5, 0, 0, 0);
         contenedor.add(btn_limpiar, restrincciones);
         restrincciones.insets = new Insets(0, 0, 0, 0);


        ActionListener evento_calcular = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double capital = Double.parseDouble(campo_capital.getText());
                double interes = Double.parseDouble(campo_intereses.getText());
                double cuotas = Double.parseDouble(campo_cuotas.getText());

                double valor_cuota = (capital+(capital*(interes/100)))/cuotas;

                String texto = "<html>";
                for (int i = 1; i <= cuotas; i++) {
                  texto+= "CUOTA #"+i+": "+valor_cuota+"<br>";
                }
                texto += "</html>";
                etq_plan_pagos.setText(texto);

                System.out.println("-> CAPITAL: "+capital);
                System.out.println("-> INTERESES: "+interes);
                System.out.println("-> CUOTAS: "+cuotas);
               
            }
        };
          btn_calcular.addActionListener(evento_calcular);
        
      
       ActionListener evento_limpiar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vaciar = "<html>";
                vaciar+= "</html>";
                etq_plan_pagos.setText(vaciar);

                
            }
        };
          btn_limpiar.addActionListener(evento_limpiar);

        

        add(contenedor);
        setVisible(true);
        revalidate();
        
    }
}
