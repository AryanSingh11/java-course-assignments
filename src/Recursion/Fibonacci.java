package Recursion;

import java.util.Scanner;


//this program takes b as an input and prints bth fibonacci number as an output
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b= in.nextInt();
        int n=2;

        sumOfLastTwo(0,1,b, n);
    }

    static void sumOfLastTwo(int first, int second, int b, int n){
        if(b==n){
            System.out.println(second);
            return;
        }

        int sum= first+second;
        //System.out.println(sum);

        sumOfLastTwo(second, sum, b, n+1);
        //second = sum;

    }
}
