package Arrays.Sorting.SelectionSorting;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[]arr={-21,67,89,-45};
        //selection(arr);
        System.out.println(Arrays.toString(selection(arr)));
    }

    public static int[] selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-1-i;
            int maxElement=getMaxElement(arr, 0, last);
            swap(arr, maxElement,last);
        }
        return arr;
    }

    public static int getMaxElement(int[]arr, int start, int end){
        int max=0;
        for (int i = start; i <= end ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    public static int[] swap(int[]arr, int first, int second){
        //swapping first and second
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;

        return arr;
    }
}
