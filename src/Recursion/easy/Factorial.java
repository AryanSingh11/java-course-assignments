package Recursion.easy;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int ans = Factorial(n);

        System.out.println(ans);
    }

    static int Factorial(int n){

        if(n<=1){
            return 1;
        }

        //recurrence relation

        return  n*Factorial(n-1);

    }
}
