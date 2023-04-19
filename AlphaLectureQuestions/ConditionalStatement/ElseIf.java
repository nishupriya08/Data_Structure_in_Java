package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int age=ob.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else if (age>=13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    }
}
