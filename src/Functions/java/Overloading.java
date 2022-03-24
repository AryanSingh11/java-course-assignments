package Functions.java;

public class Overloading {
    public static void main(String[] args) {
        fun(34);
        fun("Aryan");
    }
    static void fun(String s){
        System.out.println(s);
    }
    static void fun(int n){
        System.out.println(n);
    }
}
