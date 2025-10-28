import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    static class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int value){
            data = value;
            left = right = null;
        }
    }
    private Node root;
    public BST(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void addNode(int value){
        Node newnode = new Node(value);
        if(root == null)
            root = newnode;
        else {
            Node trav = root;
            while(true){
                if(value < trav.data){
                    if(trav.left == null){
                    trav.left = newnode;
                    break;
                    }
                    else
                        trav = trav.left;
                }
                else {
                    if(trav.right == null){
                        trav.right = newnode;
                        break;
                    }
                    else
                        trav = trav.right;
                }
            }
        }
    }
    private  void inOrder(Node trav){
        if(trav == null)
            return;
        inOrder(trav.left);
        System.out.println(" "+ trav.data);
        inOrder(trav.right);
    }
    public void inOrder(){
        System.out.println("In Order : ");
        inOrder(root);
        System.out.println(" ");

    }
    public void deleteNode(int key){
        Node trav = root, parent = null;
        while(trav != null){
            if(key < trav.data)
                break;
            parent = trav;
            if(key < trav.data)
                trav = trav.left;
            else
                trav = trav.right;
        }
        if(trav == null)
            return;
        if(trav.left != null && trav.right != null){
            Node pred = trav.left;
            parent = trav;
            while(pred.right != null){
                parent = pred;
                pred = pred.right;
            }
            trav.data = pred.data;
            trav = pred;
        }
        if(trav.right != null){
            if(trav == root)
                root = trav.right;
            else if (trav == parent.left)
                parent.left =  trav.right;
            else if (trav == parent.right)
                parent.right = trav.right;
        }else{            //if(trav.left != null){
            if(trav == root)
                root = trav.left;
            else if(trav == parent.left)
                parent.left = trav.left;
            else if(trav == parent.right)
                parent.right = trav.left;
        }
    }
    public void DFSTraversal() {
        Stack<Node> st = new Stack<BST.Node>();
        System.out.print("DFS Traversal : ");
        st.push(root);
        while(!st.isEmpty()) {
            Node trav = st.pop();
            System.out.print(" " + trav.data);
            if(trav.right != null)
                st.push(trav.right);
            if(trav.left != null)
                st.push(trav.left);
        }
        System.out.println(" ");
    }
    public void BFSTraversal() {
        Queue<Node> q = new LinkedList<Node>();
        System.out.print("BFS Traversal : ");
        q.offer(root);		// push()
        while(!q.isEmpty()) {
            Node trav = q.poll();	// pop()
            System.out.print(" " + trav.data);
            if(trav.left != null)
                q.offer(trav.left);
            if(trav.right != null)
                q.offer(trav.right);
        }
        System.out.println("");
    }
    private int height(Node trav){
        if(trav == null)
            return -1;
        int hl = height(trav.left);
        int hr = height(trav.right);
        int max = Math.max(hl,hr);
        return max + 1;
    }
    public int height(){
        return height(root);
    }
    public void deleteAll(){
        root = null;
    }
}