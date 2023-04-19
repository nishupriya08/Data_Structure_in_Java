package AlphaLectureQuestions.DataStructure.Array;

public class KadansAlgorithm {

    public static void kadansAlgorithm(int Array[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i< Array.length; i++){
            currSum+=Array[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println("Max subarrays sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int Array[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadansAlgorithm(Array);
    }
}
