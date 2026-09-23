package linkedList;

public class LinkedListImpl {

    public static void main(String[] args) {

        Node head = new Node(0);
        head.next = new Node(1);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}

class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}





