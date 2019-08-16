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
 * 36) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
* 
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)

El número -1 no contara como número.
 */
public class Ejercicio36_ResumenNumeros {
    
    public static void main(String[] args) {
        
        int number=0, max=0, min=0, sum=0, sumP=0, sumN=0, count=-1;
        float mean=0;
        
        do{
            if (min != 0 && max != 0){
                if (number > max){
                    max = number;
                }
                if (number < min) {
                    min = number; 
                }
            } else{
                min = number;
                max = number;
            }
            
            sum+=number;
            
            mean /= (float) sum;
            
            if(number>=0){
                sumP+=number;
            }else{
                sumN+=number;
            }
            
            count++;
            
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ",
                    "SUMMARY OF NUMBERS", JOptionPane.INFORMATION_MESSAGE));
            
        
        }while(number!=-1);
        
        mean = (float) sum/count;
        
        JOptionPane.showMessageDialog(null, "The maximun number is: "+max+ "\n"
                +"The minimum number is: "+min+"\n"
                +"The sum of all numbers is: "+sum+"\n"
                +"The sum of all positive numbers is: "+sumP+"\n"
                +"The sum of all negative numbers is: "+sumN+"\n"
                +"The mean of the sum of all numbers is: "+mean);
        
        
        

    }
    
  
}
