package Recursion.easy;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        Print(n);
    }

    static void Print(int n){

        if(n==1){
            System.out.println(1);
            return;
        }

        System.out.println(n);
        Print(n-1);
    }
}
