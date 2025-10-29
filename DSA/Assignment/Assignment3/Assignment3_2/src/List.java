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

    // Get size of list - O(n)
    private int getSize() {
        if (tail == null) return 0;

        int count = 1;
        Node current = tail.next;
        while (current != tail) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Insert at beginning - O(1)
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;  // Point to itself in case of first node
        } else {
            newNode.next = tail.next;  // New node points to first node
            tail.next = newNode;       // Tail points to new node
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
            newNode.next = tail.next;  // New node points to first node
            tail.next = newNode;       // Old tail points to new node
            tail = newNode;            // Update tail to new node
        }
        System.out.println("Inserted " + data + " at the end");
    }

    // Insert at position - O(n)
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position. Position must be positive.");
            return;
        }

        int size = getSize();
        if (position > size + 1) {
            System.out.println("Invalid position. List size is " + size);
            return;
        }

        if (position == 1) {
            insertFirst(data);
            return;
        }

        if (position == size + 1) {
            insertLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = tail.next;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Inserted " + data + " at position " + position);
    }

    // Delete from beginning - O(1)
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
            while (current.next != tail) {
                current = current.next;
            }
            System.out.println("Deleted " + tail.data);
            current.next = tail.next;  // Point second-to-last to first
            tail = current;            // Update tail
        }
    }

    // Delete from position - O(n)
    public void deleteAtPosition(int position) {
        if (position <= 0) {
            System.out.println("Invalid position. Position must be positive.");
            return;
        }

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        int size = getSize();
        if (position > size) {
            System.out.println("Invalid position. List size is " + size);
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        if (position == size) {
            deleteLast();
            return;
        }

        Node current = tail.next;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        System.out.println("Deleted " + current.next.data + " from position " + position);
        current.next = current.next.next;
    }

    // Search for an element - O(n)
    public boolean search(int data) {
        if (tail == null) return false;

        Node current = tail.next;
        do {
            if (current.data == data) return true;
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

        Node current = tail.next;
        System.out.print("List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to start)");
    }
}
