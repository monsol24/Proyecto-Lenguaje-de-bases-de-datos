package Credenciales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author pamel
 */
public class Credencial {
    // Declarar los atributos para a clase de credenciales (username y password)
    private static String username;
    private static String password;

    public Credencial() {
    }
    
    //Metodo para que el usuario haga el logeo
    public void Login(String username, String  password) {
        this.username = username;
        this.password = password;
    }
    
    //Metodos (Get y Set)
    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   
}
