package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class TernaryOddEven {
    public static void main(String[] args) {
        Scanner ln=new Scanner(System.in);
        int number=ln.nextInt();

        //ternary operator
        String type = ((number%2) == 0) ? "EVEN" : "ODD";
        System.out.println(type);

    }
}
