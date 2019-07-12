/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
 * Si no lo es, también debemos indicarlo.
 */
public class Ejercicio6_NumeroDivisibleEntreDos {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        int numero= tec.nextInt();
        
        int modulo = numero%2;
        //System.out.println(modulo);
        
        if(modulo==0){
            System.out.println("Es divisible entre 2");        
        }
        else{
            System.out.println("No es divisible entre dos");
        }
        
    }
    
}
