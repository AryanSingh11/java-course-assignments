package com.aryan;

public class Main {
    public static void main(String[] args){
        /*
        syntax of if statements:
            if (boolean expression){
                    body
            }else{

            }
         */

        int salary=25400;
        if(salary>10000){
            salary+=600;
        }else{
            salary+=40000;
        }
        System.out.println(salary);
    }
}
