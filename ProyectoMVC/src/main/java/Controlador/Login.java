/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.*;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Vista.JFEmpleado;
import Vista.JFPrincipal;
import java.awt.event.*;

/**
 *
 * @author Mary Alejandra
 * @author Gabriel Zapata
 * @since 16/10/2020
 *
 * Clase modelo del login
 */
public class Login implements ActionListener {

    /**
     * Objeto JFPrincipal para manejar la vista principal
     */
    JFPrincipal vistaLogin = new JFPrincipal();
    /**
     * Objeto EmpleadoDao
     */
    EmpleadoDAO modeloLogin = new EmpleadoDAO();
    /**
     * Objeto empleado
     */
    Empleado empleado = new Empleado();
    
    /**
     * Constructor de la clase para inicializar las variables de entrada a la clase
     * @param vistaLogin
     * @param modeloLogin 
     */
    public Login(JFPrincipal vistaLogin, EmpleadoDAO modeloLogin) {
        this.vistaLogin = vistaLogin;
        this.modeloLogin = modeloLogin;
        this.vistaLogin.jBIngresar.addActionListener(this);
    }

    public void InicializarLogin() {
    }
    /**
     * Metodo que captura el evennto del boton y contiene la logica para
     * el inicio de sesion
     * 
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {

        String cedula = vistaLogin.jTCedula.getText();
        String contraseña = String.valueOf(vistaLogin.jPContraseña.getPassword());
        System.out.println(cedula + "        " + contraseña);
        empleado = modeloLogin.verificaUsuario(cedula, contraseña);
        System.out.println("esto es:" + empleado.getCedula());
        if (empleado == null || empleado.getCedula().equals("")) {
            JOptionPane.showMessageDialog(vistaLogin, "Empleado con datos ingresados no encontrado.");
        } else {
            JOptionPane.showMessageDialog(vistaLogin, "Datos correctos.");
            JFEmpleado vistaG = new JFEmpleado();
            vistaG.jLBienvenido.setText("Bienvenido " + empleado.getNombres());
            CEmpleado CEmpleado = new CEmpleado(vistaG, modeloLogin);
            CEmpleado.InicializaEmpleado(cedula, contraseña);
            vistaG.setVisible(true);
            vistaG.setLocationRelativeTo(null);
            vistaLogin.setVisible(false);

        }
    }
}
