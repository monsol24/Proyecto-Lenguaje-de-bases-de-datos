package Estudiante;


import Principal.Persona;
import javax.swing.JOptionPane;


/**
 *
 * @author pamelS
 */
public class Estudiante extends Persona {
    private static String encargado;
    private static String escuela;
    private static String grado;
    
    //Constructor Vacío
    public Estudiante() {
    }

    //Constructor con datos
    public Estudiante(String role, String nombre, String cedula, String telefono, String encargado,String escuela, String grado) {
        super("Estudiante", nombre,cedula, telefono);
        this.escuela = escuela;
        this.grado = grado;
        this.encargado = encargado;
    }
    
    
}
