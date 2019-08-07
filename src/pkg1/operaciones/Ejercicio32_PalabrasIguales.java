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
 * 32) Pedir dos palabras por teclado, indicar si son iguales.
 */
public class Ejercicio32_PalabrasIguales {
    
    public static void main(String[] args) {
        
        String word1 = JOptionPane.showInputDialog(null, "Enter the first word: ", "EQUALS WORDS",
                JOptionPane.INFORMATION_MESSAGE);
        
         String word2 = JOptionPane.showInputDialog(null, "Enter the first word: ", "EQUALS WORDS",
                JOptionPane.INFORMATION_MESSAGE);
         
         if(word1.equals(word2)){
             JOptionPane.showMessageDialog(null, "The words are the same!!", "EQUALS WORDS",
                JOptionPane.INFORMATION_MESSAGE);
         }else{
             JOptionPane.showMessageDialog(null, "The words are differents!!", "EQUALS WORDS",
                JOptionPane.INFORMATION_MESSAGE);
         }
        
    }
    
}
