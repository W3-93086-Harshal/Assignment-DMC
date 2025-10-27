
public class Main {

    public static int nthOccuranceLinearSearch(int[] arr , int key, int n){

        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){

            if (arr[i] == key){
                count++;
            }
            if (count == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,1,5,6,7,8,9,10};

        System.out.println(nthOccuranceLinearSearch(arr, 5, 1));
        System.out.println(nthOccuranceLinearSearch(arr, 5, 2));
        System.out.println(nthOccuranceLinearSearch(arr, 1, 3));
        System.out.println(nthOccuranceLinearSearch(arr, 1, 4));

    }
}