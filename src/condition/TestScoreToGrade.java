package condition;

import java.util.Objects;
import java.util.Scanner;

public class TestScoreToGrade {
    private static Scanner sc;
    private static int score;
    private static String grade;
    
    public static void main(String[] args) {
        getScore();
        if(score >= 0 && score <= 100) getGrade();
        
        System.out.println(Objects.toString(grade, ""));
    }
    private static void getScore() {
        sc = new Scanner(System.in);
        score = sc.nextInt();
        sc.close();
    }
    
    private static void getGrade() {
        switch(score / 10) {
            case 10: 
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
    }
}
