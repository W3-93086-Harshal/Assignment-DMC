public class List {

    public class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public List(){
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void display(){
        Node trav = head;
        while (trav != null){
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }
    public void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addAfter(int data, int node){
        Node newNode = new Node(data);
        Node trav = head;

        while (trav != null){
            if (trav.data == node){
                newNode.next = trav.next;
                trav.next = newNode;
            }
            trav = trav.next;
        }
    }
    public void addBefore(int data, int node){
        Node newNode = new Node(data);
        Node trav = head;

        while (trav.next != null){
            if (trav.next.data == node){
                newNode.next = trav.next;
                trav.next = newNode;
                break;
            }
            trav = trav.next;
        }
    }
}