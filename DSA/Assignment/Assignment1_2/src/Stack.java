import java.util.Arrays;

public class Stack {
    private int [] arr;
    private int top;
    private final int SIZE;

    public Stack(int size){
        SIZE = size;
        arr = new int[size];
        top = size;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            System.out.println(Arrays.toString(arr));
        }
        else{
            top--;
            arr[top] = value;
            System.out.println(Arrays.toString(arr));
        }
    }

    public int pop(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            temp = arr[top];
            top++;
            System.out.println(Arrays.toString(arr));
        }
        return temp;
    }

    public int peek(){
        int temp = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            temp = arr[top];
        }
        return temp;
    }

    public boolean isEmpty(){
        return top == SIZE;
    }

    public boolean isFull(){
        return top == 0;
    }
}