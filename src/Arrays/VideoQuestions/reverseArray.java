package Arrays.VideoQuestions;

import java.util.Arrays;

//in this were reversing a given Array
public class reverseArray {
    public static void main(String[] args) {
        int[]arr={12,45,67,96,70,27,61,234,4566666};
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
    }

    static void reverseArr(int[]toBeReversed){
      int start=0;
      int end=toBeReversed.length-1;

      while(start<end){
          int temp=toBeReversed[start];
          toBeReversed[start]=toBeReversed[end];
          toBeReversed[end]=temp;
          start++;
          end--;
          //this is a 2 pointer approach bec start && end are the 2 pointers here
      }
        System.out.println(Arrays.toString(toBeReversed));
    }

}
