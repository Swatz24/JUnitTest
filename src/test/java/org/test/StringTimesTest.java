package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {

    @Test void testStringTimes(){
        StringTimes strObj = new StringTimes();
        assertEquals("HiHi" , strObj.stringTimes("Hi", 2));
        assertEquals("HiHiHi" , strObj.stringTimes("Hi", 3));
        assertEquals("Hi" , strObj.stringTimes("Hi", 1));
        assertEquals("" , strObj.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi" , strObj.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!" , strObj.stringTimes("Oh Boy!", 2));
        assertEquals("xxxxx" , strObj.stringTimes("x", 5));
        assertEquals("" , strObj.stringTimes("", 5));
        assertEquals("hellohello" , strObj.stringTimes("hello", 2));
        assertEquals("goodgoodgoodgood" , strObj.stringTimes("good", 4));



    }

}