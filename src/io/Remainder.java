package io;

import java.util.Scanner;

public class Remainder {
    private static Scanner sc;
    private static int a;
    private static int b;
    private static int c;
    
    public static void main(String[] args) {
        getInt();
        
        if(checkValues()) printResult();
    }
    
    private static void getInt() {
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
    }
    
    private static boolean checkValues() {
        return (a>=2 && a<=10000 && b>=2 && b<=10000 && c>=2 && c<=10000);
    }
    
    private static void printResult() {
        System.out.printf("%d\n%d\n%d\n%d", (a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c);
    }
}
