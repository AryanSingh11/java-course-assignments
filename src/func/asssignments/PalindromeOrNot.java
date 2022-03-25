package func.asssignments;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(isPalindrome(a));

    }

    public static boolean isPalindrome(int n){
        int original=n;
        int reverse = 0;

        while(n>0){

            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        return reverse==original;
    }
}


