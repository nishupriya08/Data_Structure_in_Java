package AlphaLectureQuestions.Pattern;

import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        System.out.println("Enter number of row: ");
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        for (int line = 1; line <= a; line++) {
            for (int star = 1; star <= a - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
