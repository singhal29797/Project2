package session9;

public class StackUsingArray {

    private int arr[];
    private int capacity;
    private int index;

    public StackUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        index = -1;

    }
    public boolean isEmpty(){
        return index == -1;
    }

    public boolean iSFull(){
        return index == capacity - 1;
    }
    public void push(int data){
        //if stack is full
        if(iSFull()){
            System.out.println("Stack is full can't add anymore");
        }
        arr[++index] = data;   //0(1)
    }

    public int pop(int data){
        //if stack is empty
        if(isEmpty()){
            System.out.println("Stack is Empty can't pop anymore");
        }
        return arr[index--];     //0(1)
    }

    public int peek(){
        //if stack is empty
        if(isEmpty()){
            System.out.println("Stack is Empty can't pop anymore");
        }
        return arr[index];      //0(1)
    }
}