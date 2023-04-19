package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class UsingContinueKeywrd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        do{
            System.out.println("Enter ur number");
            int num=ob.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }while(true);

    }
}
