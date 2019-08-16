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
 * 35) Crea un enum con los días de la semana, pide un día de la semana e indica
 * si es laboral o no (en el main).
 */
public class Ejercicio35_DiasSemana_Enum_Switch {
    
    enum DayofWeek
{
    MONDAY, TUESDAY, WEDNESDAY, THUSRDAY, FRIDAY, SATURDAY, SUNDAY;
}
    
    public static void main(String[] args) {
        
        String day = JOptionPane.showInputDialog(null, "Enter a day of the week: ", 
                "DAY OF THE WEEK", JOptionPane.INFORMATION_MESSAGE);
        
        DayofWeek days = DayofWeek.valueOf(day.toUpperCase());
        
        
        switch(days){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THUSRDAY:
            case FRIDAY:
                
                JOptionPane.showMessageDialog(null, "The day "+day.toLowerCase()+" is laboral",
                        "DAY OF THE WEEK", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case SATURDAY:
            case SUNDAY:   
                
                JOptionPane.showMessageDialog(null, "The day "+day.toLowerCase()+" is a rest day",
                        "DAY OF THE WEEK", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            
        }
    }
    
}
