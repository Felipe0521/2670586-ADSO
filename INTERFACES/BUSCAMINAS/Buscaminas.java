
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buscaminas extends JFrame {
    
    public Buscaminas(){
        initComponents();
    }

    public void initComponents(){
        Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
        img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);


    }
}
