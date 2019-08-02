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
 * 29) Pedir al usuario que nos escriba frases de forma infinita hasta que 
 * insertemos una cadena vacia. Mostrar la cadena resultante
 */
public class Ejercicio29_FrasesInfinitas_DoWhile {
    
    public static void main(String[] args) {
        
        String phrase, cadena="";
        
        do{
            phrase = JOptionPane.showInputDialog(null, "Enter a sentence: ", "INFINITE PHRASES", JOptionPane.INFORMATION_MESSAGE);
            cadena += phrase;
        }
        while(!(phrase.equals("")));
        JOptionPane.showMessageDialog(null, "The infinite phrase is: "+cadena, "INFINITE PHRASES", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}

