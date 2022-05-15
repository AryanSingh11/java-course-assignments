package Recursion.easy;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        System.out.println(Product(n));
    }

    static int Product(int n){
        if(n%10==n){
            return n;
        }

        return (n%10)* Product(n/10);
    }
}
