package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class SumOfTwoNumberUsingPara {

    public static int Sum(int a, int b){        //Parameters and formal parameters
        /* Scanner so=new Scanner(System.in);
        int num1=so.nextInt();
        int num2=so.nextInt(); */
        int sum=a+b;
        //System.out.println("Sum is: "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int num1=so.nextInt();
        int num2=so.nextInt();
        int Result=Sum(num1, num2);     //Arguments and actual parameters
        System.out.println("Sum is: "+Result);
    }
}
