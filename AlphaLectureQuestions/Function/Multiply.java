package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class Multiply {
    public static int multiply(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int num1=ob.nextInt();
        int num2=ob.nextInt();

        int Result = multiply(num1, num2);
        System.out.println("Multplication of a and b: "+Result);

        Result = multiply(10, 50);
        System.out.println("Multplication of a and b: "+Result);
    }
}
