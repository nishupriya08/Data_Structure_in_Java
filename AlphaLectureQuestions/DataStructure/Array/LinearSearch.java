package AlphaLectureQuestions.DataStructure.Array;

public class LinearSearch {
    public static int linearSearch(int Array[], int key){
        key=22;
        for(int i=0; i<Array.length; i++){
            if(Array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array[]={2,4,6,8,10,12,14,16};
        int key=22;
        int index=linearSearch(Array, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index : "+index);
        }
    }
}
