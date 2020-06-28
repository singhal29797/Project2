package session7;

public class DoublyLinkList {

    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    Node head, tail=null;

    public void operation(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail =node;
            head.prev=null;
            head.next=null;
        }
        else{
            head.prev= node;
            node.next= head;
            node.prev = null;
            head = node;
            head.prev = null;
            tail.next = null;

        }
        System.out.print(data + "    ");  // 1, 2, 3, 4, 5

    }

    public static void main(String[] args) {
        DoublyLinkList dll= new DoublyLinkList();
        dll.operation(1);
        dll.operation(2);
        dll.operation(3);
        dll.operation(4);
        dll.operation(5);
    }
}
