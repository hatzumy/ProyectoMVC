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
 * @author Gabriel Zapata
 * @since 16/10/2020
 *
 * Clase principal que inicializa el programa
 */
public class Main {

    /**
     * Metodo inicial del programa
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Objeto JFPrincipal que crea la vista princial del programa
         */
        JFPrincipal vistaL = new JFPrincipal();
        /**
         * Objeto EmpleadoDAO
         */
        EmpleadoDAO modeloL = new EmpleadoDAO();
        /**
         * Objeto login que envia los parametros vistaL y modeloL a la clase
         * Login
         */
        Login login = new Login(vistaL, modeloL);
        /**
         * Muestra la ventana principal
         */
        vistaL.setVisible(true);
        /**
         * centra en la pantalla la ventana de la vista
         */
        vistaL.setLocationRelativeTo(null);
    }
}
