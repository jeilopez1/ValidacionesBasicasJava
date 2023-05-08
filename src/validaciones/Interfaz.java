/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import java.awt.Choice;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Interfaz extends JFrame implements ActionListener {

    JFrame JFrame;
    JTextField TFNombre1, TFNombre2, TFApellido1, TFApellido2, TFNumeroDocumento, TFCelular;
    Choice CTipoDocumento, CGenero;
    JButton Boton1, Boton2, BAdjuntar, BEstudios;
    
    ValidacionesPropias V = new ValidacionesPropias();
    Estudios ES= new Estudios();
    
    TextArea TextErrores;
    JLabel j1, JTipodeDocumento, JGenero, JImagen;
    JFileChooser ImagenAdjuntada;

    Interfaz() {

        JFrame = new JFrame();
        JFrame.setTitle("Bienvenidos");
        JFrame.setLocationRelativeTo(this);
        JFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TFNombre1 = new JTextField(16);
        TFNombre1.setBorder(BorderFactory.createTitledBorder("Primer Nombre*"));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        V.InsertarMayusculas(TFNombre1);
        V.InsertarLetras(TFNombre1);
        JFrame.add(TFNombre1, gbc);

        TFNombre2 = new JTextField(16);
        TFNombre2.setBorder(BorderFactory.createTitledBorder("Segundo Nombre"));

        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;
        V.InsertarMayusculas(TFNombre2);
        V.InsertarLetras(TFNombre2);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFNombre2, gbc);

        TFApellido1 = new JTextField();
        TFApellido1.setBorder(BorderFactory.createTitledBorder("Primer Apellido *"));

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;
        V.InsertarMayusculas(TFApellido1);
        V.InsertarLetras(TFApellido1);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFApellido1, gbc);

        TFApellido2 = new JTextField();
        TFApellido2.setBorder(BorderFactory.createTitledBorder("Segundo Apellido"));

        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;
        V.InsertarMayusculas(TFApellido2);
        V.InsertarLetras(TFApellido2);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFApellido2, gbc);

        JTipodeDocumento = new JLabel("Selecciona el tipo de documento");

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(JTipodeDocumento, gbc);

        CTipoDocumento = new Choice();
        CTipoDocumento.addItem("Ninguno");
        CTipoDocumento.addItem("Cedula");
        CTipoDocumento.addItem("Tarjeta de identidad");
        CTipoDocumento.addItem("Cedula Extranjera");
        CTipoDocumento.addItem("Registro Civil");

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(CTipoDocumento, gbc);

        TFNumeroDocumento = new JTextField();
        TFNumeroDocumento.setBorder(BorderFactory.createTitledBorder("Numero de documento"));

        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFNumeroDocumento, gbc);
        V.InsertarNumeros(TFNumeroDocumento);
        JGenero = new JLabel("Selecciona el genero");

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(JGenero, gbc);

        CGenero = new Choice();
        CGenero.addItem("Ninguno");
        CGenero.addItem("Hombre");
        CGenero.addItem("Mujer");
        CGenero.addItem("No ha decidido");

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(CGenero, gbc);

        TFCelular = new JTextField();
        TFCelular.setBorder(BorderFactory.createTitledBorder("Numero de celular"));

        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;
        V.InsertarNumeros(TFCelular);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFCelular, gbc);

        ImageIcon IconoVerificar = new ImageIcon(getClass().getResource("/Imagenes/54795.png"));
        Image imagen12 = IconoVerificar.getImage();
        ImageIcon EcaladoVerificar = new ImageIcon(imagen12.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        Boton1 = new JButton(EcaladoVerificar);

        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(Boton1, gbc);
        Boton1.addActionListener(this);

        ImageIcon IconoLimpiar = new ImageIcon(getClass().getResource("/Imagenes/419660.png"));
        Image imagen13 = IconoLimpiar.getImage();
        ImageIcon EcaladoLimpiar = new ImageIcon(imagen13.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        Boton2 = new JButton(EcaladoLimpiar);
        Boton2.addActionListener(this);

        gbc.gridx = 5;
        gbc.gridy = 10;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(Boton2, gbc);

        TextErrores = new TextArea();

        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 10;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(TextErrores, gbc);

        ImageIcon IconoEmpresa = new ImageIcon(getClass().getResource("/Imagenes/fabrica.jpg"));
        Image imagen1 = IconoEmpresa.getImage();
        ImageIcon Ecalado = new ImageIcon(imagen1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
        j1 = new JLabel(Ecalado);

        gbc.gridx = 11;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(j1, gbc);

        ImageIcon IconoAduntar = new ImageIcon(getClass().getResource("/Imagenes/fotodebate.png"));
        Image imagen3 = IconoAduntar.getImage();
        ImageIcon EcaladoAdjuntar = new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
       
        BAdjuntar = new JButton(EcaladoAdjuntar);
        BAdjuntar.addActionListener(this);

        gbc.gridx = 11;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(BAdjuntar, gbc);

        JImagen = new JLabel();

        gbc.gridx = 11;
        gbc.gridy = 3;
        gbc.gridwidth = 10;
        gbc.gridheight = 10;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(JImagen, gbc);
        
        BEstudios= new JButton("Estudio");
        BEstudios.addActionListener(this);
        
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.gridheight = 5;
        gbc.weightx = 0.3;
        gbc.ipady= 50;
        gbc.fill = GridBagConstraints.BOTH;
        JFrame.add(BEstudios, gbc);
        
        

        JFrame.setIconImage(imagen1);

        JFrame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        }
        );

        JFrame.pack();
        JFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Boton1) {
            V.validarcampos(TFNombre1, TFApellido1, TFNumeroDocumento, TFCelular, TextErrores, CGenero, CTipoDocumento);

        }
        if (ae.getSource() == Boton2) {
            CGenero.select(0);
            CTipoDocumento.select(0);
            TFNombre1.setText("");
            TFNombre2.setText("");
            TFApellido1.setText("");
            TFApellido2.setText("");
            TFCelular.setText("");
            TFNumeroDocumento.setText("");
            TextErrores.setText("");
            JImagen.setText(null);
            TFNombre1.setBackground(Color.WHITE);
            TFNombre2.setBackground(Color.WHITE);
            TFApellido1.setBackground(Color.WHITE);
            TFApellido2.setBackground(Color.WHITE);
            TFCelular.setBackground(Color.WHITE);
            TFNumeroDocumento.setBackground(Color.WHITE);
            CGenero.setBackground(Color.WHITE);
            CTipoDocumento.setBackground(Color.WHITE);

        }
        if (ae.getSource() == BAdjuntar) {
            ImagenAdjuntada = new JFileChooser();
            int o = ImagenAdjuntada.showOpenDialog(this);
            if (o == JFileChooser.APPROVE_OPTION) {
                String archivo = ImagenAdjuntada.getSelectedFile().getPath();
                ImageIcon IconoEcalado = new ImageIcon(archivo);
                JImagen.setIcon(IconoEcalado);
            }
        }
        if(ae.getSource()==BEstudios){
            ES.VisualizarVentana();
            JFrame.setVisible(false);
       
        
        }

    }

}
