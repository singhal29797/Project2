package session9;

public class QueueUsingArray {

    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public QueueUsingArray(int capacity){
        this.capacity = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return (front + 1)%capacity == rear;
    }

    public void enQueue(int data){
        if(isEmpty()){
            System.out.println("can't enqueue as it's already full");
        }
        front = (front+1)%capacity;
        arr[front] = data;
    }

    public int deQueue(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int data = arr[rear];

        boolean lastElement = false;
        if(front == rear){
            lastElement = true;
        }
        rear = (rear+1)%capacity;

        if(lastElement){
            front = -1;
            rear = -1;
        }
        return data;
    }
}
