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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Estudios extends JFrame implements ActionListener {

    JFrame JFrame;
    Choice Escolaridad;
    JTextField TFInstitucion;
    JButton Retornar;

    ValidacionesPropias V = new ValidacionesPropias();

    Estudios() {

    }

    void VisualizarVentana() {
        JFrame = new JFrame();
        JFrame.setTitle("Bienvenidos");
        JFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbce = new GridBagConstraints();

        Escolaridad = new Choice();
        Escolaridad.add("Ninguno");
        Escolaridad.add("Primaria");
        Escolaridad.add("Secundaria");
        Escolaridad.add("Tecnologia");
        Escolaridad.add("Profesional");

        gbce.gridx = 0;
        gbce.gridy = 0;
        gbce.gridwidth = 5;
        gbce.gridheight = 1;
        gbce.weightx = 0.3;

        gbce.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(Escolaridad, gbce);

        TFInstitucion = new JTextField();
        TFInstitucion.setBorder(BorderFactory.createTitledBorder("Institucion*"));
        gbce.gridx = 0;
        gbce.gridy = 1;
        gbce.gridwidth = 5;
        gbce.gridheight = 1;
        gbce.weightx = 0.3;

        gbce.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(TFInstitucion, gbce);

        Retornar = new JButton("Retornar");
        Retornar.addActionListener(this);
        gbce.gridx = 5;
        gbce.gridy = 2;
        gbce.gridwidth = 5;
        gbce.gridheight = 1;
        gbce.weightx = 0.3;

        gbce.fill = GridBagConstraints.HORIZONTAL;
        JFrame.add(Retornar, gbce);

        JFrame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        }
        );

        JFrame.pack();
        JFrame.setVisible(true);
        JFrame.setLocationRelativeTo(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Retornar) {
            Interfaz Inter = new Interfaz();
            
            V.validarcampos2(Escolaridad, TFInstitucion, Inter.TextErrores);
            
            
        }

    }

}
