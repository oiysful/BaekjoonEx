package condition;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	System.out.println(compare(splitArgs(input)));
    	sc.close();
    	sc = null;
    }
    
    private static int[] splitArgs(String test) {
        String[] splits = test.split(" ");
        int[] integers = new int[2];
        integers[0] = Integer.parseInt(splits[0]);
        integers[1] = Integer.parseInt(splits[1]);
        
        return integers;
    }
    
    private static String compare(int[] integers) {
        if(integers[0] > integers[1] && integers[0] >= -10000 && integers[1] <= 10000) return ">";
        else if(integers[0] < integers[1] && integers[0] >= -10000  && integers[1] <= 10000) return "<";
        else if(integers[0] == integers[1] && integers[0] >= -10000  && integers[1] <= 10000) return "==";
        else return null;
    }
}
