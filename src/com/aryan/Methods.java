package com.aryan;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Sum();
        Sum();
    }

   public static void Sum(){
       int sum;
       Scanner in=new Scanner(System.in);
       int num1=in.nextInt();
       int num2=in.nextInt();
       sum=num2+num1;
       System.out.println(sum);
   }
}
