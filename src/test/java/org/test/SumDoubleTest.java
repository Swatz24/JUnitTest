package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

  @Test
   void sumTest(){
      SumDouble sumObj = new SumDouble();
      assertEquals(3, sumObj.sumDouble(1,2));
     assertEquals(5, sumObj.sumDouble(3,2));
     assertEquals(8, sumObj.sumDouble(2,2));
     assertEquals(-1, sumObj.sumDouble(-1,0));
     assertEquals(12, sumObj.sumDouble(3,3));
     assertEquals(0, sumObj.sumDouble(0,0));
     assertEquals(1, sumObj.sumDouble(0,1));
     assertEquals(7, sumObj.sumDouble(3,4));

   }

}