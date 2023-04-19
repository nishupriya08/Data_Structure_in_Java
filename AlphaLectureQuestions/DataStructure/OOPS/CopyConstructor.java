package AlphaLectureQuestions.DataStructure.OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
        School s1=new School();
        s1.name="Nishu";
        s1.roll=123;
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;

        School s2=new School(s1);     //copy constructor
        s1.marks[2]=100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class School{
    String name;
    int roll;
    int marks[];


    // School(School s1){      //shallow copy constructure
    // this.name=s1.name;
    // this.roll=s1.roll;
    // this.marks=s1.marks;
    //}


    School(School s1){      //deep copy constructor
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    School(){
        marks=new int[3];
        System.out.println("Constructor is called...");
}
    School(String name){
        marks=new int[3];
        this.name=name;
    }
    School(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}
