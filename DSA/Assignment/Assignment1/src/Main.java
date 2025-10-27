public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        Stack stack = new Stack(10);

        for( int n : arr) {
            System.out.print( n + "  ");
            stack.push(n);
        }

        for(int i = 0; i < arr.length; i++) {
            int n = stack.pop();
            arr[i] = n;
        }

        System.out.println();

        for( int n : arr) {
            System.out.print( n + "  ");
        }


    }
}