package AlphaLectureQuestions.DataStructure.OOPS;

public class SingleInheritance {
    public static void main(String[] args) {
        fish f=new fish();
        f.eats();;
        f.swims();
        f.fins=2;
        System.out.println(f.fins);
    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("eats...");
    }
    void breathes(){
        System.out.println("breaths...");
    }
}
class fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims..");
    }
}
