/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mary Alejandra
 */
public class EmpleadoDAO {
    public Empleado verificaUsuario(String cedula, String contraseña){
        Empleado empleado=null;
        String cc = "123456789";
        String password = "12345";
        String apellidos = "Perez";
        String nombres = "Pedro";
        System.out.println(cedula+"    "+ contraseña);
        try {
            empleado = new Empleado();
            if(cedula.equals("12345") && contraseña.equals("12345")){
                System.out.println("entro");
               empleado = new Empleado();
               empleado.setCedula(cc);
               empleado.setContraseña(password);
               empleado.setApellidos(apellidos);
               empleado.setNombres(nombres);
               return empleado;
            }
        } catch (Exception e) {
        }
        return empleado;
    }
}
