package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter only positive number: ");
        int number=ob.nextInt();
        int Result=factorial(number);
        System.out.println("Factorial of "+ number +": "+ Result);
    }
}
