

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Factura extends JFrame {

    private Vector<? extends Vector> productosDatos;
    private Vector<?> productosColumnas;

    public Factura (){
        initComponents();
    }

    public void initComponents(){
        JPanel contenedor = new JPanel();
        GridBagLayout capa = new GridBagLayout();
        contenedor.setLayout(capa);
        add(contenedor);

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel clienteTitulo = new JLabel("DATOS CLIENTE", JLabel.LEFT);
        clienteTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        clienteTitulo.setBorder(BorderFactory.createEmptyBorder(30, 15, 15, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        contenedor.add(clienteTitulo, gbc);

        JLabel clienteCedulaLabel = new JLabel("CEDULA: ", JLabel.CENTER);
        clienteCedulaLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        clienteCedulaLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        contenedor.add(clienteCedulaLabel, gbc);

        JTextField clienteCedulaTF = new JTextField();
        clienteCedulaTF.setFont(new Font("Verdana", Font.BOLD, 20));
        clienteCedulaTF.setColumns(10);
        gbc.gridx = 1;
        contenedor.add(clienteCedulaTF, gbc);

        JButton clienteCedulaBtn = new JButton("BUSCAR");
        clienteCedulaBtn.setFont(new Font("Verdana", Font.BOLD, 15));
        gbc.gridx = 2;
        contenedor.add(clienteCedulaBtn, gbc);


        JLabel clienteNombreLabel = new JLabel("NOMBRE: ");
        clienteNombreLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        clienteNombreLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        contenedor.add(clienteNombreLabel, gbc);

        JLabel clienteNombreResultado = new JLabel("", JLabel.CENTER);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        clienteNombreResultado.setFont(new Font("Verdana", 600, 15));
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        contenedor.add(clienteNombreResultado, gbc);

        JLabel clienteDireccionLabel = new JLabel("DIRECCION: ");
        clienteDireccionLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        clienteDireccionLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        gbc.gridy = 3;
        gbc.gridx = 0;
        contenedor.add(clienteDireccionLabel, gbc);

        JLabel clienteDireccionResultado = new JLabel("", JLabel.CENTER);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        clienteDireccionResultado.setFont(new Font("Verdana", 600, 15));
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        contenedor.add(clienteDireccionResultado, gbc);

        JLabel vendedorTitulo = new JLabel("DATOS VENDEDOR", JLabel.LEFT);
        vendedorTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        vendedorTitulo.setBorder(BorderFactory.createEmptyBorder(30, 15, 15, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        contenedor.add(vendedorTitulo, gbc);

        JLabel vendedorCedulaLabel = new JLabel("CEDULA: ", JLabel.CENTER);
        vendedorCedulaLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        vendedorCedulaLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        contenedor.add(vendedorCedulaLabel, gbc);

        JTextField vendedorCedulaTF = new JTextField();
        vendedorCedulaTF.setFont(new Font("Verdana", Font.BOLD, 20));
        vendedorCedulaTF.setColumns(10);
        gbc.gridx = 1;
        contenedor.add(vendedorCedulaTF, gbc);

        JButton vendedorCedulaBtn = new JButton("BUSCAR");
        vendedorCedulaBtn.setFont(new Font("Verdana", Font.BOLD, 15));
        gbc.gridx = 2;
        contenedor.add(vendedorCedulaBtn, gbc);


        JLabel vendedorNombreLabel = new JLabel("NOMBRE: ");
        vendedorNombreLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        vendedorNombreLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        gbc.gridwidth = 1;
        gbc.gridy = 6;
        gbc.gridx = 0;
        contenedor.add(vendedorNombreLabel, gbc);

        JLabel vendedorNombreResultado = new JLabel("", JLabel.CENTER);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        vendedorNombreResultado.setFont(new Font("Verdana", 600, 15));
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        contenedor.add(vendedorNombreResultado, gbc);

        JLabel productosTitulo = new JLabel("LISTA PRODUCTOS FACTURADOS", JLabel.LEFT);
        productosTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        productosTitulo.setBorder(BorderFactory.createEmptyBorder(30, 15, 15, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        contenedor.add(productosTitulo, gbc);

        JPanel addDatos = new JPanel();
        GridLayout datosLayout = new GridLayout(1, 3);
        addDatos.setLayout(datosLayout);
        JTextField addId = new JTextField("");
        addId.setFont(new Font("Verdana", Font.BOLD, 12));
        JTextField addNombre = new JTextField("");
        addNombre.setFont(new Font("Verdana", Font.BOLD, 12));
        JTextField addCantidad = new JTextField("");
        addCantidad.setFont(new Font("Verdana", Font.BOLD, 12));
        addDatos.add(addId);
        addDatos.add(addNombre);
        addDatos.add(addCantidad);
        addDatos.setBorder(BorderFactory.createEmptyBorder(30, 15, 15, 15));
        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        contenedor.add(addDatos, gbc);

        JButton addListaProductos = new JButton("ADD");
        addListaProductos.setFont(new Font("Verdana", Font.BOLD, 15));
        gbc.gridy = 8;
        gbc.gridx = 2;
        contenedor.add(addListaProductos, gbc);

        JTable listaProductos = new JTable(new DefaultTableModel(productosDatos, productosColumnas));
        listaProductos.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(listaProductos);
        scrollPane.setPreferredSize(new Dimension(0, 150));
        scrollPane.setBorder(BorderFactory.createEmptyBorder(30, 15, 0, 15));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 9;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        contenedor.add(scrollPane, gbc);
        add(contenedor);
        setVisible(true);
        revalidate();


    }
}
