/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Curso;

/**
 *
 * @author Nico Valencia
 */
public class Curso {
    private int id_curso;
    private String nombre;
    private int codigo;
    private int creditos;
    private String descripcion;

    public Curso() {
    }
  
    //metodo de registro de curso
    public void registrar_curso(int id_curso, String nombre, int codigo, int creditos, String descripcion) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.descripcion = descripcion;
    }


    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
