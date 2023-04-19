package AlphaLectureQuestions.DataStructure.Array;

public class SubArrays {
    public static void printSubarrays(int Array[]){
        //int ts=0;
        int sum=0;

        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[Array.length];
        prefix[0]=Array[0];
        for(int i=1; i< prefix.length; i++){
            prefix[i]=prefix[i-1]+Array[i];
        }
        for(int i=0; i< Array.length; i++) {
            int start = i;
            for (int j = i; j < Array.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                /*  for (int k = start; k <= end; k++){
                    System.out.print(Array[k]+" ");
                        sum+=Array[k];

                }   */
                //System.out.print("\nSum is: "+ sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                //ts++;
                //System.out.println();
            }
            //System.out.println();
        }

        //System.out.println("Total Subarray: "+ts);
        System.out.println("Maximum Subarray Sum : "+maxSum);

    }
    public static void main(String[] args) {
        int Array[]={1, -2, 6, -1, 3};
        printSubarrays(Array);
    }
}
