package com.aryan;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        //keep taking input and print out sum till user enters 0
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int factorial=1;

        for(int i=1; i<=n; i++){
            factorial*=i;
        }

        System.out.println(factorial);
    }
}
