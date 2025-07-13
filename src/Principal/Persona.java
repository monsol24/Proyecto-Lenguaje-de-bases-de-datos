package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author pamel
 */
public class Persona {

    //Atributos de Persona
    private static String role;
    private static String nombre;
    private static String cedula;
    private static String telefono;

    //Constructor Vacío
    public Persona() {
    }

    //Constructor Lleno
    public Persona(String role, String nombre, String cedula, String telefono) {
        this.role = role;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    //Getter y Setter de los Atributos
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Persona.telefono = telefono;
    }

}
