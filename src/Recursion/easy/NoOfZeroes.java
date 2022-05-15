package Recursion.easy;

import java.util.Scanner;

public class NoOfZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Zeroes(n);
        System.out.println(sum);
    }
    static int sum=0;
    static int Zeroes(int n){
        if(n==0){
            return sum;
        }

        int rem=n%10;
        if(rem==0){
            sum++;
        }
        return Zeroes(n/10);
    }
}
