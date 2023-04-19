package AlphaLectureQuestions.DataStructure.OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog doggy=new Dog();
        doggy.legs=4;
        System.out.println(doggy.legs);
        doggy.breathes();
    }
}
class Animals{
    String color;
    void eats(){
        System.out.println("eats...");
    }
    void breathes(){
        System.out.println("breaths...");
    }
}
class Mammal extends Animals{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
