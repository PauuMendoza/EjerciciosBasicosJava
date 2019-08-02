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
 * 27) Crear una aplicación que nos permite insertar números hasta que insertemos
 * un -1. Calcular el numero de números introducidos.
 */
public class Ejercicio27_ConteoNumeros_While {
    
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        
        int number, count = 0;
        
        System.out.println("Enter a number: ");
        number = imput.nextInt();
        
        while(number!=-1){
            count++;
            //System.out.println("Enter other number: ");
            number = imput.nextInt();

        }
         System.out.println("Thenumbers entered is: "+count);
        
      
    
    }
}