/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_java;

import java.util.Scanner;

/**
 *
 * @author isral
 */
public class Leccion_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner entrada = new Scanner(System.in);
        Empleado e = new Empleado();
        EmpleadoFijo e1 = new EmpleadoFijo();
        EmpleadoPorHoras e2 =  new EmpleadoPorHoras();
        EmpleadoSemanal e3 = new EmpleadoSemanal();
        System.out.println("EJERCICIO 1");
        e.setNombre("Luis");
        e.setApellido("Benitez");
        e.setCedula("1000101");
        System.out.println(e);
        
        System.out.println("EJERCICIO 2");
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        e1.setNombre(nombre);
        e1.setApellido("Andrade");
        e1.setCedula("1900531");
        e1.se
    }
    
}
