class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node tail;  // Only tail pointer, no head pointer

    public CircularLinkedList() {
        tail = null;
    }

    // Insert at beginning - O(1)
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        System.out.println("Inserted " + data + " at the beginning");
    }

    // Insert at end - O(1)
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;  // New node
            tail.next = newNode;       // Old tail
            tail = newNode;
        }
        System.out.println("Inserted " + data + " at the end");
    }
    public void deleteFirst() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (tail.next == tail) {  // Only one node
            System.out.println("Deleted " + tail.data);
            tail = null;
        } else {
            System.out.println("Deleted " + tail.next.data);
            tail.next = tail.next.next;  // Skip the first node
        }
    }

    // Delete from end - O(n)
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (tail.next == tail) {  // Only one node
            System.out.println("Deleted " + tail.data);
            tail = null;
        } else {
            Node current = tail.next;
            // Traverse until we find the second-to-last node
            while (current.next != tail) {
                current = current.next;
            }
            System.out.println("Deleted " + tail.data);
            current.next = tail.next;  // Point second-to-last to first
            tail = current;            // Update tail
        }
    }

    // Search for an element - O(n)
    public boolean search(int data) {
        if (tail == null) {
            return false;
        }

        Node current = tail.next;  // Start from first node
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    // Display the list - O(n)
    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;  // Start from first node
        System.out.print("List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to start)");
    }
}
