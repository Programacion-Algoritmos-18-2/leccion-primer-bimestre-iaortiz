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
public class EmpleadoSemanal extends Empleado{
    int numero_semanas;
    double sueldo_semanal;
    double sueldo_final_semanal;

    public EmpleadoSemanal() {
    }

    public EmpleadoSemanal(int numero_semanas, double sueldo_semanal, double sueldo_final_semanal, String nombre, String apellido, String cedula, double comision) {
        super(nombre, apellido, cedula, comision);
        this.numero_semanas = numero_semanas;
        this.sueldo_semanal = sueldo_semanal;
        this.sueldo_final_semanal = sueldo_final_semanal;
    }

    public int getNumero_semanas() {
        return numero_semanas;
    }

    public void setNumero_semanas(int numero_semanas) {
        this.numero_semanas = numero_semanas;
    }

    public double getSueldo_semanal() {
        return sueldo_semanal;
    }

    public void setSueldo_semanal(double sueldo_semanal) {
        this.sueldo_semanal = sueldo_semanal;
    }

    public double getSueldo_final_semanal() {
        return sueldo_final_semanal;
    }

    public void setSueldo_final_semanal(double sueldo_final_semanal) {
        this.sueldo_final_semanal = sueldo_final_semanal;
    }
    
}
