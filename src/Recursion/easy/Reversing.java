package Recursion.easy;

public class Reversing {

    static int sum=0;
    static int rev1(int n){
        if(n==0){
            return  sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return rev1(n/10);
    }

    //sometimes you might need additional variables in arguement
    //in that case, make additional function
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }

        int rem= n%10;
        return rem* (int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        rev1(9087);
        System.out.println(sum);
        System.out.println(rev2(9087));

    }


}
