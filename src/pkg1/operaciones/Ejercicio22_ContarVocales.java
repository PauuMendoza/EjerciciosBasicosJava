/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author 
 * 22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta 
 * cuantas vocales hay en total (recorre el String con charAt).
 */
public class Ejercicio22_ContarVocales {
    
    public static void main(String[] args) {
        
        String palabra="hola";
        String caracter ="";
        int contador = 0;
        
        
        //char caracter = palabra.charAt(0);
        
       for (int i = 0; i < palabra.length(); i++) {
           
           if(palabra.charAt( i)=='l'){
               
               contador++;
               
           }
           
           if (contador != 0) {
System.out.println(contador);
}else{
System.out.println("El caracter no se encuentra en este texto");
}
       }
           
       

}}
