package Arrays.VideoQuestions;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {

        int[][]arr={
                {21,46,35,43},
                {12,35,60,80,43},
                {32,90,41,67},
                {6,33},
                };

        int target=35;

        int[]ans=search2D(target, arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2D(int target, int[][]Arr){
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if(Arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

















