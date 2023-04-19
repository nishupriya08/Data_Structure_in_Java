package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class Swapping {


    public static void swap(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("a = "+num1);
        System.out.println("b = "+num2);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a= ob.nextInt();
        int b=ob.nextInt();

/*      int temp=a;
        a=b;
        b=temp;


        System.out.println("a = "+a);
        System.out.println("b = "+b);*/
        swap(a,b);


    }
}
