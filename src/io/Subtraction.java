package io;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        Integer result = sum(splitInput(input));
        System.out.println(result);
    }
    
    private static int[] splitInput(String input) {
        String[] strArr = input.split(" ");
        int[] rtnArr = new int[2];
        rtnArr[0] = Integer.parseInt(strArr[0]);
        rtnArr[1] = Integer.parseInt(strArr[1]);
        
        return rtnArr;
    }
    
    private static Integer sum(int[] input) {
        if(input[0] < 0 || input[1] > 10) return null;
        else return input[0] - input[1];
    }
}
