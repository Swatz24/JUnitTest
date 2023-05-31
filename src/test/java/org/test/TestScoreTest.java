package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestScoreTest {
    @Test
    public void testTestScore() {
        TestScore object = new TestScore();
        // Test case 1: Score is 95
        assertEquals("A", object.testScore(95));

        // Test case 2: Score is 82
        assertEquals("B", object.testScore(82));

        // Test case 3: Score is 73
        assertEquals("C", object.testScore(73));

        // Test case 4: Score is 62
        assertEquals("D", object.testScore(62));

        // Test case 5: Score is 50
        assertEquals("F", object.testScore(50));

        // Test case 6: Score is 110 (outside the valid range)
        assertEquals("Error", object.testScore(110));

        // Test case 7: Score is 60
        assertEquals("D", object.testScore(60));
    }
}