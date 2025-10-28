public class List {
    public static  class Node{
        private int data ;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public List(){
        head = head;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Added "+data+" to list");
    }
    public void display(){
        Stack st = new Stack();
        Node temp  = head;
        Node t = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        for(int i = 0 ; t != null ; i++){
            System.out.print(st.pop()+" ");
            t = t.next;
        }
    }
}
class Stack{

    private int arr[];
    private int top ;

    public Stack(){
        arr = new int[10];
    }
    public void push(int data){
        if(top == arr.length-1){
            System.out.println("Stack is full");
        }
        else  {
            top++;
            arr[top] = data;
        }
    }
    public int pop(){
        int temp = -1;
        if(top == 0){
            System.out.println("Stack is empty");
        }
        else{
            temp = arr[top];
            top --;
        }
        return temp;
    }
}