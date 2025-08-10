/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author solor
 */
public class ConexionSQL {
    
    private final String DRIVER = "oracle.jdbc.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private final String USER = "admin_academico";
    private final String PASSWORD = "adminaca2025";
    
    public Connection cadena;
    
    public ConexionSQL(){
        this.cadena = null;
    }
    
    public Connection conectar(){
        try{
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    public void desconectar(){
        try{
            this.cadena.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
