public class LinkNote {
    private int element;
    private Node next;
    
    public Node(int data){
        element = data;
        next = null;
    }

    public void link(node newNode){
        next = newNode;
    }

    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
        one.link(two);
    }


}
