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
 * 14) Realiza una aplicación que nos calcule una ecuación de segundo grado.
 * Debes pedir las variables a, b y c por teclado y comprobar antes que el 
 * discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el 
 * método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 */
public class Ejercicio14_EcuacionSegundoGrado {
    
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        double  x1, x2;
        
        String a = JOptionPane.showInputDialog(null, "Enter the value of a: ", "A second grade equation",JOptionPane.INFORMATION_MESSAGE);
        double valueA = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(null, "Enter the value of b: ", "A second grade equation",JOptionPane.INFORMATION_MESSAGE);
        double valueB = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog(null, "Enter the value of c: ", "A second grade equation",JOptionPane.INFORMATION_MESSAGE);
        double valueC = Double.parseDouble(c);
        //System.out.println("Enter the value of a: ");
        //a = tec.nextInt();
        //System.out.println("Enter the value of b: ");
        //b = tec.nextFloat();
        //System.out.println("Enter the value of c: ");
        //c = tec.nextFloat();
        
        
        x1 = -valueB + Math.sqrt(Math.pow(valueB, 2) - 4*valueA*valueC)/2*valueA;
        x2 = -valueB - Math.sqrt(Math.pow(valueB, 2) - 4*valueA*valueC)/2*valueA;
        
        //System.out.println("The solution for x1 is: " +x1);
        //System.out.println("The solution for x2 is: " +x2);
        
        JOptionPane.showMessageDialog(null,"The solution for x1 and x2 is: " + x1 + "y"+ x2, "RESULT",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
