/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author tmx
 */
public class ValidarDatos {
    
     public void validarSoloLetras(JTextField campo) {
			campo.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!(Character.isLetter(c))) {
						e.consume();
					}
				}
			});
		}
		public void validarSoloNumeros(JTextField c1) {
			c1.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(!(Character.isDigit(c))) {
						e.consume();
					}
				}
			});
		}
		
                
                public boolean correo( String email) {

        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

       //String email = txtEmailAltas.getText().toString();

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
            
        } else {
            System.out.println("El email ingresado es inválido.");
            
        }
        return mather.find();
    }
    
}
