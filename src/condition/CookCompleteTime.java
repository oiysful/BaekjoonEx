package condition;

import java.util.Calendar;
import java.util.Scanner;

public class CookCompleteTime {
    private static Scanner sc;
    private static Calendar cal;
    private static int beforeHour;
    private static int beforeMin;
    private static int runTime;
    
    public static void main(String[] args) {
        System.out.println(printEndTime());
    }
    private static void getInstances() {
        sc = new Scanner(System.in);
        beforeHour = sc.nextInt();
        beforeMin = sc.nextInt();
        runTime = sc.nextInt();
        sc.close();
    }
    private static boolean isValidateValues() {
        if(beforeHour >= 0 && beforeHour <= 23 &&
           beforeMin >= 0 && beforeMin <= 59 &&
           runTime >= 0 && runTime <= 1000)
            return true;
        else
            return false;
    }
    private static void setTime() {
        cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, beforeHour);
        cal.set(Calendar.MINUTE, beforeMin);
    }
    private static String printEndTime() {
    	getInstances();
    	if(isValidateValues()) {
    		setTime();
    		cal.add(Calendar.MINUTE, runTime);
    		return cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE);
    	} else {
    		return "";
    	}
    }
}
