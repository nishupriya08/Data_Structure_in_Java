package AlphaLectureQuestions.DataStructure.OOPS;

public class TypeOfConstructor {
    public static void main(String[] args) {
        Students s1=new Students();
        //Students s2=new Students("Nishu");
        //Students s3=new Students(123);
        s1.name="Nishu";
        System.out.println(s1.name);
        s1.roll=123;
        System.out.println(s1.roll);
    }
}
class Students{
    String name;
    int roll;
    Students(){
        System.out.println("Constructor is called...");
    }
    Students(String name){
        this.name=name;
    }
    Students(int roll){
        this.roll=roll;
    }
}
