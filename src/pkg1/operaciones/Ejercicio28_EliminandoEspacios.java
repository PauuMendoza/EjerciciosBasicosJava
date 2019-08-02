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
 * 28) Eliminar los espacios de una frase pasada por consola por el usuario.
 */
public class Ejercicio28_EliminandoEspacios {
    
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog(null, "Enter a sentence: ","PHRASES", JOptionPane.INFORMATION_MESSAGE );
        word = word.replaceAll(" ", "");
        JOptionPane.showMessageDialog(null, word);
        
    }
    
}
