package Arrays.Sorting.InsertionSorting;

import java.util.Arrays;

public class InsertionSortingAlgo {
    public static void main(String[] args) {
        int []arr={5,3,4,1,2};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }

    public static int[] InsertionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }
            }
        }
        return arr;
    }

    public static int[] swap(int[]arr, int first, int second){
        //swapping first and second
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;

        return arr;
    }
}
