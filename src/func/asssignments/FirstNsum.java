package func.asssignments;

import java.util.Scanner;

public class FirstNsum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        sum(a);
    }

    public static void sum(int n){
        int sum=0;
        for(int i=1;  i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}