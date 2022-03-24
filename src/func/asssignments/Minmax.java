package func.asssignments;

import java.util.Scanner;

public class Minmax {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        maximum(a,b,c);
    }

    public static void maximum(int a, int b, int c){
        int max=a;
        if(b>a && c<b){
            max=b;
        }else if(c>a && b<c){
            max=c;
        }else if(c>b && c>a){
            max=c;
        }

        System.out.println(max);
    }
}
