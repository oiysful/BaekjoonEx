package io;

import java.util.Scanner;

public class CheckChessPiecies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();
        int[] result = calculate(conversion(input));
        String print = "";
        for(int cnt : result) {
            print += cnt + " ";
        }
        System.out.print(print.trim());
    }
    private static int[] conversion(String[] input) {
        int[] conArr = new int[6];
        for(int i=0; i<input.length; i++) {
            conArr[i] = Integer.parseInt(input[i]);
        }
        return conArr;
    }
    private static int[] calculate(int[] input) {
        input[0] = 1-input[0];
        input[1] = 1-input[1];
        input[2] = 2-input[2];
        input[3] = 2-input[3];
        input[4] = 2-input[4];
        input[5] = 8-input[5];
        
        return input;
    }
}
