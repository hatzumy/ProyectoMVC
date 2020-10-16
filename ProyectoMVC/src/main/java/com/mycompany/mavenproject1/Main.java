/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import Controlador.Login;
import Modelo.EmpleadoDAO;
import Vista.JFPrincipal;
/**
 *
 * @author Mary Alejandra
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
       JFPrincipal vistaL = new JFPrincipal();
        EmpleadoDAO modeloL = new EmpleadoDAO();
        Login login= new Login(vistaL, modeloL);
        vistaL.setVisible(true);
        vistaL.setLocationRelativeTo(null);
    }
}
