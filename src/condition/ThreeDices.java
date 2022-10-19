package condition;

import java.util.Scanner;

public class ThreeDices {
    private static Scanner sc;
    private static int first;
    private static int second;
    private static int third;
    
    public static void main(String[] args) {
    	getValues();
    	if(isContinue()) {
    		System.out.println(getResult());
    	}
    }
    private static void getValues() {
        sc = new Scanner(System.in);
        first = sc.nextInt();
        second = sc.nextInt();
        third = sc.nextInt();
        sc.close();
    }
    private static boolean isDiceNumber(int number) {
        if(number >= 1 && number <= 6) return true;
        else return false;
    }
    private static boolean isContinue() {
        if(isDiceNumber(first) && isDiceNumber(second) && isDiceNumber(third))
            return true;
        else
            return false;
    }
    private static int getResult() {
    	if(first == second && first == third)
    		return 10000 + first * 1000;
    	else if(first == second || first == third)
    		return 1000 + first * 100;
    	else if(second == third)
    		return 1000 + second * 100;
    	else
    		return Math.max(Math.max(first, second), third) * 100;
    }
}
