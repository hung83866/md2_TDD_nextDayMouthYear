package com.company;

public class DayMouthYear {

    public static final String gachNoi = "/";

    static String NextDay(int day, int mouth, int year){
        if (day == 31){
            return "1"+ gachNoi + ++mouth + gachNoi+year;
        }else return ++day+ gachNoi +mouth+gachNoi+year;
    }
}
