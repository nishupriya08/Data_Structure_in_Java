package AlphaLectureQuestions.Pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter d row: ");
        int a=ob.nextInt();
        char ch='A';
        for(int line=1;line<=a;line++){
            for(int star=1;star<=line;star++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
