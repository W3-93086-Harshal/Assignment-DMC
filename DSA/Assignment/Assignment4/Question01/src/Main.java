
public class Main {


    public static int  linearSerach( int[] arr , int key){

        int count = 0;
        for (int i =  arr.length -1; i >= 0 ; i--){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

       int i = linearSerach( new int[]{1,1,1,1,5,6,7,8,9,10} , 1);
       System.out.println(i);
    }
}