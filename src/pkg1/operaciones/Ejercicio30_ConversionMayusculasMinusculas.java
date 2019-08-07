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
 * 30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que 
 * el usuario lo pida y mostraremos el resultado por pantalla.
 */
public class Ejercicio30_ConversionMayusculasMinusculas {
    
    public static void main(String[] args) {
        String [] botones = { "Mayusculas", "Minusculas"};
        
        String phrase = JOptionPane.showInputDialog(null, "Enter a phrase: ", "CONVERSION",
                JOptionPane.INFORMATION_MESSAGE);
        
        int operation = JOptionPane.showOptionDialog (null, "Choise an option of the menu:", 
                "CONVERTER", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/,
                botones, botones[0]);
        
        boolean mayus;
        mayus= (operation==JOptionPane.YES_OPTION);
        
        if(mayus){
            JOptionPane.showMessageDialog(null, phrase.toUpperCase(), "CONVERSION", 
                        JOptionPane.INFORMATION_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null, phrase.toLowerCase(), "CONVERSION", 
                        JOptionPane.INFORMATION_MESSAGE);     
        }
       

        
    }
    

}