package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoilingWaterTest {

    @Test
    public void testWaterBoiling() {
        BoilingWater obj = new BoilingWater();
        // Test case 1: Water temperature is above boiling point
        assertEquals("Water is boiling!", obj.isWaterBoiling(213));

        // Test case 2: Water temperature is at boiling point
        assertEquals("Water is boiling!", obj.isWaterBoiling(212));

        // Test case 3: Water temperature is below boiling point
        assertEquals("Water is not boiling yet!", obj.isWaterBoiling(200));
    }

}