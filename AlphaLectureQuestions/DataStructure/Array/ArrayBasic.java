package AlphaLectureQuestions.DataStructure.Array;

import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int Arr[] = new int[size];
        System.out.println("Enter array input of type integer : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("Length of array: "+ Arr.length);
    }
}
