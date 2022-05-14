package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        Print(1);
    }

    static void Print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
}
