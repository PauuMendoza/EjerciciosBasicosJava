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
 * 16) Escribe una aplicación con un String que contenga una contraseña
 * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos.
 * Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo 
 * “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta 
 * sale, aunque le queden intentos).
 */
public class Ejercicio16_Contraseña_For {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        int tried=3;
        
        String pass="gato";
       
        for(int i=0;i<tried;i++){
            System.out.println("Enter a password: ");
            String pass2 = tec.nextLine(); 
            if(pass.equals(pass2)){
                System.out.println("Congratulations!!");
                break;
            }
            else{
                
            }
            
        }
        
        
        
      
       
           }
          
        
}  
        
        
        
