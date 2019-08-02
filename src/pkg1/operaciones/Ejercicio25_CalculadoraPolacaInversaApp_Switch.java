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
 * 25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 
 * operandos (int) y un signo aritmético (String), según este último se realizara 
 * la operación correspondiente. Al final mostrara el resultado en un cuadro de
 * dialogo.

Los signos aritméticos disponibles son:

    +: suma los dos operandos.
    -: resta los operandos.
    *: multiplica los operandos.
    /: divide los operandos, este debe dar un resultado con decimales (double)
    ^:  1º operando como base y 2º como exponente.
    %:  módulo, resto de la división entre operando1 y operando2.

 */
public class Ejercicio25_CalculadoraPolacaInversaApp_Switch {
    
    public static void main(String[] args) {
        
        double resultado=0;
        
        String operation = JOptionPane.showInputDialog(null, "Choise an option of the menu: \n"
        +"1. +\n"
        +"2. -\n"
        +"3. *\n"
        +"4. /\n"
        +"5. a^b\n"
        +"6. %" , "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number one: ", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE));
        double num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number two: ", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE));
        char caracter = operation.charAt(0);
        
        switch(caracter){
            case '+':
                resultado= num1+num2;
                break;
                
            case '-':
                resultado= num1-num2;
                break;
                
            case '*':
                resultado= num1*num2;
                break;
                
            case '/':
                resultado= num1/num2;
                break;
                
            case '^':
                resultado= Math.pow(num1, num2);
                break;
                
            case '%':
                resultado= num1%num2;
                break; 
          
        }
        JOptionPane.showMessageDialog(null, num1+" "+caracter+" "+num2+" = "+resultado, "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
