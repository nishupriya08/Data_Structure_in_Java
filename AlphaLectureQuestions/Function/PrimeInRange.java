package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class PrimeInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
               return false;
        }
    }
        return true;

}

    public static void primeInRange(int range) {
        for(int i=2; i<=range; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=ob.nextInt();
        //System.out.println(isPrime(number));
        primeInRange(number);
    }
}
