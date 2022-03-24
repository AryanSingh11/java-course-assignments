package func.asssignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        evenMethod(n);

    }

    public static void evenMethod(int a){
       if(a%2==0){
           System.out.println("Even");
       }else{
           System.out.println("Odd");
       }
    }
}



