package calNextDay;

import java.util.Arrays;

public class NextDay {
    public static void main(String[] args) {
        int[] date = new int[]{30, 2, 2020};
        int[] next;
        next = calNext(date[0],date[1],date[2]);
        System.out.println(Arrays.toString(date));
        System.out.println(Arrays.toString(next));
    }
    public static int[] calNext(int day, int month, int year){

        int daysCount = dayInMonth(month, year);
        int[] result = new int[3];

        if (day>daysCount){
            System.out.println("Nhập sai ngày");
            result[0]= 0;
            result[1]= month;
            result[2]= year;
            return result;
        }
        if (month > 12 && month < 1){
            System.out.println("Nhập sai tháng");
            result[0]= day;
            result[1]= 0;
            result[2]= year;
            return result;
        }
        if (year<0){
            System.out.println("Nhập sai năm");
            result[0]= day;
            result[1]= month;
            result[2]= 0;
            return result;
        }
        if (day < daysCount){
            day = day + 1;
        }
        if (day == daysCount){
            day = 1;
            if (month == 12){
                month = 1;
                year++;
            }else {
                month = month + 1;
            }
        }
        result[0]= day;
        result[1]= month;
        result[2]= year;
        return result;
    }

    private static int dayInMonth(int month, int year) {
        int daysCount = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysCount = 31;
                break;
            case 2:
                if (isLeapYear(year)){
                    daysCount = 29;
                }else daysCount = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysCount = 30;
                break;
        }
        return daysCount;
    }

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if(isDivisibleBy4) {
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        return leapYear;
    }
}
