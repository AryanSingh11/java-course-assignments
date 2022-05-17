package Recursion.easy;

import java.util.Scanner;

public class Practise {
    static int sum=0;
    static int Sum(int n){
        if(n==0){
            return sum;
        }

        if(n%2==0){
            n/=2;
            sum++;
        }else{
            n=n-1;
            sum++;
        }
        return Sum(n);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Sum(n);
        System.out.println(sum);
    }
}
