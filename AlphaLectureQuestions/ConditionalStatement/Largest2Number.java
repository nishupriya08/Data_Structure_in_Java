package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class Largest2Number {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);
        int a = lar.nextInt();
        int b = lar.nextInt();
        int c = lar.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println("A is larger.");
                System.out.println("A is big.");
            } else {
                System.out.println("C is larger.");
            }
        } else {
            if (b >= c) {
                System.out.println("B is larger.");
            } else {
                System.out.println("C is larger.");
            }

        }
    }
}
