/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_testing_exercises;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hallur
 */
public class Unit_Testing_ExercisesTest {
    @Test
    public void testGetsMortgage() {
        System.out.println("getsMortgage");
        double salary = 1000.0;
        Unit_Testing_Exercises instance = new Unit_Testing_Exercises();
        boolean expResult = false;
        boolean result = instance.getsMortgage(salary);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsEven() {
        System.out.println("isEven");
        int number = 0;
        Unit_Testing_Exercises instance = new Unit_Testing_Exercises();
        boolean expResult = false;
        boolean result = instance.isEven(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNumDaysInMonth() {
        System.out.println("getNumDaysInMonth");
        int month = 2;
        int year = 2019;
        Unit_Testing_Exercises instance = new Unit_Testing_Exercises();
        int expResult = 28;
        int result = instance.getNumDaysInMonth(month, year);
        assertEquals(expResult, result);
    }
    
}
