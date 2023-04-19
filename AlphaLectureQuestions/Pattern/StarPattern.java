package AlphaLectureQuestions.Pattern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Enter number of row: ");
        Scanner ob=new Scanner(System.in);
        int number=ob.nextInt();
        for(int line=1;line<=number;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
