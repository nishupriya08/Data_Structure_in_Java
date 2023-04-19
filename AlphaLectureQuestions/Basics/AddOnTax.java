package AlphaLectureQuestions.Basics;

import java.util.Scanner;

public class AddOnTax {
    public static void main(String[] args) {
        Scanner tax=new Scanner(System.in);
        int item1=tax.nextInt();
        int item2=tax.nextInt();
        int item3=tax.nextInt();
        int total=item1+item2+item3;
        System.out.println("Total amount:" +total);
        
        //Add on - 18% tax
        float newTotal=total+(0.18f *total);
        System.out.println(newTotal);
    }
}
