/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 * 24) Recorre el String del ejercicio 22 y transforma cada carácter a su código
 * ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.
 */
public class Ejercicio24_StringASCII_For {
    
    public static void main(String[] args) {
        
        String  word= "La lluvia en Sevilla es una maravilla";
        
        for(int i=0;i<word.length();i++){
            
            //char character = word.charAt(i);
            
             //int number = (char) character;
             
             //System.out.println(number);
             
             System.out.print((int)word.charAt(i)+" ");
            
        }
        
 
    }
}
    

