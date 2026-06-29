/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controlador.LoginController;
import modelo.Usuario;
import Vista.Login;

public class NewClass{
    public static void NewClass(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        Login vista = new Login();
        LoginController controller = new LoginController(usuario, vista);
        controller.iniciar();
    }
}
