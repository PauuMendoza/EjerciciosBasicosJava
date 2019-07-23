/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * Ejercicio 19: 19) Pide por teclado un número entero positivo (debemos controlarlo)
 * y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250,
 * nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas 
 * cifras, al mostrar el mensaje.
 */
public class Ejercicio19_CifrasNumeroPositivo_Switch {
    
     public static void main(String[] args) {
         
         int cifras=0;
         
         int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "FIGURES",JOptionPane.INFORMATION_MESSAGE));
         
         if(num>0){
         while(num!=0){
            num/=10;
            cifras++;
         }
         
         JOptionPane.showMessageDialog(null, "The number of figures is: "+cifras, "FIGURES",JOptionPane.INFORMATION_MESSAGE);
         
        }
         else{
             JOptionPane.showMessageDialog(null, "The number is negative, please enter a positive number", "FIGURES",JOptionPane.INFORMATION_MESSAGE);
             
         }
    
         
    }
}