package AlphaLectureQuestions.DataStructure.Sorting;

public class BubbleSorting {

    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length-1; turn++) {         //turn < array.length
            for (int j = 0; j < array.length - 1- turn; j++) {      //j = 1; j < array.length-turn
                if (array[j] > array[j + 1]) {                      //array[j] > array[j-1]
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {-1, 0, 2, 9, 1};
        bubbleSort(array);
        for(int i=0; i< array.length; i++) {
            System.out.println(array[i]+ " ");
        }


    }
}
