package AlphaLectureQuestions.Function;

public class FunOverloadUsingDataTypes {

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(sum(2,9));
        System.out.println(sum(2.5f, 5.0f));
    }
}
