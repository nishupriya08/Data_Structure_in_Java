package AlphaLectureQuestions.DataStructure.Sorting;

public class SelectionSorting {

    public static void selectionSorting(int array[]){
        for(int i=0; i< array.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j< array.length; j++){
                if(array[minPosition] > array[j]){
                    minPosition = j;
                }
            }
            //swap
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {3, 5, 1, 8, 2};
        selectionSorting(array);
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
