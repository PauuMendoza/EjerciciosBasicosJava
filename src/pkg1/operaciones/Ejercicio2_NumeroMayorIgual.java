/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

/**
 *
 * @author Paulina
 * 2) Declara 2 variables numéricas (con el valor que desees), he indica cual 
 * es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los
 * valores para comprobar que funciona.
 */
public class Ejercicio2_NumeroMayorIgual {
    
    
     public static void main(String[] args) {
          // TODO code application logic here
        int p=50;
        int t=40;
        
        if(p>t){
            System.out.println("P es mayor que t");
        }
        else if(p<t){
            System.out.println("ingresa otro numero");
        }
        else{
            System.out.println("p es igual a t");
        }
    
}
}