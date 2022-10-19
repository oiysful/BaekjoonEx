package io;

import java.util.Scanner;

public class CompositeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        printCalc(extract(input));
    }
    
    private static Integer[] extract(String input) {
        String[] strArr = input.split(" ");
        Integer[] intArr = new Integer[2];
        intArr[0] = Integer.parseInt(strArr[0]);
        intArr[1] = Integer.parseInt(strArr[1]);
        if(intArr[0] < 1 || intArr[1] > 10000) return null;
        else return intArr;
    }
    
    private static void printCalc(Integer[] input) {
        System.out.println(input[0] + input[1]);
        System.out.println(input[0] - input[1]);
        System.out.println(input[0] * input[1]);
        System.out.println(input[0] / input[1]);
        System.out.println(input[0] % input[1]);
    }
}
