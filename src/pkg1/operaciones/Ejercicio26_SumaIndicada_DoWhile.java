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
 * 26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
 */
public class Ejercicio26_SumaIndicada_DoWhile {
    
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        
        int number, sum=0;
        
        do{
          System.out.println("Enter a number: ");
          number = imput.nextInt();
          
          if(number<=1){
              System.out.println("Enter a number positive");
          }   
        }while(!(number>=1));//condicion para salir
        for(int i=1;i<=number;i++){
            sum += i;

        }
        System.out.println("The sum of the numbers entered is: "+sum);

        
        
    }
    
}
