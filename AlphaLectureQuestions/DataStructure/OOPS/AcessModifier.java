package AlphaLectureQuestions.DataStructure.OOPS;

public class AcessModifier {
    public static void main(String[] args) {
        BankAcc myAcc=new BankAcc();
        myAcc.username="Nishu";
        System.out.println(myAcc.username);
        myAcc.setPassword("abscdft");
        // System.out.println(myAcc.password);
        //We only change d password but can't print or access d password because of private access modifier.
    }
}
class BankAcc{
    public String username;
    private String password;

    public void setPassword(String pwd){
        this.password=pwd;
    }


}
