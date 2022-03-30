package Arrays.VideoQuestions;

import java.util.Arrays;

public class LeetCodeEvenProblem {
    //link to problem:
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).

    public static void main(String[] args) {
        int[]nums = {555,901,482,1771};

        int s=0;
        int kk=34555;
        System.out.println((int)(Math.log10(kk))+1);
        for (int i = 0; i < nums.length; i++) {

            if(isEven(nums[i])==true){
                s++;
            }
        }
        System.out.println(s);
    }

    static boolean isEven(int x){
        String str=String.valueOf(x);
        char []ch=str.toCharArray();

        if(ch.length%2==0){
            return true;
        }
        return false;
    }


}
