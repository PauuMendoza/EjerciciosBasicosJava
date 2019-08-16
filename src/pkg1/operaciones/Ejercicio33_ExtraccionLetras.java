/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 * 33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
 */
public class Ejercicio33_ExtraccionLetras {
    
    public static void main(String[] args) {
    
    String cadena= "Hola mundo";
         
        //CUIDADO: es 3 porque empieza en 0 las cadenas(cuarta letra)
        //el 5 es porque siempre hay que sumarle uno, ya que sino no mostraria lo que deseamos (quinta letra) 
        String subcadena = cadena.substring(3, 5);
      
        System.out.println(subcadena);
    
    
    }
}
