

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Importar Clases y Funciones
import Credenciales.Credenciales;

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
        //Declarar Instancias
        Credenciales usuario = new Credenciales();
        
        usuario.setVisible(true);//que se muestre o ejecute el formulario
        usuario.setLocationRelativeTo(null);//colocar el frame al centro de la pantalla

    }
}
