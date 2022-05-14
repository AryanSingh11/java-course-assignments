package Recursion.easy;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        Print(n, 1);
    }

    static void Print(int n, int s){
        if(n==s){
            System.out.println(s);
            return;
        }
        System.out.println(s);
        Print(n,s+1);
    }
}
