/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * 34) Dada una frase, separarlo en palabras.
 */
public class Ejercicio34_SeparandoPalabras_Split_Array {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter a chain of text: ");
        String chain = input.nextLine();
        
        System.out.println("*****THE CHAIN SEPARATE IS: *****");
        String[] array = chain.split(" ");
        
        // En este caso cada array es una palabra
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
           
  
    }
    
}
            
