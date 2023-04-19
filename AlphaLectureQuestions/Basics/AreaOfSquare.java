package AlphaLectureQuestions.Basics;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        int side=ar.nextInt();
        int area=side*side;
        System.out.println("Area:" +area);
    }
}
