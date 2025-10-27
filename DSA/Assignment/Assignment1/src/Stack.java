public class Stack {
    private int arr[];
    private int top;
    private final int SIZE;

    public Stack(int size){
        this.SIZE =size;
        arr = new int[size];
        top = -1;
    }


    public void push(int data){
        if(top == SIZE-1){
            System.out.println("Stack Is Full");
        }
        else{
            //a. reposition top
            top++;
            //b. add value at top index
            arr[top] = data;
        }
    }

    public int pop(){
        int temp = -1;
        if(top == -1){
            System.out.println("Stack Is Empty");
        }
        else{
            temp = arr[top];
            top--;
        }
        return temp;
    }

    public int peek(){
        int temp = -1;
        if(top == -1){
            System.out.println("Stack Is Empty");
        }
        else{
            temp = arr[top];
        }
        return temp;
    }


    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }
}