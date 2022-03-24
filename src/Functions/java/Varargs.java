package Functions.java;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        //When you create a method that takes  a variable no. of arguments
        fun(56,67,89,43,24,45,44,76,82);
        multiple(32,34,"Aryan", "Singh");
    }

    static void multiple(int a, int b, String...s){

    }

    static void  fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
