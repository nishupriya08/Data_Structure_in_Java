package AlphaLectureQuestions.IfElseStatements;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner oe=new Scanner(System.in);
        int a=oe.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
