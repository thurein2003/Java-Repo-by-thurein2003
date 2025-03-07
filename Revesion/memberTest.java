package Revesion;

public class memberTest {
    private String memID;
    private String memName;
    private int memAge;

    public void setMemID(String mNum){
        this.memID = mNum;
    }

    public String getMemID(){
        return memID;
    }

    public void setMemName(String mName){
        this.memName = mName;
    }

    public String getMemName(){
        return memName;
    }

    public void setMemAge(int mAge){
        this.memAge = mAge;
    }

    public void displayMemberDetail(){
        System.out.println("Your ID : " + memID);
        System.out.println("Your Name : " + memName);
        System.out.println("Your Age : " + memAge);
    }

    public static void main(String[] args) {
        memberTest member = new memberTest();

        member.setMemID("6731501110");
        member.setMemName("Thu Rein Oo");
        member.setMemAge(21);

        member.displayMemberDetail();
    }
}
