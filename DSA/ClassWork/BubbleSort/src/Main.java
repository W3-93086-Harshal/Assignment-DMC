import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void bubbleSort(int arr[], int N){
        int passes= 0, comp=0;
        for (int i = 1; i < N;i++){
            passes++;
            for (int j = 0; j < N-i; j++){
                comp++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("No of passes : " + passes);
        System.out.println("No of comp : " + comp);
    }
    public static void main(String[] args) {
        int arr[]={33, 22, 66, 55, 44, 11};
        System.out.println("Array Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr ,arr.length);
        System.out.println("Array after Sorting :  " +Arrays.toString(arr));

    }
}