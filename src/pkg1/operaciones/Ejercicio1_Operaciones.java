/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 */
public class Ejercicio1_Operaciones {

    /**
     * @param args the command line arg
     * 1) Declara dos variables numéricas (con el valor que desees), muestra por
     * consola la suma, resta, multiplicación, división y módulo (resto de la división).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=10;
        int n2=5;
        
        int suma= n1+n2;
        int resta= n1-n2;
        int mult= n1*n2;
        int division= n1/n2;
        int modulo= n1%n2;
        
        System.out.println("La suma de n1 y n2 es: "+suma);
        System.out.println("La resta de n1 y n2 es: "+resta);
        System.out.println("La multiplicacion de n1 y n2 es: "+mult);
        System.out.println("La division de n1 y n2 es: "+division);
        System.out.println("El modulo de n1 y n2 es: "+modulo);
    }
    
}
