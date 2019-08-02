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
 * 23) Reemplaza todas las a del String anterior por una e.
 * “La lluvia en Sevilla es una maravilla”
 */
public class Ejercicio23_ReemplazaVocales {
    
    public static void main(String[] args) {
        
       String word="La lluvia en Sevilla es una maravilla";
       
       word = word.replace('a', 'e');
       
       JOptionPane.showMessageDialog(null, word, "VOWEL REPLACEMENT", JOptionPane.INFORMATION_MESSAGE);
       
        
      
        
        
       
        
    }
    
}
