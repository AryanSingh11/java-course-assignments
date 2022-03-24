package func.asssignments;

import java.util.Scanner;

public class PrimeOrNotMethod {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        primeFunction(n);

    }

    public static void primeFunction(int a) {
        int s=0;
        for(int i=2;i<a;i++){
            if(a%i==0) {
                s++;
            }
        }
        if(s>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }

}
