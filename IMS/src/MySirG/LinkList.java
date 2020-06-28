package MySirG;

public class LinkList {

    public static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(" "+ temp.getData());
            temp = temp.getNext();
        }

    }

    /*public void insertAtFirst(int val){
        if(head == null){          // empty node
            return;
        }
        Node node = new Node();       // non-empty node
        node.setData(val);
        node.setNext(start);
        size++;
    }



    public void insertAtLast(int val){
        if(head == null) {          // empty node
            return;
        }
        Node node = new Node;
        Node temp;
        node.setData(val);
        temp = start;
        while(temp.getNext() != null){
            temp = temp.getNext();
            temp.setNext(node);
            size++;

        }

    }*/
}

