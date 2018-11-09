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
        //Decalracion de variables y objetos
        Scanner entrada = new Scanner(System.in);
        //Ejercicio 1 Empleado
        System.out.println("EJERICIO 1");
        Empleado e = new Empleado("Luis", "Benitez", "1101101", 5002.2);
        System.out.println(e);
        //Ejercicio 2 Empleado por horas
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("EJERCICIO 2");
        EmpleadoPorHoras e1 = new EmpleadoPorHoras(15, 20.2, "Israel", "Andrade", "19007512", 50);
        System.out.println(e1);
        //Ejercicio 3 Empleado por horas
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("EJERCICIO 3");
        EmpleadoFijo e2 = new EmpleadoFijo(300.2, 10, "Ana", "Diaz", "10022811", 52);
        System.out.println(e2);
    }
}
