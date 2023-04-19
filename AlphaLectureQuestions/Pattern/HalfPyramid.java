package AlphaLectureQuestions.Pattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int a=ob.nextInt();
        for(int line=1;line<=a;line++){
            for(int star=1;star<=line;star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
