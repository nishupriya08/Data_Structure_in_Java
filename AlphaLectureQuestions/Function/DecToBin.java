package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class DecToBin {
    public static int decToBin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int lastDigit=n%2;
            bin = bin + (lastDigit * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter only Decimal: ");
        int number=ob.nextInt();
        System.out.println(decToBin(number));
    }
}
