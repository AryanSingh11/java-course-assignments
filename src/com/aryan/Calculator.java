package com.aryan;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        int ans=0;

       while(true){

           char op= in.next().trim().charAt(0);

           if(op=='+'|| op=='-' ||op=='/'|| op=='*'){
               int num1=in.nextInt();
               int num2=in.nextInt();

               if(op=='+'){
                  ans=(num1+num2);
               }else if(op=='-'){
                   System.out.println(num1-num2);
               }else if(op=='/'){
                   ans=(num1/num2);
               }else{
                   ans=(num1*num2);
               }
           }else if(op=='x' || op=='X'){
               break;
           }else{
               System.out.println("Invalid Operator");
               break;
           }
           System.out.println(ans);
       }

    }

}
