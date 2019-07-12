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
 * 8) Modifica el ejercicio anterior, para que en lugar de pedir un número, 
 * pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Ejercicio8_ASCCI_DOS {
    
    public static void main(String[] args) {
        
        String caracter = JOptionPane.showInputDialog(null, "Ingresa un caracter: ");
        
        char ascii = caracter.charAt(0);
        
        int numero = (char) ascii;
        
        JOptionPane.showMessageDialog(null, "El codigo ascci es: "+numero);
        
    }
    
}
