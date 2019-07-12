/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class Ejercicio10_MostrarNumerosWhile {
    
    public static void main(String[] args) {
        
        int numeros=0;
        
        while(true){
            numeros++;
            System.out.println(numeros);
            if(numeros==100){
                break;
            }
        } 
        
        
    }
    
}
