
public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Time Complexity Analysis:");
        System.out.println("1. Insert at beginning: O(1)");
        System.out.println("2. Insert at end: O(1)");
        System.out.println("3. Insert at position: O(n)");
        System.out.println("4. Delete from beginning: O(1)");
        System.out.println("5. Delete from end: O(n)");
        System.out.println("6. Delete from position: O(n)");
        System.out.println("7. Search: O(n)");
        System.out.println("8. Display: O(n)\n");

        System.out.println("Demonstrating position-based operations:");

        // Insert operations
        list.insertFirst(10);   // 10
        list.insertLast(20);    // 10 -> 20
        list.insertLast(30);    // 10 -> 20 -> 30
        list.display();

        // Insert at position
        list.insertAtPosition(15, 2);  // 10 -> 15 -> 20 -> 30
        list.display();

        list.insertAtPosition(25, 4);  // 10 -> 15 -> 20 -> 25 -> 30
        list.display();

        // Delete at position
        list.deleteAtPosition(2);      // 10 -> 20 -> 25 -> 30
        list.display();

        list.deleteAtPosition(3);      // 10 -> 20 -> 30
        list.display();

        // Test invalid positions
        list.insertAtPosition(40, 5);  // Invalid position
        list.deleteAtPosition(0);      // Invalid position
    }
}