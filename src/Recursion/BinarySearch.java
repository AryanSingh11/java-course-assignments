package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={21,34,56,68,79,80,89,93,97};
        int target=80;
        System.out.println( search(arr, target, 0, arr.length-1));

    }

//notice that the return type is int, so we have to be careful with returning values in search function.
    static int search(int[] arr, int target, int s, int e){

        int m= s + (e-s)/2;

        if(s>e){
            return -1;
        }

        if(arr[m]==target){
            return m;
        }

        if(arr[m]<target){
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);

    }
}
