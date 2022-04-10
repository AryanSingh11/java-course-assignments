package Arrays.Sorting.BubbleSorting;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int arr[]={15,14,13,11,10,12,11,10};
        ///int arr[]={10,11,13,14,14,14,16};
        System.out.println(Arrays.toString(Bubble(arr)));
    }
    public static int[] Bubble(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j <=arr.length-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
