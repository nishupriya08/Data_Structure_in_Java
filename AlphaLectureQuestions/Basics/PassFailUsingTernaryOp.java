package AlphaLectureQuestions.Basics;

import java.util.Scanner;

public class PassFailUsingTernaryOp {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int marks = ob.nextInt();
        String type = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(type);
    }
}
