/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import java.awt.Choice;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class ValidacionesPropias {

    JTextField TFNombre1, TFApellido;
    TextArea TextErrores;

    public ValidacionesPropias() {

    }

    void validarcampos(JTextField TFNombre1, JTextField TFApellido1, JTextField TFNumeroDocumento, JTextField TFCelular, TextArea TextErrores, Choice CGenero, Choice CTipoDocumento) {
        String x = "";

        if (TFNombre1.getText().length() == 0) {
            x += "Por favor adiciona el primer nombre\n";
            TFNombre1.setBackground(Color.RED);
        } else {
            TFNombre1.setBackground(Color.WHITE);
        }
        if (TFApellido1.getText().length() == 0) {
            TextErrores.setText("Inserte el primer apellido por favor");
            TFApellido1.setBackground(Color.RED);
            x += "Por favor adiciona el primer apellido\n";
        } else {
            TFApellido1.setBackground(Color.WHITE);
        }

        if (TFNumeroDocumento.getText().length() == 0) {
            TextErrores.setText("Inserte el numero de documento por favor");
            TFNumeroDocumento.setBackground(Color.RED);
            x += "Por favor adiciona el numero de documento\n";
        } else {
            TFNumeroDocumento.setBackground(Color.WHITE);
        }
        if (TFCelular.getText().length() == 0) {
            TextErrores.setText("Inserte el numero de celular por favor");
            TFCelular.setBackground(Color.RED);
            x += "Por favor adiciona el numero de celular\n";
        } else {
            TFCelular.setBackground(Color.WHITE);
        }
        if (CGenero.getSelectedItem().equals("Ninguno")) {
            TextErrores.setText("Por favor selecciona el genero");
            CGenero.setBackground(Color.RED);
            x += "Por favor selecciona el genero\n";
        } else {
            CGenero.setBackground(Color.WHITE);
        }

        if (CTipoDocumento.getSelectedItem().equals("Ninguno")) {
            TextErrores.setText("Por favor selecciona el tipo de documento");
            CTipoDocumento.setBackground(Color.RED);
            x += "Por favor selecciona el tipo de documento\n";
        } else {
            CTipoDocumento.setBackground(Color.WHITE);
        }

        TextErrores.setText(x);
    }

    void InsertarMayusculas(JTextField jTextField) {
        jTextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (Character.isLowerCase(x)) {
                    e.setKeyChar(Character.toUpperCase(x));
                }
            }
        });

    }

    void InsertarNumeros(JTextField jTextField) {
        jTextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (x < '0' || x > '9') {
                    e.consume();
                }
            }
        }
        );
    }

    void InsertarLetras(JTextField jTextField) {
        jTextField.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char x = e.getKeyChar();
                if (!(x < '0' || x > '9')) {
                    e.consume();
                }
            }
        }
        );
    }

    void validarcampos2(Choice Escolaridad, JTextField TFInstitucion, TextArea TextErrores) {
        String x = "";
        String y = "";

        int Ban = 0;
        do {
            if (TFInstitucion.getText().length() == 0) {
                x += "Por favor adiciona el nombre de la institucion\n";
                TFInstitucion.setBackground(Color.RED);
            } else {
                TFInstitucion.setBackground(Color.WHITE);
                Ban++;

            }
            if (Escolaridad.getSelectedItem().equals("Ninguno")) {
                TextErrores.setText("Por favor selecciona el tipo de Escolaridad");
                Escolaridad.setBackground(Color.RED);
                x += "Por favor selecciona el tipo de Escolaridad\n";
            } else {
                Escolaridad.setBackground(Color.WHITE);
                Ban++;
            }
            TextErrores.setText(x);
        } while (Ban == 2);
    }
}
