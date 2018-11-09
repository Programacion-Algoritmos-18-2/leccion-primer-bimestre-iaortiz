/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_java;

/**
 *
 * @author isral
 */
public class Empleado {
    //Atributos de empleado
    String nombre;
    String apellido;
    String cedula;
    double comision;
    //Constuctores
    public Empleado() {
    }
    //Consctructor con herencia
    public Empleado(String nombre, String apellido, String cedula, double comision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.comision = comision;
    }
    //Metodos gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    //Metodo To String y presentacion de datos por defecto
    @Override
    public String toString() {
        return String.format("Nombre y Apellido: %s %s\nCedula: %s\nComisión: %.2f", nombre, apellido,cedula,comision);
    }
    
}
