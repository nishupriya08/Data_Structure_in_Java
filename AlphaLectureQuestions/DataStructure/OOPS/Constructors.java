package AlphaLectureQuestions.DataStructure.OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        //Student s1=new Student("Nishu");
        //System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("contructor called....");
    //Student(String name){
    //    this.name=name;
    }
}
