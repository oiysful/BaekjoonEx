package io;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        Double result = calc(splitInput(input));
        System.out.println(result);
    }
    
    private static double[] splitInput(String input) {
        String[] strArr = input.split(" ");
        double[] rtnArr = new double[2];
        rtnArr[0] = Double.parseDouble(strArr[0]);
        rtnArr[1] = Double.parseDouble(strArr[1]);
        
        return rtnArr;
    }
    
    private static Double calc(double[] input) {
        if(input[0] < 0 || input[1] > 10) return null;
        else return input[0] / input[1];
    }
}
