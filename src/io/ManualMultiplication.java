package io;

import java.util.Scanner;

public class ManualMultiplication {
    private static Scanner sc;
    private static int first;
    private static String second;
    private static int[] explodedNum;
    
    public static void main(String[] args) {
        getInput();
        
        if(first < 1000 && second.length() == 3) {
        	explodedNum = explode();
        	printResult();
        }
    }
    
    private static void getInput() {
        sc = new Scanner(System.in);
        first = sc.nextInt();
        second = sc.next();
        sc.close();
    }
    
    private static int[] explode() {
        int[] rtn = new int[3];
        rtn[0] = Integer.parseInt(second.substring(second.length()-1, second.length()));
        rtn[1] = Integer.parseInt(second.substring(second.length()-2, second.length()-1));
        rtn[2] = Integer.parseInt(second.substring(second.length()-3, second.length()-2));
        return rtn;
    }
    
    private static void printResult() {
        for(int num : explodedNum) {
            System.out.println(first * num);
        }
        System.out.println(first * Integer.parseInt(second));
    }
}
