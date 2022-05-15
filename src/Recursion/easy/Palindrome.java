package Recursion.easy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Reverse(n);
        if(n==sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    static int sum =0;
    static int Reverse(int n){
        if(n%10==0){
            return sum;
        }

        int rem= n%10;
        sum=sum*10 + rem;
        return Reverse(n/10);
    }
}
