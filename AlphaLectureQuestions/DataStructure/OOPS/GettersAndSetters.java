package AlphaLectureQuestions.DataStructure.OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pens p1=new Pens();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pens{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
