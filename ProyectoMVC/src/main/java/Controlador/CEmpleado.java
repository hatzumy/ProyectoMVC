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
 */
public class CEmpleado implements ActionListener {
    JFEmpleado vistaEmpleado = new JFEmpleado();
    EmpleadoDAO modeloEmpleado = new EmpleadoDAO();
    Empleado  empleado = new Empleado();
    String cedula, contraseña, privilegio;
    
    public CEmpleado(JFEmpleado vistaEmpleado, EmpleadoDAO modeloEmpleado){
        this.vistaEmpleado=vistaEmpleado;
        this.modeloEmpleado=modeloEmpleado;
        this.vistaEmpleado.jBDatos.addActionListener(this);
    }
    
    public void InicializaEmpleado(String cedula, String contraseña){
        this.cedula = cedula;
        this.contraseña=contraseña;
    }
    
    public void actionPerformed(ActionEvent e){
        empleado = modeloEmpleado.verificaUsuario(cedula, contraseña);
        JOptionPane.showMessageDialog(vistaEmpleado, "DATOS DE USUARIO EMPLEADO \n"+
                "Nombres: "+empleado.getApellidos()+"\n Apellidos:"+empleado.getNombres()+"\n");
    }
    
}
