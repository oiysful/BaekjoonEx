package condition;

import java.util.Calendar;
import java.util.Scanner;

public class EarlyAlram {
    private static Scanner sc;
    private static Calendar cal;
    private static int hour;
    private static int min;
    public static void main(String[] args) {
        getTimeInstances();
        if(isValidateTime()) {
            setTime();
            printCalcTime();
        }
    }
    private static void getTimeInstances() {
        sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        sc.close();
    }
    private static boolean isValidateTime() {
        if(hour >= 0 && hour <= 23 && min >= 0 && min <= 59) return true;
        else return false;
    }
    private static void setTime() {
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, min);
    }
    private static void printCalcTime() {
        cal.add(Calendar.MINUTE, -45);
        System.out.print(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE));
    }
}
