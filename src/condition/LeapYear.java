package condition;

import java.util.Scanner;

public class LeapYear {
    private static Scanner sc;
    private static int year;
    
    public static void main(String[] args) {
        getYear();
        printResult();
    }
    private static void getYear() {
        sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();
    }
    private static boolean isLeapYear() {
        if((year % 4 == 0) && ((year%100 != 0) || (year%400 == 0))) return true;
        else return false;
    }
    private static void printResult() {
        if(year >= 0 && year <= 4000) {
            System.out.print(
                isLeapYear() ? 1 : 0
            );
        }
    }
}
