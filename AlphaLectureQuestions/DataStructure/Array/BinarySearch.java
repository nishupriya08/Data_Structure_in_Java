package AlphaLectureQuestions.DataStructure.Array;

public class BinarySearch {

    public static int binarySerach(int Array[], int key){
        int start=0, end=Array.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comparisons:
            if(Array[mid]==key){        //found
                return mid;
            }
            if(Array[mid]>key){     //left
                end=mid-1;
            }else{
                start=mid+1;    //right
            }
            /* if(Array[mid]<key){  //right
                start=mid+1;
            }   */
        }
        return -1;
    }
    public static void main(String[] args) {

        int Array[]={2, 4, 6, 8, 10, 12, 14};
        int key=4;

        System.out.println("index for key is : "+binarySerach(Array, key));
    }
}
