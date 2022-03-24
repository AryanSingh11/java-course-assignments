package com.aryan;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //initialisation, condition, Increment and decrement
//        for(int i=1;i<6;i+=2){
//            System.out.println(i);
//            System.out.println("Hello World");
//    }

        //print numbers from 1 to n
        Scanner input= new Scanner(System.in);
        int in= input.nextInt();
//
//        for(int i=1; i<=in; i+=1){
//            System.out.println(i);
//        }

        int num=1;
//        while(num<in){
//            num+=1;
//            System.out.println(num);

        do{
            System.out.println(num);
            System.out.println("Hello");
        }while(num !=1);
    }

}
