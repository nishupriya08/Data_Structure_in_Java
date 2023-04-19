package AlphaLectureQuestions.IfElseStatements;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        if(num==2){
            System.out.println(num+" is prime.");
        }else{
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(num+" is Prime");
            }else{
                System.out.println(num+" is not prime.");
            }
        }
    }
}
