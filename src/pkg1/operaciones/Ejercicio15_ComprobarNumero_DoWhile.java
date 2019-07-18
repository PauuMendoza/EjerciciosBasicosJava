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
 * 15) Lee un número por teclado y comprueba que este numero es mayor o igual
 * que cero, si no lo es lo volverá a pedir (do while), después muestra ese 
 * número por consola.
 */
public class Ejercicio15_ComprobarNumero_DoWhile {
    
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        
        int number;
        
        do{
            System.out.println("Enter a number: ");
            number = enter.nextInt();               
  
        }while(number<0);
        System.out.println("The number is: "+ number);
            
        }
        
        }
    
        


