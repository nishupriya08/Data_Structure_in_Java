package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int number = ob.nextInt();
        switch(number){
            case 1: System.out.println("Samosa");
                    break;
            case 2: System.out.println("Momos");
                    break;
            case 3: System.out.println("Burger");
                    break;
            default: System.out.println("We realize we are dreaming.");
        }
    }
}
