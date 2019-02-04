/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_testing_exercises;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;
import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hallur
 */
public class Unit_Testing_Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public boolean getsMortgage(double salary){
        if(salary > 1000 && salary < 75000){
            return true;
        } return false;
    }
    
    public boolean isEven(int number){
        if(number >= 1 && number <= 1000){
            if(number%2==0){
            return true;
            } else {
                return false;
            }
        } return false;
    }
    
    public int getNumDaysInMonth(int month, int year){
        if((month >= 0 && month <= 12) && year >= 0 && year <= Integer.MAX_VALUE){
            YearMonth ym = YearMonth.of(year, Month.of(month));
            return ym.lengthOfMonth();
        } return 0;
    }
    
}
