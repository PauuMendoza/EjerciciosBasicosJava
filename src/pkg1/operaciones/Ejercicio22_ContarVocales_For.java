/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 * 22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta 
 * cuantas vocales hay en total (recorre el String con charAt).
 */
public class Ejercicio22_ContarVocales_For {
    
    public static void main(String[] args) {
 
        String word="La lluvia en Sevilla es una maravilla";
        int count = 0;
        
        for(int i=0; i<word.length();i++){
            
            char character = word.charAt(i);
            
            if(character=='a'|| character=='e'|| character=='i'|| character=='o'||
                    character=='u'){
                count ++;
            }        
       }
        JOptionPane.showMessageDialog(null, "The number the vowels is: "+count, "VOWELS", JOptionPane.INFORMATION_MESSAGE);
       
        
        
      
           
       

}}
