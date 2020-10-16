/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mary Alejandra
 * @author Gabriel Zapata
 * @since 16/10/2020
 *
 * Clase modelo que contiene el cascaron para almacenar la informacion de un
 * empleado
 */
public class Empleado {

    /**
     * Variable que almacena la cedula
     */
    String cedula;
    /**
     * variable que almacena la contraseña
     */
    String contraseña;
    /**
     * variable que almacena los apellidos
     */
    String apellidos;
    /**
     * variable que almacena los nombres
     */
    String nombres;

    /**
     * constructor de la clase que inicializa las variables de la clase
     */
    public Empleado() {
        cedula = "";
        contraseña = "";
        apellidos = "";
        nombres = "";
    }

    /**
     * Metodo que retorna la cedula
     *
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * metodo que asigna al empleado la cedula
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * metodo que retorna la contraseña
     *
     * @return
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo que asigna el valor de la contraseña
     *
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Metodo que retorna la variable apellidos
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * metodo que asigna el valor a la variable apellidos
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * metodo que retorna la variable nombres
     *
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * metodo que asigna el valor de nombres
     *
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
