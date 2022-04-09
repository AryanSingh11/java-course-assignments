package Arrays.BinarySearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class generatesRandomZeroSumArraysMast {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int[]arr=new int[n];

        printsSumZeroArray(arr, n);


    }

    public static int sumOfAll(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static int[] randomArr(int[]arr, int n){
        Random random=new Random();

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=-10+(int)(random.nextInt(21));
        }
        return arr;
        }


    public static void printsSumZeroArray(int []arr, int n){
        int i=10;
        while(true){

            int axr[];


            axr=randomArr(arr, n);

            if(sumOfAll(axr)==0){
                System.out.println(Arrays.toString(axr));
                i--;
            }
        }
    }


}
