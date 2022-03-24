package Functions.java;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        Swap(a,b);
    }

    public static void Swap(int a, int b){
        int temp=b;
        b=a;
        a=temp;
        System.out.println(a+" "+b);
    }
}
