package session9;
import session7.ListNode;

public class StackUsingLinkList {
    private ListNode head;

    public StackUsingLinkList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        ListNode node = new ListNode(data);
        node.setNext(head);
        head = node;
    }

    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int data = head.getData();
        head = head.getNext();
        return data;
    }

}
