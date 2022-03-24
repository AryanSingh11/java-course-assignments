package com.aryan;

import java.util.Scanner;


//made as an infinite loop. Keep entering value, it'll keep answering it

public class Palindrome {
    public static void main(String[] args) {
        int rem;
        int reverse=0;
        int n;
        Scanner in=new Scanner(System.in);


      while(true){
          n=in.nextInt();

          while(n>0){
              rem=n%10;
              //*= +rem worked out fine. Use it whenever you can.
              reverse*=10+rem;
              n/=10;
          }

          if(reverse==n){
              System.out.println("Palindrome");
          }else{
              System.out.println("Not PALINDROME");
          }

      }



    }
}
