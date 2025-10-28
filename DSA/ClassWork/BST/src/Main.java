public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(8);
        bst.addNode(3);
        bst.addNode(10);
        bst.addNode(2);
        bst.addNode(15);
        bst.addNode(6);
        bst.addNode(14);
        bst.addNode(4);
        bst.addNode(7);

//        bst.DFSTraversal();
//        bst.BFSTraversal();

        bst.inOrder();
        bst.deleteNode(8);
        bst.inOrder();

//        bst.inOrder();
//        System.out.println("Height of BST : " + bst.height());
    }
}