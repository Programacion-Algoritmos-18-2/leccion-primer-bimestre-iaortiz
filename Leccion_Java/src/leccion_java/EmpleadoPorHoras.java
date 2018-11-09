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
public class EmpleadoPorHoras extends Empleado {
    //Declaraciòn de variables
    int numero_horas;
    double valor_horas;
    //Constructor
    public EmpleadoPorHoras() {
    }
    //Constructor con herencia

    public EmpleadoPorHoras(int numero_horas, double valor_horas, String nombre, String apellido, String cedula, double comision) {
        super(nombre, apellido, cedula, comision);
        this.numero_horas = numero_horas;
        this.valor_horas = valor_horas;
    }

    EmpleadoPorHoras(int i, double d, double comision, String rael, String andrade, String string, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    //Metodos gets y sets de las variables
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
    //Metood para sacar el sueldo del numero de horas por el valro de cada una
    public double calcularSueldoFinal() {
        double valor = this.numero_horas * this.valor_horas;
        valor += super.getComision();
        return valor;
    }
    //Metodo To String y presentacion de datos por defecto
    @Override
    public String toString() {
        return String.format("%s\nNumero de horas: %d\nValor de horas: %.2f\nSueldo Final: %.2f", super.toString(), numero_horas, valor_horas, calcularSueldoFinal());
        //return "EmpleadoPorHoras{" + "numero_horas=" + numero_horas + ", valor_horas=" + valor_horas + ", sueldo_final_horas=" + sueldo_final_horas + '}';
    }

}
