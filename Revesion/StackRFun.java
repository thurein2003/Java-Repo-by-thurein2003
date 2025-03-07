import java.util.Stack;

public class StackRFun { //Class 
    public static void main(String[] args) {
        Stack<String> book = new Stack<String>();
        book.push("Apple");         // -|
        book.push("Samsaung");      // -| are Objects

        System.out.print(book);
        book.pop();
        System.out.print(book);
    }


}
