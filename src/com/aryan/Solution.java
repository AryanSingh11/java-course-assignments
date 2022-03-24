package com.aryan;

public class Solution {

//you've been given a number. Find the difference between the product of its digit and sum

        public static  int subtractProductAndSum(int n) {
            int sum=0;
            int product=1;


            while(n>0){
                int rightMost=n%10;
                sum+=rightMost;
                product*=rightMost;
                n/=10;
            }
            return product-sum;
        }

}
