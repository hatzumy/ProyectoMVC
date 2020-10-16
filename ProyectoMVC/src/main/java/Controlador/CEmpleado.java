/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Vista.JFEmpleado;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Mary Alejandra
 * @author Gabriel Zapata
 * @since 16/10/2020
 *
 * clase que contiene la informacion del empleado, y la proporciona una vez
 * inciada la sesion y presionado el boton recuperar datos
 */
public class CEmpleado implements ActionListener {

    /**
     * objeto JFEmpleado para manipular la vista del empleado
     */
    JFEmpleado vistaEmpleado = new JFEmpleado();
    /**
     * objeto EmpleadoDAO
     */
    EmpleadoDAO modeloEmpleado = new EmpleadoDAO();
    /**
     * objeto Empleado que contiene la informacion del empleado
     */
    Empleado empleado = new Empleado();
    /**
     * variable String que almacena la cedula
     */
    String cedula;
    /**
     * Variable String que almacena la contraseña
     */
    String contraseña;
    /**
     * Variable String que contiene el privilegio
     */
    String privilegio;
    
    /**
     * Constructor de la clase que inicializa las variables vistaEmpleado y modeloEmpleado
     * @param vistaEmpleado
     * @param modeloEmpleado 
     */
    public CEmpleado(JFEmpleado vistaEmpleado, EmpleadoDAO modeloEmpleado) {
        this.vistaEmpleado = vistaEmpleado;
        this.modeloEmpleado = modeloEmpleado;
        this.vistaEmpleado.jBDatos.addActionListener(this);
    }
    /**
     * Metodo que asigna los valores de la cedula y la contraseña a las variables 
     * locales de la clase para ser manipuladas
     * @param cedula
     * @param contraseña 
     */
    public void InicializaEmpleado(String cedula, String contraseña) {
        this.cedula = cedula;
        this.contraseña = contraseña;
    }
    /**
     * Metodo que captura el evento del boton para retornar la informacion del
     * empleado y visualizarla en la vista
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {
        empleado = modeloEmpleado.verificaUsuario(cedula, contraseña);
        JOptionPane.showMessageDialog(vistaEmpleado, "DATOS DE USUARIO EMPLEADO \n"
                + "Nombres: " + empleado.getApellidos() + "\n Apellidos:" + empleado.getNombres() + "\n");
    }

}
