package Recursion.easy;

import java.util.Scanner;

public class OneToNPartTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        Print(n);
    }
    static void Print(int n){
        if(n==0){
            return;
        }

        Print(n-1);
        System.out.println(n);
    }
}
