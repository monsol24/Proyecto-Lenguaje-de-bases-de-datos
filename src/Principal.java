

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Importar Clases y Funciones
import Credenciales.IniciarSesion;

/**
 *
 * @author pamel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IniciarSesion usuario = new IniciarSesion();
        
        usuario.setVisible(true);//que se muestre la pantalla principal
        usuario.setLocationRelativeTo(null);//colocar el frame al centro de la pantalla

    }
}
