/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * Ejercicio 18: Pide por teclado dos numeros y genera 10 numeros aleatorios
 * entre esos numeros. Usa el metodo Matth.random para generar un número entero
 * aleatorio (recuerda el casting de double a int).
 * 
 */
public class Ejercicio18_NumerosAleatorios_For {
    
    public static void main(String[] args) {
        
        
        int num1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number one", "RANDOM NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        
        int num2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number two", "RANDOM NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        
        for(int i=1;i<=10;i++){
            int aleatorio = (int) (Math.random() * (num2-num1)+1);
                    System.out.println(aleatorio);

            
            
        }
        
      
 
    }
}   

