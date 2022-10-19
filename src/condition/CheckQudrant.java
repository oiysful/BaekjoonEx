package condition;

import java.util.Scanner;

public class CheckQudrant {
    private static Scanner sc;
    private static int x;
    private static int y;
    public static void main(String[] args) {
    	getValues();
        System.out.print(getQuadrant());
    }
    private static void getValues() {
        sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
    }
    private static boolean isValidateRange() {
        if(x >= -1000 && x <= 1000 && x != 0 && y >= -1000 && y <= 1000 && y != 0) return true;
        else return false;
    }
    private static String getQuadrant() {
    	if(isValidateRange()) {
    		if(x>0 && y>0) return "1";
    		else if(x<0 && y>0) return "2";
    		else if(x<0 && y<0) return "3";
    		else if(x>0 && y<0) return "4";
    	}
    	return "";
    }
}
