public class List {
    public static class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public boolean isEmpty(){
        return head == null;
    }
    public void addSorted(int data){
        Node newNode = new Node(data);

        Node trav;
        if(head == null || head.data > data){
            newNode.next = head;
            head = newNode;
        }
        else{
            trav = head;
            while(trav.next != null && trav.next.data < data){
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
    }
    public void display(){
        Node trav = head ;
        while(trav != null ){
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
    }
}