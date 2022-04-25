package Arrays.Sorting.CycleSorting;

import java.util.Arrays;
public class CycleSortAlgo {
    public static void main(String[] args) {
         int[]arr={4,5,3,1,2};

        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i,correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }


    public static int[] swap(int[]arr, int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
        return arr;
    }
}
