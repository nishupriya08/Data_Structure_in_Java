package AlphaLectureQuestions.DataStructure.Array;


public class LargestNumber {
    public static int largestNumber(int Array[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<Array.length; i++){
            if(largest<Array[i]){
                largest=Array[i];
            }
            if(smallest>Array[i]){
                smallest=Array[i];
            }
        }
        System.out.println("Smallest Number is : "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int Array[]={1,2,6,3,5};
        int largest=largestNumber(Array);
        System.out.println("Largest Number is : "+ largest);
    }
}
