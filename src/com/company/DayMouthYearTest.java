package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayMouthYearTest {
    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Mouth1Year2021(){

        int day = 1;
        int mouth = 1;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,mouth,year);
        String expected = "2/1/2021";
        assertEquals(expected,result);
    }

}