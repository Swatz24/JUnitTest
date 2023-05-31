package org.test;

import org.junit.jupiter.api.Test;
import org.test.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTest(){
        SimpleCalculator calc = new SimpleCalculator();
        // check 2 + 2 equals 4. ( Since 2 * 2 also equals 4, we should add more test cases to test the addition operation)
        assertEquals(4, calc.add(2,2));
        // Test case 2: a = -5, b = 10
        assertEquals(5, calc.add(-5, 10));

        // Test case 3: a = 0, b = 0
        assertEquals(0, calc.add(0, 0));

        // Test case 4: a = 100, b = -50
        assertEquals(50, calc.add(100, -50));

        assertEquals(17, calc.add(14,3));
    }

}