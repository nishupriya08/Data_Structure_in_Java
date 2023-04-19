package AlphaLectureQuestions.DataStructure.OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);
    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
}
