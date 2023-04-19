package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int input = ob.nextInt();
        int reverse=0;
        for ( ;input > 0; ) {

            int lastdigit = input % 10;
            reverse=reverse * 10+lastdigit;
            input = input / 10;
        }
        System.out.println(reverse);
    }
}
