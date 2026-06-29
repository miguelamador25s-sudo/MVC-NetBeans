/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Usuario;
import Vista.Login;
import Vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {
    private Usuario usuario;
    private Login vista;

    
    public LoginController(Usuario usuario, Login vista) {
        this.usuario = usuario;
        this.vista = vista;
        this.vista.btnRegistrar.equals(this);
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (vista.btnRegistrar == e.getSource()) {
            String nom = vista.jTextNombre.getText();
            String pass =new String(vista.jPassword.getPassword());

            usuario =new Usuario(nom, pass);

            JOptionPane.showMessageDialog(vista, "¡Usuario registrado con éxito!\nNombre: " + usuario.getNombre());
        }
    }
}
