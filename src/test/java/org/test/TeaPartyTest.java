package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaPartyTest {

    @Test void TestTeaParty(){

        TeaParty objTea = new TeaParty();
        assertEquals(1, objTea.teaParty(6,8));
        assertEquals(0, objTea.teaParty(3,8));
        assertEquals(2, objTea.teaParty(20,6));
        assertEquals(2, objTea.teaParty(12  ,6));
        assertEquals(1, objTea.teaParty(11,6));
        assertEquals(0, objTea.teaParty(11,4));
        assertEquals(0, objTea.teaParty(4,5));
        assertEquals(1, objTea.teaParty(5,5));
        assertEquals(1, objTea.teaParty(6,6));
        assertEquals(2, objTea.teaParty(5  ,10));
        assertEquals(1, objTea.teaParty(5,9));
        assertEquals(0, objTea.teaParty(10,4));
        assertEquals(2, objTea.teaParty(10,20));




    }

}