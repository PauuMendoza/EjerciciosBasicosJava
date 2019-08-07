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
 * 31) Mostrar la longitud de una cadena.
 */
public class Ejercicio31_LongitudCadena {
    
    public static void main(String[] args) {
        
        String chain = "hola mundo";
        int count = 0;
        
        for(int i=0;i<chain.length();i++){
            count++;    
        }
        JOptionPane.showMessageDialog(null, "The length of the chain is: "+count+" characters",
                "CHAIN", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
//  System.out.println("La cadena tiene "+cadena.length()+" caracteres");