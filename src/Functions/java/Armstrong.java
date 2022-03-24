package Functions.java;

import java.util.Scanner;

public  class  Armstrong {
    //Print all 3 digit Armstrong Numbers
    public static void main(String[] args) {
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while(n>0){

            int rem=n%10;
            int cube=rem*rem*rem;
             sum+=cube;
             n/=10;
        }
        return  sum==original;
    }

}
