package Functions.java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int n=in.nextInt();

        int s=0;
        for(int i=2; i<n; i++ ){
            if(n%i==0){
                s++;
                System.out.println(i);
            }
        }
        if(s>0){
            System.out.println("No of factors:"+" "+ s +" "+ "Not Prime");
        }else{
            System.out.println("PRIME HAI YEH TOH");
        }
    }
}
