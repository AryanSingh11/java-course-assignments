package Arrays.BinarySearch;

import java.util.Arrays;

public class reversal {
    public static void main(String[] args) {
        int []arr={12,43,56,82,90,87,21,998};
        System.out.println(Arrays.toString(reversal(arr)));
    }

         public static int[] reversal(int[] arr){
        int[]rarr=new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            rarr[i]=arr[(arr.length-1)-i];
        }
        return rarr;
    }
}
