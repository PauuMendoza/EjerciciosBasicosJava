/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 */
public class NewClass {
       public static void main(String[] args) {
 
        int num=1;
 
        //Definimos el bucle, incluye el 100
        while (num<=100){
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
            //Incrementamos num
            num++;
        }
    }
    
}
