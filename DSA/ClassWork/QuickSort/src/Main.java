import java.util.Arrays;

public class Main {
    public static void quickSort(int arr[], int left , int right){
        if (left >= right)
            return;
        int i = left, j = right;
        while (i < j){
            for(; i <= right && arr[i] <= arr[left]; i++);
            for( ; arr[j] > arr[left] ; j--);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        quickSort(arr, left, j-1);
        quickSort(arr, j+1, right);
    }
    public static void main(String[] args) {
        int arr[]={66, 33, 99, 11, 77, 22, 55};

        System.out.println("Array Before Sorting :"+ Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println("Array After Sorting "+Arrays.toString(arr));

    }
}