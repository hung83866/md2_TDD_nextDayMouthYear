package com.company;

public class DayMouthYear {

    public static final String gachNoi = "/";

    static String NextDay(int day, int month, int year){
        int lastOfMonth = 31;
        int startOfMonth = 1;
        int lastOfMonth30day = 30;
        if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12) {
            if (day == lastOfMonth) {
                day = startOfMonth;
                month++;
            } else {
                day++;
            }
        }else {
            if (day == lastOfMonth30day) {
                day = startOfMonth;
                month++;
            } else {
                day++;
            }
        }
        return day + gachNoi + month + gachNoi + year;
    }
}
