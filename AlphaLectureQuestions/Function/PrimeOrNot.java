package AlphaLectureQuestions.Function;

import java.util.Scanner;

public class PrimeOrNot {

    //Only for n>=2
    /*  public static boolean PrimeOrNot(int n){
        boolean isPrime=true;

        //corner cases...2
          if(n==2){
              return isPrime;
          }
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;  //Replace it with... return false and remove isPrime
               // return isPrime;
            }
        }return isPrime;
    }
*/

    public static boolean PrimeOrNot(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int number=ob.nextInt();
        System.out.println(PrimeOrNot(number));
    }
}
