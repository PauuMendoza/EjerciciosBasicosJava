/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * 13) Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan 
 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo 
 * que se repite y lo que no.
 */
public class Ejercicio13_NumeroVentas_For {
    
    public static void main(String[] args) {
        
        Scanner tec=new Scanner(System.in);
        
        
        int sum=0;
        
        //System.out.println("Enter the sales number: ");
        //sales = tec.nextInt();
        
        String sales = JOptionPane.showInputDialog(null, "Enter the sales number:");
        int sales2 = Integer.parseInt(sales);
            for(int i=1;i<=sales2;i++){
                //System.out.println("Enter the value of the sale: ");
                //value = tec.nextInt();
                String value = JOptionPane.showInputDialog(null, "Enter the value of the sale");
                int value2 = Integer.parseInt(value);
              sum+= value2;  
                
                
            }
            //System.out.println("the sum of the solds is "+sum);
            JOptionPane.showMessageDialog(null, "the sum of the sold is: "+sum + "$");
        }  
}
