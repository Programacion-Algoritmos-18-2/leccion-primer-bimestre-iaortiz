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
public class EmpleadoPorHoras extends Empleado{
    int numero_horas;
    double valor_horas;
    double sueldo_final_horas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int numero_horas, double valor_horas, double sueldo_final_horas, String nombre, String apellido, String cedula, double comision) {
        super(nombre, apellido, cedula, comision);
        this.numero_horas = numero_horas;
        this.valor_horas = valor_horas;
        this.sueldo_final_horas = sueldo_final_horas;
    }
    
    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public double getValor_horas() {
        return valor_horas;
    }

    public void setValor_horas(double valor_horas) {
        this.valor_horas = valor_horas;
    }

    public double getSueldo_final_horas() {
        return sueldo_final_horas;
    }

    public void setSueldo_final_horas(double sueldo_final_horas) {
        this.sueldo_final_horas = sueldo_final_horas;
    }
    
}
