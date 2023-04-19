package AlphaLectureQuestions.DataStructure.Array;

public class Pairs {

    public static void printPairs(int Array[]){
        int tp=0;
        for(int i=0; i< Array.length; i++){
            int current=Array[i];   //2 4 6 8 10
            for (int j=i+1; j< Array.length; j++){
                System.out.print("("+ current+","+Array[j]+")");
                tp++;
            }
            System.out.println();


        }
        System.out.println("Total Pairs: "+tp);
    }
    public static void main(String[] args) {
        int Array[]={2, 4, 6, 8, 10};
        printPairs(Array);
    }

}
