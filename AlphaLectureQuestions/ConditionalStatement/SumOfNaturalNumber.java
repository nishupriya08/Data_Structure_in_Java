package AlphaLectureQuestions.ConditionalStatement;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the range value:");
        int range=ob.nextInt();
        int start=1;
        int sum=0;
        while(start<=range){
            sum=sum+start;  //sum+=start;
            start++;
        }
        System.out.println(sum);
    }
}
