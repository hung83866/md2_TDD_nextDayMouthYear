package com.company;

public class DayMouthYear {

    public static final String gachNoi = "/";

    static String NextDay(int day, int month, int year) {
        int startOfMonth = 1;
        int lastOfMonth = getLastOfMonth(month,year);

        if (day == lastOfMonth) {
            day = startOfMonth;
            month++;
        } else {
            day++;
        }
        return day + gachNoi + month + gachNoi + year;
    }

    private static int getLastOfMonth(int month,int year) {
        int lastOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            case 2:
                lastOfMonth = inLeapYear(year);
        }
        return lastOfMonth;
    }

    private static int inLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            return 29;
        } else {
            return 28;
        }
    }
}
