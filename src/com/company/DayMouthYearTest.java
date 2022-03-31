package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayMouthYearTest {
    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Mouth1Year2021(){

        int day = 1;
        int month = 1;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "2/1/2021";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Mouth1Year2021(){

        int day = 31;
        int month = 1;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/2/2021";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 30/4/2021")
    void testDay30Mouth4Year2021(){

        int day = 30;
        int month = 4;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/5/2021";
        assertEquals(expected,result);
    }
}