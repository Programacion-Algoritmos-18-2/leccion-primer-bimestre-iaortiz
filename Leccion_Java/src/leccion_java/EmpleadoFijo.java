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
public class EmpleadoFijo extends Empleado {
    //Declaracion de variablez
    double sueldo_fijo;
    double descuento_fijo;
    //Construcor por defecto
    public EmpleadoFijo() {
    }
    //Constructor cpn herencia

    public EmpleadoFijo(double sueldo_fijo, double descuento_fijo, String nombre, String apellido, String cedula, double comision) {
        super(nombre, apellido, cedula, comision);
        this.sueldo_fijo = sueldo_fijo;
        this.descuento_fijo = descuento_fijo;
    }

    //Metodos gets y sets de las variables
    public double getSueldo_fijo() {
        return sueldo_fijo;
    }

    public void setSueldo_fijo(double sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }

    public double getDescuento_fijo() {
        return descuento_fijo;
    }

    public void setDescuento_fijo(double descuento_fijo) {
        this.descuento_fijo = descuento_fijo;
    }
    //metodo para sacar el sueldo menos el escuento
    public double Calcular_sueldo_final() {
        double valor = this.sueldo_fijo *(this.descuento_fijo/100);
        valor = this.sueldo_fijo - valor;
        return valor;
    }

    //Metodo To String y presentacion de datos por defecto
    @Override
    public String toString() {
        return String.format("%s\nSueldo Fijo: %.2f\nDescuento: %.2f\nSueldo Final: %.2f\n", super.toString(), sueldo_fijo, descuento_fijo, Calcular_sueldo_final());
        //return "EmpleadoFijo{" + "sueldo_fijo=" + sueldo_fijo + ", descuento_fijo=" + descuento_fijo + ", sueldo_final=" + sueldo_final + '}';
    }

}
