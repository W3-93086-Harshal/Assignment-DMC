public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr);

        Stack stack = new Stack(arr.length);

        // Step 1: Push all elements to stack
        for (int num : arr) {
            stack.push(num);
            // printArray(arr);
        }

        // Step 2: Pop all elements back to array (this reverses it)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
            printArray(arr);
        }

        System.out.println("\nReversed Array:");
        printArray(arr);
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}