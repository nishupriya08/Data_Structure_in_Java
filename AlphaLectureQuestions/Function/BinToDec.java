package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class BinToDec {
    public static int binToDec(int n){
        int dec=0;
        int pow=0;

        //for(int i=0;i<n;i++){
        while(n>0){
            int lastdigit=n%10;
            dec= dec+  (lastdigit* (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int number=ob.nextInt();
        int Result=binToDec(number);
        System.out.println(Result);
    }

}
