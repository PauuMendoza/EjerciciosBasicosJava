/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 * 21) Muestra los números primos entre 1 y 100.
 */
public class Ejercicio21_SerieNumerosPrimos_For {
    
    public static void main(String[] args) {
        
        for(int i=0;i<=100;i++){
            
            int divisores=0;
            for(int j=1;j<=i;j++){
                
                if(i%j==0){
                    divisores++;
                }               
            }
            
            if(divisores==2){
                    System.out.println(i);
                }
        }
               
        }
        
    }
    

