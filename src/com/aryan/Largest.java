package com.aryan;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

//        int max=a;
//        if(b>max){
//           max=b;
//        }else if(c>max){
//            max=c;
//        }

        int max= Math.max(a, Math.max(b,c));
        System.out.println(max);
    }
}
