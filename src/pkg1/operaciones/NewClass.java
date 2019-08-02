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
 */
public class NewClass {
    
    public static void main(String[] args) {
         
        String texto=JOptionPane.showInputDialog(null, 
                                                "Inserta una frase", 
                                                "Inserción", 
                                                JOptionPane.INFORMATION_MESSAGE);
         
        //usado para almacenar el texto final
        String texto_sin_espacios="";
         
        char caracterActual;
         
        //recorro el array
        for(int i=0;i<texto.length();i++){
             
            caracterActual=texto.charAt(i);
             
            //Cuando es un espacio no lo copia a la cadena
            if(caracterActual!=' '){
                texto_sin_espacios+=String.valueOf(caracterActual);   
            }
             
        }
         
         JOptionPane.showMessageDialog(null, 
                                      "La frase tiene sin espacios es "+texto_sin_espacios, 
                                      "Resultado", 
                                      JOptionPane.INFORMATION_MESSAGE);
         
    }
    
}
