import javax.swing.*;
import java.awt.*;

public class BuscaMinas extends JFrame {
    
    private JButton[][] buttons;
    private JLabel[][] status;
    private int[][] board;
    private int rows = 10;
    private int cols = 10;
   

    public BuscaMinas() {
      initComponentes();  
    }

    public void initComponentes(){
         setTitle("BuscaMinas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 7, 20, 7));
        Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") ));
        img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        GridBagConstraints restricciones = new GridBagConstraints();
        setResizable(false); // tamaño fijo

        
        panel.setLayout(new GridLayout(rows, cols));
        status = new JLabel[rows][cols];
        buttons = new JButton[rows][cols];
        board = new int[rows][cols];

        status[0][0] = new JLabel();
        status[0][0].setText("DATOS CLIENTE: ");
        status[0][0].setFont(new Font("Arial", Font.BOLD, 20));
        status[0][0].setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        panel.add( status[0][0], restricciones);

        // Initialize the board with mines
       
        // Add buttons to the panel
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon( new ImageIcon(img_blanco) );
                buttons[i][j].setFocusable(false);
                

               
                panel.add(buttons[i][j]);
            }
        }

        add(panel);
        setVisible(true);
    }
    

}
