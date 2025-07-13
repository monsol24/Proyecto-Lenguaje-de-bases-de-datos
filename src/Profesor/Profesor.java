package Profesor;


import Principal.Persona;
import javax.swing.JOptionPane;


/**
 *
 * @author pamelS
 */
public class Profesor extends Persona {
    private static String materia;
    private static String escuela;
    private static String grado;
    
    //Constructor Vacío
    public Profesor() {
    }

    //Constructor con datos
    public Profesor(String role, String nombre, String cedula, String telefono, String materia,String escuela, String grado) {
        super("Profesor", nombre,cedula, telefono);
        this.escuela = escuela;
        this.grado = grado;
        this.materia = materia;
    }
    
    
}
