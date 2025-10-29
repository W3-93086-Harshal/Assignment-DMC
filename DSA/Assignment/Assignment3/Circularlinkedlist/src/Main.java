public class Main {
    public static void main(String[] args) {
        // Demonstration of all operations with time complexities
        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Time Complexity Analysis:");
        System.out.println("1. Insert at beginning: ");
        System.out.println("2. Insert at end: ");
        System.out.println("3. Delete from beginning: O(1)");
        System.out.println("4. Delete from end: O(n) ");
        System.out.println("5. Search: O(n) ");
        System.out.println("6. Display: O(n) ");

        System.out.println("Demonstrating operations:");

        // Insert operations
        list.insertFirst(10);  // 10
        list.display();

        list.insertLast(20);   // 10 -> 20
        list.display();

        list.insertFirst(5);   // 5 -> 10 -> 20
        list.display();

        list.insertLast(30);   // 5 -> 10 -> 20 -> 30
        list.display();

        // Search operation
        System.out.println("Searching for 20: " + list.search(20));
        System.out.println("Searching for 40: " + list.search(40));

        // Delete operations
        list.deleteFirst();    // 10 -> 20 -> 30
        list.display();

        list.deleteLast();     // 10 -> 20
        list.display();
    }
}