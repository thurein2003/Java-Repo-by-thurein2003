package Revesion.OOP;

    class Book{
        private String ISBN;
        private String bookName;

        public void setISBN(String bNum){
            this.ISBN = bNum;
        }
        public String getISBN(){
            return ISBN;
        }

        public void setBookName(String bName){
            this.bookName = bName;
        }
        public String getBookName(){
            return bookName;
        }

        public void displayBookDetail(){
            System.out.println("Book Detail");
            System.out.println("Book Name : " + bookName);
            System.out.println("ISBN : " + ISBN);
        }

        public boolean checkBookDemage(int check){
            if (check == 1){
                return true;
            }else{
                return false;
            }
        }
    }

    class Member{
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
            System.out.println("Member Detail");
            System.out.println("Member ID : " + memID);
            System.out.println("Member Name : " + memName);
            System.out.println("Age : " + memAge);
        }
    }

public class ClassDiagramOne{
        public static void main(String[] args) {
            Member member = new Member();
            member.setMemID("12345");
            member.setMemName("John Doe");
            member.setMemAge(30);
            member.displayMemberDetail();
        }
    }
