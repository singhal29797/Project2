package session7;

public class LinkListImpliment {
    public static void main(String[] args) {


        // define LinkedList
        //LinkList is the collection of listNode

        ListNode node1 = new ListNode(14);
        ListNode node2 = new ListNode(25);
        ListNode node3 = new ListNode(36);
        ListNode node4 = new ListNode(47);
        ListNode node5 = new ListNode(58);

        // now it forms he LinkList
        node1.setNext(node2);    // head = node1
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);    // tail = node5


        //traverse(node1);
        //System.out.println("Length from head is : "+len(node1));
        //System.out.println("The node you search is present : "+ isNodePresent(node1,3));
        //updateNode(node1, 47, 7 );
        System.out.println("Middle of the LinkList in one pass is : "+findMidFast(node1));
    }


    public static void traverse(ListNode head) {

        // Boundary Checks
        if (head == null) {
            return;
        }
        System.out.print("Traversing is : ");
        // 1--> 2 --> 3 --> 4 --> 5
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " --> ");  // 1, 2, 3, 4, 5
            temp = temp.getNext();   // 2, 3, 4, 5
        }
        System.out.println();
    }


    public static int len(ListNode head) {

        // Boundary Checks
        if(head == null){
            return 0;
        }

        int count = 0;
        ListNode temp = head;
        while(temp != null){     // 1,2,3,4,5
            count++;   // 5
            temp = temp.getNext();    //2,3,4,5,null
        }
        return count;    //5c

    }


    public static boolean isNodePresent(ListNode head, int data) {

        // Boundary Checks
        if(head == null){
            return false;
        }

        ListNode temp = head;
        while(temp != null){
            if(temp.getData() == data){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }


    public static void updateNode(ListNode head, int originalNode, int newNode ) {

        // Boundary Checks
        if(head == null){
            return ;
        }
        System.out.print("Updated node is : ");
        ListNode temp =head;
        while(temp != null){
            if(temp.getData() == originalNode){
                temp.setData(newNode);
            }

            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }
        System.out.println();
    }


    public static ListNode findMidFast(ListNode head) {

        // Boundary Checks
        if(head == null || head.getNext() == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (head != null && fast != null && fast.getNext() != null){
            slow = slow.getNext();    // slow is moving one step

            fast = fast.getNext().getNext();    // fast is moving two step
        }
        return slow;
    }


    /*public static void insertNode(ListNode head, int position,int newNode) {

        // Boundary Checks
        int count = 0;
        if(head == null){
            return ;
        }

        ListNode temp = head;
        while( temp != null && count < position) {
            temp = temp.getNext();
            position++;
        }
        temp = temp.setNext(temp.getNext());
        temp.setNext(newNode);
        }

    }*/
}
