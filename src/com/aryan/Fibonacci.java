package com.aryan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
     //Q:Find the nth Fibonacci Number

        int n1=0;
        int n2=1;
        int n3;
        int i;

        Scanner in=new Scanner(System.in);
        int count=in.nextInt();

        for(i=2;i<=count;i++){
            n3=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=n3;

        }
    }
}
