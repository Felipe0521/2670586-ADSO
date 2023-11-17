import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.border.*;
import java.awt.event.KeyListener.*;

public class Promedio extends JFrame{

	// Atributos
    private ArrayList<Materia> materiasList = new ArrayList<>();
	private JPanel contenedorItems;
    private JLabel listaJLabels [];
    private int indiceItems;
    private int totalFactura;
	private JLabel etq_datos_cliente;
	private JLabel etq_cedula_cliente;
	private JLabel etq_nombres_cliente;
	private JLabel etq_direccion_cliente;
	private JLabel etq_datos_vendedor;
	private JLabel etq_vendedor_cliente;
	private JLabel etq_nombres_vendedor;
	private JLabel etq_datos_productos;
	private JLabel etq_id_producto;
	private JLabel etq_nombre_producto;
	private JLabel etq_cant_producto;
	private JLabel etq_btn_producto;
	private JLabel etq_resultado;
	private JLabel etq_total;
	private JTextField input_cedula_cliente;
	private JTextField input_nombres_cliente;
	private JTextField input_direccion_cliente;
	private JTextField input_cedula_vendedor;
	private JTextField input_nombres_vendedor;
	private JTextField input_id_producto;
	private JTextField input_nombre_producto;
	private JTextField input_cant_producto;
	private JButton btn_buscar_cliente;
	private JButton btn_buscar_vendedor;
	private JButton btn_add_producto;
    private int i = 0;
	// Metodos
	public Promedio(){
		

		initComponent();
	}

	public void initComponent(){

		this.listaJLabels = new JLabel [50];
		
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize(); //OBTIENE EL TAMAÑO DE LA PANTALLA DEL COMPUTADOR

		setTitle("FACTURA");
		setSize( 600, 600);
		//setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

		
        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("REGISTRAR PROMEDIO");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 10;
        restriccion.fill = GridBagConstraints.NONE;
       contPrincipal.add(etq_titulo, restriccion); 

        JLabel etq_materia = new JLabel();
        etq_materia.setText("Materia:");
        etq_materia.setFont(new Font("Arial", Font.BOLD, 20));
       
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
         contPrincipal.add(etq_materia, restriccion); 


        JTextField campo_materia = new JTextField();
        campo_materia.setColumns(10);
        campo_materia.setFont( new Font("Arial", Font.BOLD, 15) );
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 30;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 3, 0, 0);
         contPrincipal.add(campo_materia, restriccion);
         restriccion.insets = new Insets(0, 0, 0, 0);

          JLabel etq_credito = new JLabel();
        etq_credito.setText("Creditos:");
        etq_credito.setFont(new Font("Arial", Font.BOLD, 20));
        
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(4, 5, 0, 0);
         contPrincipal.add(etq_credito, restriccion); 
         restriccion.insets = new Insets(0, 0, 0, 0);

        
         JTextField campo_credito = new JTextField();
         campo_credito.setColumns(10);  // Igual al tamaño del campo de materia
         campo_credito.setFont(new Font("Arial", Font.BOLD, 15));
         restriccion.gridx = 3;
         restriccion.gridy = 1;
         restriccion.gridwidth = 1;
         restriccion.gridheight = 1;
         restriccion.weightx = 40;
         restriccion.weighty = 1;
         restriccion.fill = GridBagConstraints.BOTH;
         restriccion.insets = new Insets(0, 0, 0, 0);
         contPrincipal.add(campo_credito, restriccion);
         restriccion.insets = new Insets(0, 0, 0, 0);

         JLabel etq_nota = new JLabel();
        etq_nota.setText("Nota:");
        etq_nota.setFont(new Font("Arial", Font.BOLD, 20));
        etq_nota.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.BOTH;
         contPrincipal.add(etq_nota, restriccion); 


          JTextField campo_nota = new JTextField();
        campo_nota.setColumns(8);
        campo_nota.setFont( new Font("Arial", Font.BOLD, 15) );
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 60;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(5, 3, 0, 0);
         contPrincipal.add(campo_nota, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

          JButton btn_registrar = new JButton();
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setBackground(new Color(50,50,255));
        btn_registrar.setFont(new Font("Arial", Font.BOLD, 15));
        btn_registrar.setForeground(Color.WHITE);
        restriccion.gridx = 2;
        restriccion.gridy = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 20;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.NONE;
        restriccion.insets = new Insets(5, 0, 5, 0);
         contPrincipal.add(btn_registrar, restriccion);
         restriccion.insets = new Insets(0, 0, 0, 0);


          JLabel etq_resumen = new JLabel();
        etq_resumen.setText("RESUMEN");
        etq_resumen.setFont(new Font("Arial", Font.BOLD, 21));
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 10;
        restriccion.fill = GridBagConstraints.NONE;
        restriccion.insets = new Insets(5, 0, 0, 0);
        contPrincipal.add(etq_resumen, restriccion);
          restriccion.insets = new Insets(0, 0, 0, 0);

		contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, restriccion );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Total: $ 0");
        etq_total.setHorizontalAlignment( JLabel.CENTER );
        etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, restriccion );

        JButton btn_limpiar = new JButton();
        btn_limpiar.setText("LIMPIAR");
         btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        btn_limpiar.setHorizontalAlignment(JLabel.CENTER);
        btn_limpiar.setFont( new Font("Arial", Font.BOLD, 15) );
        restriccion.gridy = 12;
        restriccion.gridx = 0;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 2;
        restriccion.fill = GridBagConstraints.NONE;
        restriccion.insets = new Insets(5, 0, 0, 0);
          contPrincipal.add(btn_limpiar, restriccion);
         restriccion.insets = new Insets(0, 0, 0, 0);
		
		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

		
        ActionListener evento_click_registrar = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String nombreMateria = campo_materia.getText();
                int creditos = Integer.parseInt(campo_credito.getText());
                double nota = Double.parseDouble(campo_nota.getText());
        
                Materia nuevaMateria = new Materia(nombreMateria, creditos, nota);
                materiasList.add(nuevaMateria);
        
              
                actualizarJLabel();
        
                
                calcularTotalPonderado();

                campo_credito.setText("");
                campo_materia.setText("");
                campo_nota.setText("");
            }
        };
        btn_registrar.addActionListener(evento_click_registrar);

        ActionListener evento_limpiar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vaciar = "<html>";
                vaciar+= "</html>";
                 for (int j = 0; j <= i; j++) {
                     listaJLabels[j].setText(vaciar);
                  }
               
                  i = 0;
                   etq_total.setText("Total: $" + 0);
                
            }
        };
          btn_limpiar.addActionListener(evento_limpiar);
        
		
    }
		
    private void actualizarJLabel() {
        
        String texto = "<html>";
         for (Materia materia : materiasList) {
           texto = materia.toString();
           
        }
        
        

        listaJLabels[i].setText(texto);
        i++;

       
       
       
    }
    
    private void calcularTotalPonderado() {
        double totalPonderado = 0;
        int totalCreditos = 0;
        for (Materia materia : materiasList) {
            totalPonderado += materia.getNotaPonderada();
            totalCreditos += materia.getCreditos();
        }
    
        double promedioPonderado = totalPonderado / totalCreditos;

         DecimalFormat formato = new DecimalFormat("#.##");
        String resultadoFormateado = formato.format(promedioPonderado);

        etq_total.setText("Total: $" + resultadoFormateado);


    }
    
	
}