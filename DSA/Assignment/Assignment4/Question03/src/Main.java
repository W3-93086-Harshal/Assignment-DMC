
public class Main {


    public static int binarySearch(int[] arr , int key){
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        System.out.println(binarySearch(arr, 22));

    }
}