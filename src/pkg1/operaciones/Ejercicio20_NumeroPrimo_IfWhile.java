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
 * 20) Pide un número por teclado e indica si es un número primo o no. Un número
 * primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
 * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si
* es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
public class Ejercicio20_NumeroPrimo_IfWhile {
    
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = imput.nextInt();
        
        if(num!=1){
        int num2 = num-1;
        
        
        while(num%num2!=0){
            num2--;
        }
            if(num2==1){
                System.out.println(+num+" It`s a prime number");
            }else{
                System.out.println(+num+" It is not a prime number");
            }
        }
        
    }
        
        
        }
   
    
    
    

