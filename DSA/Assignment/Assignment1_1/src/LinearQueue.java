import java.util.Arrays;

public class LinearQueue {
    private int arr[];
    private int rear;
    private int front;
    private final int SIZE;

    public LinearQueue(int size){
        SIZE = size;
        arr = new int[size];
        rear = front = 0;
    }

    public void push(int data ){
        if(isFull()){
            System.out.println("Queue is full");
            System.out.println(Arrays.toString(arr));
        }
        else{
            arr[rear] = data;

            rear ++;
            System.out.println(Arrays.toString(arr));
        }
    }

    public int pop(){
        int temp = 0;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            temp = arr[front];
            front ++;
            if(front == rear)
                front = rear = 0;
        }
        return temp;
    }

    public int peek(){
        int temp = 0;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            temp = arr[front];
        }
        return temp;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public boolean isFull(){
        return rear == SIZE;

    }
}