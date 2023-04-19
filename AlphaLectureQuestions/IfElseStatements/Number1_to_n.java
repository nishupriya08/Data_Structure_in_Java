package AlphaLectureQuestions.IfElseStatements;

import java.util.Scanner;

public class Number1_to_n {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter d value of n:");
        int n=ob.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("Task Done.!!");
    }
}
