package com.aryan;

public class ThreeSum {

    class Solution {
        public int[] threeSum(int[] nums) {
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    for(int k=j+1; k<nums.length; k++){
                        if(nums[i]+nums[j]+nums[k]==0){
                            return new int[]{i,j,k};
                        }
                    }
                }
            }
            return nums;
        }
    }

}
