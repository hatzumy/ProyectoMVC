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
 */
public class Login implements ActionListener{
    JFPrincipal vistaLogin = new JFPrincipal();
    EmpleadoDAO modeloLogin = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    
    public Login(JFPrincipal vistaLogin, EmpleadoDAO modeloLogin){
        this.vistaLogin=vistaLogin;
        this.modeloLogin = modeloLogin;
        this.vistaLogin.jBIngresar.addActionListener(this);
    }
    public void InicializarLogin(){
    }
      
     public void actionPerformed(ActionEvent e){
        
        String cedula= vistaLogin.jTCedula.getText();
        String contraseña = String.valueOf(vistaLogin.jPContraseña.getPassword());
        System.out.println(cedula+ "        "+contraseña);
        empleado = modeloLogin.verificaUsuario(cedula, contraseña);
         System.out.println("esto es:"+empleado.getCedula());
        if(empleado==null ||empleado.getCedula().equals("")){
            JOptionPane.showMessageDialog(vistaLogin, "Empleado con datos ingresados no encontrado.");
        }else{
            JOptionPane.showMessageDialog(vistaLogin, "Datos correctos.");
            JFEmpleado vistaG = new JFEmpleado();
            vistaG.jLBienvenido.setText("Bienvenido "+empleado.getNombres());
            CEmpleado CEmpleado = new CEmpleado (vistaG, modeloLogin);
            CEmpleado.InicializaEmpleado(cedula, contraseña);
            vistaG.setVisible(true);
            vistaG.setLocationRelativeTo(null);
            vistaLogin.setVisible(false);
            
        }
    }
}
